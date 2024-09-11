
package bas.pkg2c;


public class Products {
      int id, sold, stock;
     String name;
     double price;
     
     public void addProduct (int Pid, String Pname, int Psold, int Pstock, double Pprice){
         
       this.id = Pid;
         this.name = Pname;
         this.sold =  Psold;
         this.stock =  Pstock;
         this.price = Pprice;
       
     }
     
     public void viewProduct(){
         
         double Profit = this.sold*this.price;
         String Status = (this.sold < 1) ? "out-of-stock" : "available";
         double TEP = this.stock * this.price;
         
         System.out.printf("%-10d %-10s %-10d %-10d %-10.2f %-10.2f %-10s %-10.2f\n", this.id, this.name, this.sold, this.stock, this.price, Profit, Status, TEP);
         
         
     
     }

}
