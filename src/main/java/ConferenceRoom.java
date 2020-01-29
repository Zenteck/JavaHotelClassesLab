import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> occupants;

    public ConferenceRoom(String name, int capacity, ArrayList<Guest> occupants){
        this.name = name;
        this.capacity = capacity;
        this.occupants = occupants;
    }


    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
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
