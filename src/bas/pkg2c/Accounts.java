
package bas.pkg2c;


public class Accounts {
        int a_id;
        String fname, lname, email, user, pass;

    public void addAccounts(int id, String Fname, String Lname, String emailAdd, String username, String password){
        
                this.a_id = id;
                this.fname = Fname;
                this.lname = Lname;
                this.email = emailAdd;
                this.user = username;
                this.pass = password;
    }
    
    
    
      public void viewAccounts(){
            System.out.printf("%-5d %-10s %-10s %-20s %-10s %-10s\n",a_id, fname, lname, email, user, pass);
           
            }   
}
