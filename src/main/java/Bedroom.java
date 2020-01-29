import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> occupants;

    public Bedroom(int roomNumber, int capacity, String type, ArrayList<Guest> occupants){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.occupants = occupants;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public int countOccupants() {
        return this.occupants.size();
    }


    public boolean addGuest(Guest guest) {
        if(this.getCapacity() > this.countOccupants()){
            return this.occupants.add(guest);
        } else {
            return false;
        }
    }
}
