
package bas.pkg2c;

import java.util.Scanner;


public class MAIN {

   
    public static void main(String[] args) {
       
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Netpay");
            System.out.println("2. Grades");
            System.out.println("3. Products");
            System.out.println("4. Salaries");
            System.out.println("5. Accounts");
            
            System.out.print("Enter number (1-5): ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 5) {
                    break; 
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.next(); 
            }
        }

        System.out.println("\n");
        switch (choice) {
            case 1:
                netpay np = new netpay();
                np.getPay();
                break;
            case 2:
                Grade grp = new Grade();
                grp.genGrade();
                break;
            case 3:
                Product pro = new Product();
                pro.inputProduct();
                break;
            case 4:
                 Salary sal = new Salary();
                 sal.Inputsalary();
                
                break;
            case 5:
                Account ac = new Account();
                ac.Inputaccounts();
                break;
            default:
                
                System.out.println("Unexpected error.");
                break;
        }
    }
        
        
        
        
        
        
        
        
}
    

