/* This is a stub for the Cafe class */
/** This class represents a building of type Cafe
* This specific building only has an inventory of coffee and coffee products
  in addition to all the attributes of a regular building. 
* This class contains methods to sell coffee as well as restock coffee ingredients.
  
*/
public class Cafe extends Building{
    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups;

    /**
   * Creates a Cafe using the "Building" class
   * @param name The name of the building
   * @param address The address of the building
   * @param nFloors The number of floors
   */

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 50;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 10;

        System.out.println("You have built a cafe: ☕");

    }
    
    /**
    * Sells coffee by decreasing the the values of the coffee and coffee ingredients.
    * @param size
    * @param nSugarPack
    * @param numCreams
    */
    public void sellCoffee(int size, int nSugarPack, int numCreams){
        
        if (size > nCoffeeOunces){
            restock(50, nSugarPackets, nCreams, nCups);
        }
        if (nSugarPack > nSugarPackets){
            restock(nCoffeeOunces, 50, nCreams, nCups);
        }
        if (numCreams > nCreams){
            restock(nCoffeeOunces, nSugarPackets, 50, nCups);
        }
        if (nCups < 2){
            restock(nCoffeeOunces, nSugarPackets, nCreams, 10);
        }

        nCups = nCups-1;
        nCoffeeOunces = nCoffeeOunces - size;
        nSugarPackets = nSugarPackets - nSugarPack;
        nCreams = nCreams - numCreams;

    } 

    /**
    * Restocks the coffee and coffee ingredients by increasing their varibale values
    * @param numCoffeeOunces
    * @param numSugarPackets
    * @param numberCreams
    * @param numCups
    */
    private void restock(int numCoffeeOunces, int numSugarPackets, int numberCreams, int numCups){
        nCoffeeOunces = numCoffeeOunces;
        nSugarPackets = numSugarPackets;
        nCreams = numberCreams;
        nCups = numCups;
    } 

    // public void printInventory(){
    //     System.out.println("Cups Remaining: " + nCups);
    //     System.out.println("Coffee Ounces Remaining: " + nCoffeeOunces);
    //     System.out.println("Sugar Remaining: " + nSugarPackets);
    //     System.out.println("Cream Remaining: " + nCreams);
    //     System.out.println();

    // }
    public static void main(String[] args) {
        Cafe CampusCafe = new Cafe("Campus Cafe", "1 Chapin Way", 2);
        CampusCafe.sellCoffee(16, 2, 1);
        // CampusCafe.printInventory();
        CampusCafe.sellCoffee(48, 48, 1);
        // CampusCafe.printInventory();
        CampusCafe.sellCoffee(12, 20, 9);
        // CampusCafe.printInventory();
    }
    
}
