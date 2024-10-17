
package feedback2b;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Feedback2B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;

            do{
            System.out.println("1. ADD FEEDBACK");
            System.out.println("2. VIEW FEEDBACK");
            System.out.println("3. UPDATE FEEDBACK");
            System.out.println("4. DELETE FEEDBACK");
                System.out.println("5. EXIT");
            System.out.print("Enter Action: ");
            int action = sc.nextInt();

            switch(action){
                case 1:
                    addMenu();
                    break;
                case 2:      
                    break;    
               case 3:
                    break;     
               case 4:
                    break;
            }

            System.out.println("Do you want to continue? (Y/N): ");
            response = sc.next();
        
        }while(response.equalsIgnoreCase("y"));
    
    }

public static void addMenu(){
    
    Scanner sc = new Scanner(System.in);
    
       System.out.print("First Name: ");
        String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("Feedback: ");
        String fback = sc.next();
        System.out.print("Date (yyyy-mm-dd): ");
        String date = sc.next();
        
        int rate = 0;
        while (rate < 1 || rate > 5) {
            System.out.print("Rating (1 to 5): ");
            rate = sc.nextInt();
            if (rate < 1 || rate > 5) {
                System.out.println("Please enter a valid rating between 1 and 5.");
            }
        }
1
        
        
}
}