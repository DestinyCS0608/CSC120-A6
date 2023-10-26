/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean> ();
    }
  
    public void addTitle(String title){
      collection.put(title, true);
    }
    
    public String removeTitle(String title){
      collection.remove(title);
      return (title + "has been removed from the collection.");
    }

    public void checkOut(String title){
      collection.replace(title, true, false);
    }

    public void returnBook(String title){
      collection.replace(title, false, true);
    }

    public boolean containsTitle(String title){
      if (collection.containsKey(title)) {
        return true;
        } else {
          return false;
        }
    }
    
    public boolean isAvailable(String title){
      if (collection.contains(title)) {
        return collection.get(title);
      } else {
        throw new RuntimeException(title + " is not in this library collection");
      }
    }

    /**
     * Method that prints the library collection in an easy-to-read manner
     * Help from Geeks for Geeks: https://www.geeksforgeeks.org/how-to-iterate-through-hashtable-in-java/
     */
    public void printCollection(){
      System.out.println(name + "'s Collection:");
      collection.forEach( (key,value) ->
        System.out.println("Title: " + key + "\t\t Checkout Status: " + value
      ));
      
    }

    public static void main(String[] args) {
     Library neilson = new Library("Neilson", "Smith campus", 4);
     neilson.addTitle("The Cat in the Hat");
     neilson.addTitle("Really Hard Textbook!");
     neilson.addTitle("Rabbit and the Hare");

     neilson.checkOut("Rabbit and the Hare");
     neilson.printCollection();
    }
  
  }