
import java.util.ArrayList;
/* This is a stub for the House class */
/** This class represents a building of type house
* This specific building has residents and may or may not have a dining hall 
  in addition to all the attributes of a regular building. 
* This class contains methods to add residents, remove residents and
  to check whether a person is a resident.
  
*/

public class House extends Building {

  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  /**
   * Creates a house using the "Building" class
   * @param name The name of the building
   * @param address The address of the house
   * @param nFloors The number of floors
   * @param boolean Whether or not the house has a dining room
   */

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors );
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }


public boolean hasDiningRoom(){
  return hasDiningRoom;
}

public int nResidents(){
  int nRes = residents.size();
  return nRes;
}

/**
   * Adds a person to the arraylist 'residents', moves a person into the house
   * @param name The name of the person
   */
public void moveIn(String name){
 residents.add(name);
}

/**
   * Removes a person to the arraylist 'residents', moves a person out of the house
   * @param name The name of the person
   * @return Returns the name of the person that has moved out
   */
public String moveOut(String name){
  residents.remove(name);
  return name + " has moved out.";
}

/**
   * Checks if a person is in the arraylist 'residents', checks if a person is a resident of the house
   * @return Returns true if person is a resident of the house
   */
public boolean isResident(String person){
  boolean isRes = residents.contains(person);
  if (isRes == true){
    return true;
  } else {
    throw new RuntimeException("This person is not a resident.");
  }
}
public static void main(String[] args) {
  House Albright = new House("Albright", "7 Bedford Terrace", 4, false );
  Albright.moveIn("Tajhini");
  Albright.moveIn("Lily Martin");
  Albright.moveIn("Mari");
  Albright.moveIn("Max");
  Albright.moveIn("Dinah");
  Albright.moveIn("Yelena");

  System.out.println(Albright.isResident("Mari"));
  System.out.println(Albright.moveOut("Dinah"));
  

}

}