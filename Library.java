/** 
 * Filename: Library.java
 * Decription: Library class extended from Building 
 * Attribute: a hashtable attribute containing all the titles in the library's collection. 
 * Functions: addTitle, removeTitle, checkOut, returnBook, containsTitle, isAvailable, and printCollection.
 * Overridden Methods: toString(), showOptions(), and goToFloor()
 * Overloaded Methods: containsTitle(), and isAvailable()
 */

import java.util.Hashtable;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean> ();
    }
  
    public void addTitle(String title){
        if (this.collection.containsKey(title)){
            throw new RuntimeException(title+" is aleady a part of " + name + "'s collection");
      }
      this.collection.put(title, true);
      System.out.println(title + " was added to " + name + "'s collection");
    }
    
    public String removeTitle(String title){
        if (this.collection.size() == 0){
            throw new RuntimeException("Sorry, there are no books in " + name + "'s collection");
        }
        if (!this.collection.containsKey(title)){
            throw new RuntimeException("Sorry, "+title+" is not in " + name + "'s collection");
        }
        this.collection.remove(title);
        System.out.println(title+" was removed from " + name + "'s collection");
        return title;    
    }

    public void checkOut(String title){
      collection.replace(title, true, false);
    }

    public void returnBook(String title){
      collection.replace(title, false, true);
    }

    public boolean containsTitle(String title){
        return collection.containsKey(title);
    }
    
    public boolean isAvailable(String title){
        return this.collection.get(title);
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
     neilson.isAvailable("Rabbit and the Hare");

     neilson.checkOut("Rabbit and the Hare");
     neilson.isAvailable("Rabbit and the Hare");
     neilson.printCollection();
    }
  
  }