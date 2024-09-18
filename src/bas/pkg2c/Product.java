
package bas.pkg2c;

import java.util.Scanner;


public class Product {
     public void inputProduct() {
        
        Scanner sc = new Scanner(System.in);
        Products[] pro = new Products[100];
        
        System.out.print("Enter no. of Products: ");
        int nums = sc.nextInt();
        
        for (int i = 0; i < nums; i++) {
            
            System.out.println("Enter Product Details " + (i + 1) + ":");
            System.out.print("ID: ");
            int Pid = sc.nextInt();
            System.out.print("Product name: ");
            String Pname = sc.next();
            System.out.print("Product sold: ");
            int Psold = sc.nextInt(); 
            System.out.print("Product stock: ");
            int Pstock = sc.nextInt();
            System.out.print("Product price: ");
            double Pprice = sc.nextDouble(); 
            
            pro[i] = new Products();
            pro[i].addProduct(Pid, Pname, Psold, Pstock, Pprice);
        }
        
        for (int i = 0; i < nums; i++) {
            pro[i].viewProduct();
        }
        
        sc.close(); 
    }

   
    }

