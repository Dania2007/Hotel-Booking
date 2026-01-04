package Hotel;

import java.util.ArrayList;
import java.util.List;

class Room{
	
	int roomNo;
	boolean isbooked=false;
	
	Room(int roomNo){
		this.roomNo=roomNo;
	}
}


 class Booking{
	 
	 List<Room> rooms = new ArrayList<>();

	    Booking() {
	        for (int i = 1; i <= 5; i++) {
	            rooms.add(new Room(i));
	        }
	    }
	 
	 public void roomAvail() {
		 for (Room r : rooms)   {
	            if (!r.isbooked)
	                System.out.println("Room " + r.roomNo + " is available");
		   }
	 }
		    void bookRoom(int roomNo) {
		        for (Room r : rooms) {
		            if (r.roomNo == roomNo && !r.isbooked) {
		                r.isbooked = true;
		                System.out.println("Room booked successfully");
		                return;
		            }
		        }
		    }
 
 }

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking hotel = new Booking();
        hotel.roomAvail();
        hotel.bookRoom(2);

	   }
    }
