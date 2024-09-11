
package bas.pkg2c;

import java.util.Scanner;


public class netpay {
     public void getPay(){
       Scanner input = new Scanner (System.in);
        String name ;
          int age;
          double rate;
          double rpp;
          double td;
          int hw;
     
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter Rate per hour: ");
        rpp = input.nextDouble();
        System.out.print("Enter total hours worked: ");
        hw = input.nextInt();
        System.out.print("Enter total dedeuctions: ");
        td = input.nextDouble();
        
        System.out.println("\n-----------------------------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("-----------------------------------------------");
       
       
       
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        double totals = rpp * hw;
        System.out.println("Total Gross: "+ totals);
        System.out.println("Total deduction: "+ td );
        System.out.println("-----------------------------------------------");
        System.out.println("Net Pay: "+( totals - td ));
        System.out.println("-----------------------------------------------");
         
    }
}
