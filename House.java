/** 
 * Filename: House.java
 * Decription: House class extended from Building 
 * Attributes: hasDiningRoom (boolean), an array list containing all residents, and a boolean for whether or not there is an elevator. 
 * Functions: hasDiningRoom(), nResidents(), moveOut(), moveIn(), and isResident().
 */

import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents;
  private Boolean hasDiningRoom;

  /**
   * Constructor for the House class the extends Building class
   * @param name the name of the house
   * @param address the address of the house
   * @param nFloors the number of floors the house has
   * @param hasDiningRoom true or false if the house has a dining room
   */
  public House(String name, String address, int nFloors, Boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  /**
   * Method that checks if the House has a dining room or not
   * @return true or false - whether the House has a dining room, followed by a message
   */
  public boolean hasDiningRoom() {
    return hasDiningRoom();
  }

  /**
   * Method that accesses the number of the residents in the array list or House
   * @return the number of residents in the array list - or in the House
   */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * Method that adds a resident's name to the resident't array list.
   * @param name the resident's name that is being added to the array list or moving in
   */
  public void moveIn(String name) {
    if (this.residents.contains(name)) {
        throw new RuntimeException(name + " is already a resident of this house");
      }
      this.residents.add(name);
      System.out.println(name + " was moved into the house.");
}
  

  /**
   * Method that removes the name of a resident from the residents array list. 
   * @param name the name of the resident who is moving out 
   * @return the resident's name that was removed from the array list
   */
  public String moveOut(String name) {
    if (this.residents.size() == 0){
        throw new RuntimeException("Sorry, there are no residents in this house");
      }
      if (!this.residents.contains(name)){
        throw new RuntimeException(name+ " is not a resident in this house");
      }
      this.residents.remove(name);
      System.out.println(name + " moved out of the house.");
      return name;
}

  /**
   * Boolean Method that checks if a person is in the residents array list 
   * @param person the name of the person that is being considered a resident or not
   * @return true or false - whether if the person is in the resident array list, followed by a message
   */
  public boolean isResident(String person) {
    return residents.contains(person);
  }

  /* Main for testing!*/
  public static void main(String[] args) {
    House gillett = new House("Gillett", "47 Elm Street", 5, false);
    System.out.println(gillett);
    gillett.moveIn("Destiny");
    gillett.moveIn("ABC");
    System.out.println(gillett.residents);
    gillett.moveOut("ABC");
    gillett.isResident("XYZ");
    System.out.println(gillett.residents);
    System.out.println(gillett.hasDiningRoom);
    System.out.println(gillett.nFloors);

  }

}