package Assignments.A4;
import java.io.*;
import java.util.*;

public class Merged {
    public static <T extends Comparable<T>> OrderedList<T> merge(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> result = new OrderedList<>();
        int f1 = 0;
        int f2 = 0;

        // Continue until we reach the end of either list
        while (f1 < list1.size() && f2 < list2.size()) {
            T item1 = list1.get(f1);
            T item2 = list2.get(f2);
            int comparison = item1.compareTo(item2);

            if (comparison <= 0) {
                result.add(item1);
                f1++;
                if (comparison == 0) {
                    f2++;
                }
            } else {
                result.add(item2);
                f2++;
            }
        }

        // Add remaining elements from list1
        while (f1 < list1.size()) {
            result.add(list1.get(f1));
            f1++;
        }

        // Add remaining elements from list2
        while (f2 < list2.size()) {
            result.add(list2.get(f2));
            f2++;
        }

        return result;
    }

    public static <T extends Comparable<T>> OrderedList<T> common(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> result = new OrderedList<>();
        int f1 = 0;
        int f2 = 0;

        while (f1 < list1.size() && f2 < list2.size()) {
            T item1 = list1.get(f1);
            T item2 = list2.get(f2);
            int comparison = item1.compareTo(item2);

            if (comparison == 0) {
                result.add(item1);
                f1++;
                f2++;
            } else if (comparison < 0) {
                f1++;
            } else {
                f2++;
            }
        }

        return result;
    }

    public static <T extends Comparable<T>> OrderedList<T> difference(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> result = new OrderedList<>();
        int f1 = 0;
        int f2 = 0;

        while (f1 < list1.size() && f2 < list2.size()) {
            T item1 = list1.get(f1);
            T item2 = list2.get(f2);
            int comparison = item1.compareTo(item2);

            if (comparison < 0) {
                result.add(item1);
                f1++;
            } else if (comparison > 0) {
                f2++;
            } else {
                f1++;
                f2++;
            }
        }

        // Add remaining elements from list1
        while (f1 < list1.size()) {
            result.add(list1.get(f1));
            f1++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        // Read RandomNames.txt
        ArrayList<String> allNames = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("RandomNames.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    allNames.add(line.trim());
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Create list1
        System.out.print("Enter n1 (between 1000 and 1500): ");
        int n1 = scanner.nextInt();
        OrderedList<String> list1 = new OrderedList<>();
        Set<String> usedNames1 = new HashSet<>();
        
        while (usedNames1.size() < n1) {
            String randomName = allNames.get(random.nextInt(allNames.size()));
            if (usedNames1.add(randomName)) {
                list1.add(randomName);
            }
        }

        // Create list2
        System.out.print("Enter n2 (between 1000 and 1500): ");
        int n2 = scanner.nextInt();
        OrderedList<String> list2 = new OrderedList<>();
        Set<String> usedNames2 = new HashSet<>();
        
        while (usedNames2.size() < n2) {
            String randomName = allNames.get(random.nextInt(allNames.size()));
            if (usedNames2.add(randomName)) {
                list2.add(randomName);
            }
        }

        // Merge lists and write to files
        writeListToFile(merge(list1, list2), "merged.txt");
        writeListToFile(common(list1, list2), "common.txt");
        writeListToFile(difference(list1, list2), "difference.txt");
    }

    private static void writeListToFile(OrderedList<String> list, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < list.size(); i++) {
                writer.println(list.get(i));
            }
        }
    }
}

// test cases
// Amar, Boris, Charlie, Dan, Fujian, Inder, Pei, Travis
// Alex, Betty, Charlie, Dan, Travis, Zola, Zulu