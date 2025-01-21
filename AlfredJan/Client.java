
public class Client{
   
   private String name;
   private String phoneNumber;
   private String email;  
   private String roomType;
   private String numberOfNights;

   public Client(String name, String phoneNumber, String email){
      setName(name);
      setPhoneNumber(phoneNumber);
      setEmail(email);
    
	}
   public void setName(String name){this.name = name;}
   public String getName(){return name;}

   public void setEmail(String email){this.email = email;}
   public String getEmail(){return email;}

   public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
   public String getPhoneNumber(){return phoneNumber;}

      static String[] userData = new String[6]; 

   public String[] create(String name, String email, String phoneNumber, String password){
      
      System.out.print("Enter your name:");
      String userName = input.nextLine();
      userData[0] = userName
      System.out.print("Enter your email:");
      String userEmail = input.nextLine();
      boolean done = false;
      do{
         try{
            emailSplit = userEmail.split("@");
            emailTwo = emailSplit[1](".");
            done = true;
    
	}
         catch(Exception e){
            System.out.print("Invalid Input try entering email again: ");
  
	}
      while(done == false);
      userData[1] = userEmail
      System.out.print("Enter phone number: ");
      String phoneNumber = input.next();
      Boolean check = false;
      do{
         try{
            int[] checker = new int[11];
            for(int number = 0; number < phoneNumber.length(); number++){
               checker[number] = phoneNumber.charAt(number) - '0';
                
		}
            if ((checker[0] == 0) check = true;
                  

	}
      catch(Exception e){
         System.out.print("Invalid input try again");   
	}            
		}   
      while(check == false);
  
      userData[2] = phoneNumber;
      System.out.print("Enter password a 4 digit: ");
      String password = input.next();
      while (password < 4 & password > 4){
         System.out.print("Enter password a 4 digit: ");
         String password = input.next();
		}
      userData[3] = password;
    
	}

   public static void userOptions(){
      System.out.print(""" 
What would you like to do:
1. Book a room
2. cancel reservations
3. View available rooms
4. logout
""")
	}
   public String[] roomBook()

}