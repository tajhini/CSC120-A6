/* This is a stub for the Library class */
/** This class represents a building of type library
* This specific building has books and does not have a dining hall 
  in addition to all the attributes of a regular building. 
* This class contains methods to add books to collection, remove books from collection, check out books and return books, 
check whether a specfi book is in the collection, check if a book is currently available as well as prinitng the colection of books
and whether they are available or not.
  
*/
import java.util.Hashtable;
import java.util.Enumeration;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;

  /**
   * Creates a library using the "Building" class
   * @param name The name of the building
   * @param address The address of the building
   * @param nFloors The number of floors
   */

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();

      
      System.out.println("You have built a library: 📖");
      
    }

    
  /**
   * Adds a new book to the collection
   * @param title The name and author of the book
   */
    public void addTitle(String title){
      collection.put(title, true);
    }

  /**
   * Removes a book from the collection
   * @param title The name and author of the book
   * @return title + "has been removed."
   */
    public String removeTitle(String title){
      collection.remove(title);
      return title + " has been removed.";
    }

   /**
   * Changes a title's value to false indicating that it is checked out
   * @param title The name and author of the book
   */
    public void checkOut(String title){
      collection.replace(title, false);
    }

   /**
   * Changes a title's value true indicating that it is currecntly in the collection
   * @param title The name and author of the book
   */
    public void returnBook(String title){
      collection.replace(title, true);
    }

  /**
   * Checks whether a book is in the collection.
   * @param title The name and author of the book
   * @return true
   */
    public boolean containsTitle(String title){
      boolean hasTitle = collection.contains(title);
      if (hasTitle == true){
        return true;
      } else {
        throw new RuntimeException("This title is not in the library.");
      }
    } 

    /**
   * Checks whether a book is available for borrowing
   * @param title The name and author of the book
   * @return true or false
   */
    public boolean isAvailable(String title){
      boolean bookAvailable = collection.get(title);
      if (bookAvailable == true){
        return true;
      } else{
        return false;
      }
    } // returns true if the title is currently available, false otherwise
    
  /**
   * Prints the collection and whether or not a book is available for borrowing
   */
    public void printCollection(){
      Enumeration<String> keys = collection.keys();
      while (keys.hasMoreElements()) {
        String key = keys.nextElement();
        boolean status = collection.get(key);
        if (status == true){
          System.out.println("" + key + " is available.");
          System.out.println();
        } else {
          System.out.println("" + key + " is not available.");
          System.out.println();
        }
        
    } // prints out the entire collection in an easy-to-read way (including checkout status)
  }
    public static void main(String[] args) {
      Library Neilson = new Library("Neilson", "1 Chapin Way", 4);
      Neilson.addTitle("The Seven Husbands of Evelyn Hugo");
      Neilson.addTitle("Shadow and Bone");
      Neilson.addTitle("Love");
      Neilson.addTitle("Church");
      Neilson.checkOut("Love");
      Neilson.printCollection();
    }
  
  }