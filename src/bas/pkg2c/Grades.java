
package bas.pkg2c;


public class Grades {
     int id;
    String name;
    Double pre, mid, pf, f;
   
    public void addGrades ( int id, String name, double pr, double m, double pf, double f){
       
     this.id = id;
     this.name = name;
     this.pre = pr;
     this.mid = m;
     this.pf = pf;
     this.f = f;
       
    }
   
    public void viewGrades (){
       
        double ave = (this.pre + this.mid + this.pf + this.f)/4;
        String Remarks = (ave > 3.0) ? "Failed" : "Passed";
       
         System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10s \n",
         this.id, this.name, this.pre, this.mid, this.pf, this.f, ave, Remarks);
    }
    
}
