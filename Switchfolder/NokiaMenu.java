import java.util.Scanner;

public class NokiaMenu{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println(" 1. Phone book \n 2. Messages \n 3. Chat \n 4. Call messenger \n 5. Tone \n 6. Settings \n 7. Call divert \n 8. Games \n 9. Calculator \n 10. Reminders \n 11. Clock \n 12. Profiles \n 13. SIM services");
      int answer = input.nextInt();

      switch(answer){
      
      case 1:
      System.out.println(" 1. Search \n 2. Service Nos \n 3. Add name \n 4. Erase \n 5. Edit \n 6. Assign tone \n 7. Send b'card \n 8. Options \n 9. Speed dials \n 10. oice tags");
      int phoneBook = input.nextInt();
          
         switch(phoneBook){
            case 1:
            System.out.println("Search");
            break;

            case 2:
            System.out.println("Service Nos");
            break;

            case 3:
            System.out.println("Add name");
            break;

            case 4:
            System.out.println("Erase");
            break;

            case 5:
            System.out.println("Edit");
            break;

            case 6:
            System.out.println("Options");
            break;

            case 7:
            System.out.println("Send b'card");
            break;

            case 8: 
               System.out.println(" 1. Type of view \n 2. Memory Status");
               int optionsInput = input.nextInt();
    
               switch(optionsInput){
               case 1:
               System.out.println("Type of view");
               break;

               case 2:
               System.out.println(" Memory Status");
               break;
                                   }
            break;
            case 9:
            System.out.println("Speed dials ");
            break; 

            case 10:
            System.out.println("Voice tags ");
            break;  }      
      break; 

                          
      case 2:
         System.out.println(" 1. Write messages \n 2. Inbox \n 3. Outbox \n 4. Picture messages \n 5. Templates \n 6. Smileys \n 7. Messages settings \n 8. Info service \n 9. Voice mailbox number \n 10. Service command editor ");
         int message = input.nextInt();
            
            switch(message){
               case 1:
               System.out.println("Write messages ");
               break;

               case 2:
               System.out.println("Inbox");
               break;

               case 3:
               System.out.println("Outbox");
               break;

               case 4:
               System.out.println("Picture messages");
               break;

               case 5:
               System.out.println("Templates");
               break;

               case 6:
               System.out.println("Smileys");
               break;

               case 7:
               System.out.println(" 1. Set 1, \n 2. Common");
               int messageSettings = input.nextInt();
                  switch(messageSettings){

                     case 1:
                        System.out.println(" 1. Message center number \n 2. Message sent as \n 3. Message validity");
                        int set_One = input.nextInt();
                           switch(set_One){
                              case 1:
                              System.out.println("Message center number");
                              break;
      
                              case 2:
                              System.out.println("Message sent as");
                              break;  
                              
                              case 3: 
                              System.out.println("Message Validity");
                              break; }
                        break;           
                                      
                 
                     
                     case 2:
                     System.out.println(" 1. Delivery reports \n 2. Reply via same center \n 3. Character support");
                     int setOne = input.nextInt();
                        switch(setOne){
                           case 1:
                           System.out.println("Delivery reports ");
                           break;
      
                           case 2:
                           System.out.println("Reply via same center");
                           break;  
                              
                           case 3: 
                           System.out.println("Character support");
                           break; }
                     break; 

                         }                
                  break;       

               case 8:
               System.out.println("Info service");
               break;

               case 9:
               System.out.println("Voice mailbox number");
               break;

               case 10:
               System.out.println("Service command editor");
               break;
               }
         break;
              
            

      case 3:
      System.out.println("Chat");
      break; 

      case 4:
      System.out.println(" 1. Missed calls \n 2. Received calls \n 3. Dialed numbers \n 4. Dialed numbers \n 5. Show call duration \n 6. Show call cost \n 7. Call cost Setting \n 8. Prepaid credit");
      int callMessenger = input.nextInt();
         switch(callMessenger){
            
            case 1:
            System.out.println("Service command editor");
            break;

            case 2:
            System.out.println("Received calls");
            break;

            case 3:
            System.out.println("Dialed numbers");
            break;  

            case 4:
            System.out.println("Erase recent call lists");
            
            case 5:
            System.out.println(" 1. Last call Duration \n 2. All calls duration \n 3. Received calls duration \n 4. Dailed calls duration \n 5. Clear timers");
            int showCallDuration = input.nextInt();
               switch(showCallDuration){
                  case 1:
                  System.out.println("Last call Duration");
                  break;                    
                       
                  case 2:
                  System.out.println("All calls duration");
                  break;                    
                        
                  case 3:
                  System.out.println("Received calls duration");
                  break; 
       
                  case 4:
                  System.out.println("Dailed calls duration");
                  break;            
                  
                  case 5:
                  System.out.println("Clear timers");
                  break;
                                       }
            break;                 
                                       
            
            case 6: 
            System.out.println(" 1. last call cost \n 2. All call cost \n 3. Clear counters");
            int showCallCost = input.nextInt();
               switch(showCallCost){
                  case 1:
                  System.out.println("last call cost");
                  break;                    
                       
                  case 2:
                  System.out.println("All call cost");
                  break;                    
                        
                  case 3:
                  System.out.println("Clear counters");
                  break;
                                   }
            break;
                      

            case 7:
            System.out.println(" 1. Last call costs \n 2. Show costs in");
            int callCostSetting = input.nextInt();
               switch(callCostSetting){
                  case 1:
                  System.out.println("Last call costs");
                  break;                    
                       
                  case 2:
                  System.out.println("Show costs in");
                  break;  
                                   }

            break;
            case 8:
            System.out.println("Prepaid credit");
            break; }
         break;
      case 5:
      System.out.print(" 1. Ringing tone \n 2. Ringing Volume \n 3. Incoming call alert \n 4. Composers \n 5. Message alert \n 6. Keypad tones \n 7.Warning and game tones \n 8. Vibrating alert 9. Screen Savers ");
      int tones = input.nextInt();
         switch(tones){
            case 1:
            System.out.println("Ringing tone");
            break;

            case 2:
            System.out.println("Ringing Volume");
            break;  

            case 3:
            System.out.println("Incoming call alert");
            break;  

            case 4:
            System.out.println("Composers");
            break;  
            case 5:
            System.out.println("Message alert");
            break;  

            case 6:
            System.out.println("Ringing tone");
            break;  

            case 7:
            System.out.println("Warning and game tones ");
            break;  

            case 8:
            System.out.println("Vibrating alert");
            break;  

            case 9:
            System.out.println("Screen Savers");
            break;        
        
                      }
   
      break;

      case 6:
      System.out.println(" 1. Call settings \n 2. Phone Settings \n 3. Security settings \n 4. Restore factory settings");
      int settings = input.nextInt();
         switch(settings){
            case 1:
            System.out.println(" 1. Automatic redial \n 2. Speed dialing \n 3. Call waiting option \n 4. Own number sending \n 5. Phone line in use \n 6. Automatic answer");
            int callSetting = input.nextInt(); 
               switch(callSetting){
                  case 1:
                  System.out.println("Automatic redial");
                  break;  

                  case 2:
                  System.out.println("Speed dialing");
                  break; 
                  
                  case 3:
                  System.out.println("Call waiting option");
                  break; 

                  case 4:
                  System.out.println("Own number sending");
                  break; 

                  case 5:
                  System.out.println("Phone line in use");
                  break; 

                  case 6:
                  System.out.println("Automatic answer ");
                  break;                              
                   
                                  }
         break;
            case 2:
            System.out.println(" 1. Language \n 2. Call info display \n 3. Welcome note \n 4. Network Selection \n 5. Lights \n 6. Confirm SIM service action");
            int callSecuritySettings = input.nextInt();
               switch(callSecuritySettings){
                  case 1:
                  System.out.println("Language");
                  break; 

                  case 2:
                  System.out.println("Call info display");
                  break; 

                  case 3:
                  System.out.println("Welcome note");
                  break; 

                  case 4:
                  System.out.println("Network Selection");
                  break; 

                  case 5:
                  System.out.println("Lights");
                  break; 

                  case 6:
                  System.out.println("Confirm SIM service action");
                  break;
                                            }
            break;
            case 3:
            System.out.println(" 1.PIN code request \n 2. Call barring service \n 3. Fixed dialing \n 4. closed user group \n 5. Phone security \n 6. Change access codes");
            int restoreFactorySetting = input.nextInt();
               switch(restoreFactorySetting){
                  case 1:
                  System.out.println("PIN code request");
                  break; 

                  case 2:
                  System.out.println("Call barring service");
                  break; 

                  case 3:
                  System.out.println("Fixed dialing");
                  break; 

                  case 4:
                  System.out.println("closed user group");
                  break; 

                  case 5:
                  System.out.println("hone security");
                  break; 

                  case 6:
                  System.out.println("Change access codes");
                  break;    
                                            }
            break;
            case 4:
            System.out.println("Restore factory settings");
            break; 
                                 }
      
         break;
      case 7:
      System.out.println("Call divert");
      break;  
      case 8:
      System.out.println("PIN code request");
      break;
      case 9:
      System.out.println("PIN code request");
      break; 
      case 10:
      System.out.println("PIN code request");
      break; 
      case 11:
      System.out.println(" 1. Alarm clock \n 2. Clock setting \n 3. Date setting \n 4. Stopwatch \n 5. Countdown timer \n 6. Auto update of date and time");
            int clock = input.nextInt();
               switch(clock){
                  case 1:
                  System.out.println("Alarm clock");
                  break; 

                  case 2:
                  System.out.println("Clock setting");
                  break; 

                  case 3:
                  System.out.println("Date setting");
                  break; 

                  case 4:
                  System.out.println("Stopwatch");
                  break; 

                  case 5:
                  System.out.println("Countdown timer");
                  break; 

                  case 6:
                  System.out.println("Auto update of date and time");
                  break;    
                                            }
            break;
        
      case 12:
      System.out.println("Profiles");
      break; 
      case 13:
      System.out.println("SIM services");
      break; 
}

}  
}
