public class Room{

   private String roomNumber;
   private String roomType;
   private double pricePerNight;
   
   
   public Room(String roomNumber, String roomType, String pricePerNight){
      setRoomNumber(roomNumber);
      setRoomType(roomType);
      setPricePerNight(pricePerNight);
	}

   public void setRoomNumber(String roomNumber) {this.roomNumber = roomNumber;}
   public String getRoomNumber() {return roomNumber;}

   public void setRoomType(String roomType) {this.roomType = roomType;}
   public String getRoomType() {return roomType;}

   public void setPricePerNight(String pricePerNight) {this.pricePerNight = pricePerNight;}
   public String getPricePerNight() {return pricePerNight;}
  

   

}