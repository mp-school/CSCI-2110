/*
 * 
 * Code	Example 4:	Static	variables and methods
 * TODO
        The objective is to design a Bank Account class that has a combination of static variables, instance variables, static methods
        and non-static methods. Implement a BankAccount class with the following specifications:

        Instance variables name and balance done

        Static variables interest rate and number of accounts, both set to 0. done

        A constructor which sets the name and balance, and increments number of accounts. done

        A static method to set the interest rate done
        
        A static method to get the interest rate done

        A static method to get the number of accounts done

        A non-static method to deposit an amount done

        A non-static method to withdraw an amount done

        A non-static method to add interest done

        A non-static method to get the balance. done

        A non-static method to set the balance. done

        A non-static method to transfer funds to another account. done

        A non-static toString method done

    Test the BankAccount class by creating five Bank Accounts, depositing amounts into each, adding interest , withdrawing amounts
    and transferring funds. Print the individual accounts as well as static variable that indicates the number of accounts created.

 * 
 * 
 */


import java.util.*;

public class Module1_LecEx4{
   
// instance vars

private String name;
private double balance;
private static double rate = 0;
private static int numOfAccounts = 0;


public Module1_LecEx4(String n, double b){

// consturctor

// non static
    n = this.name;
    b = this.balance;

//static
   numOfAccounts++;

}
   
// getters and setters
    public double getRate(){return rate;}
    public void setRate(double r){r = this.rate;}
    public int getNumOfAccounts(){return numOfAccounts;}
    public double getBalance(){return balance;}
    public void setBalance(double b){b = this.balance;}


// deposist
    public double dep(double amount){

        double total = balance + amount;
        balance = total;

        return total;
    }
   
   
    public double withdraw(double amount){

        double total = balance - amount;
        balance = total;

        return total;
    }
   
   
    public double addIntrest (double rate){

        double total = balance * rate;
        balance = total;

        return total;
    }
   
   public void transfer(double amount){
    
    double bal = b.getBalance();
    
    if (amount > this.balance){
        System.out.println("Insufficient funds. Can't transfer");
    
    }else{
        this.balance = this.balance - amount;
        b.setBalance(bal + amount);
    }

    } 

   
   public String toString(){
        return " { Name: " + name + "}" + "{ Current Balance:  " + getBalance() + "}";
   }
   
   
   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
   
        System.out.println("Welcome to ScotiaBank, How can we help you today?");
        System.out.println("Press 1 to see current balance");
        System.out.println("Press 2 to deposit funds");
        System.out.println("Press 3 to withdraw funds");
        System.out.println("Press 4 to transfer funds");
        System.out.println("Press 5 to add intrest");
        System.out.println("Press 6 to exit");
 
        // create a switch loop for input
        String ui = in.next();


        Module1_LecEx4 A = new Module1_LecEx4("Megan", 20);
        Module1_LecEx4 B = new Module1_LecEx4("Keko", 40);
        Module1_LecEx4 C = new Module1_LecEx4("Mika", 80);

        // ui
        while(ui != "6"){

        System.out.println("What Account would you like to use, A, B or C?");
        Sring accountName = in.next();
    
        if (ui.equals("1")){

            System.out.println(A.getBalance()); // check balance

            System.out.println("Press 1 to see current balance");
            System.out.println("Press 2 to deposit funds");
            System.out.println("Press 3 to withdraw funds");
            System.out.println("Press 4 to transfer funds");
            System.out.println("Press 5 to add intrest");
            System.out.println("Press 6 to exit");
            
            ui = in.next();
       
        } else if(ui.equals("2")){ // depoist

            System.out.println("How much woould you like to deposit? : ");
            double depoistFUnds = in.nextDouble();
            A.dep(depoistFUnds);

            System.out.println("Press 1 to see current balance");
            System.out.println("Press 2 to deposit funds");
            System.out.println("Press 3 to withdraw funds");
            System.out.println("Press 4 to transfer funds");
            System.out.println("Press 5 to add intrest");
            System.out.println("Press 6 to exit");
            
            ui = in.next();
           

        } else if(ui.equals("3")){ // withdraw

            System.out.println("How much woould you like to withdraw? : ");
            double withdrawFUnds = in.nextDouble();
            A.withdraw(withdrawFUnds);

            System.out.println("Press 1 to see current balance");
            System.out.println("Press 2 to deposit funds");
            System.out.println("Press 3 to withdraw funds");
            System.out.println("Press 4 to transfer funds");
            System.out.println("Press 5 to add intrest");
            System.out.println("Press 6 to exit");
            
            ui = in.next();
            
        } else if(ui.equals("4")){ // transfer

            System.out.println("How much woould you like to transfer? : ");
            double trasnferFUnds = in.nextDouble();
            A.transfer(trasnferFUnds);

            System.out.println("Press 1 to see current balance");
            System.out.println("Press 2 to deposit funds");
            System.out.println("Press 3 to withdraw funds");
            System.out.println("Press 4 to transfer funds");
            System.out.println("Press 5 to add intrest");
            System.out.println("Press 6 to exit");
            
            ui = in.next();
           

        } else if(ui.equals("5")){ // add intrest
            System.out.println("What is the intrest rate? : ");
            double intrest = in.nextDouble();

            A.addIntrest(intrest);

            System.out.println("Press 1 to see current balance");
            System.out.println("Press 2 to deposit funds");
            System.out.println("Press 3 to withdraw funds");
            System.out.println("Press 4 to transfer funds");
            System.out.println("Press 5 to add intrest");
            System.out.println("Press 6 to exit");
            
            ui = in.next();
            

        } else{ // exit
            System.out.println("Exiting System, Have a good day!");
            break;
        }
        
       
         
        }

       
    }
   
}