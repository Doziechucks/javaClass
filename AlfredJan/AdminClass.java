public class AdminClass extends Client {
   
   private String password;

   public AdminClass(String password, String name, String phoneNumber, String email){
     super(name, phoneNumber, email);
	setPassword(password);
	} 

   public void setPassword(String password){this.password = password;}
   public String getPassword(){return password;}
 

   public String[] adminLogin(){
      

	}    

} 