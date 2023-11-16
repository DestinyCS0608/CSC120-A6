/** 
 * Filename: Cafe.java
 * Decription: Cafe class extended from Building class 
 * Attributes: nCoffeeOunces, nSugarPackets, nCreams, and nCups. 
 * Contains functions sellCoffee, and restock.
 * @author Destiny Cecchi Samuels
 */

public class Cafe extends Building{
    private int nCoffeeOunces; 
    private int nSugarPackets;
    private int nCreams; 
    private int nCups; 

    /**
     * Constructor for the cafe attrributes, includes the name, address, and amount of floor of the cafe
     * while setting the initial values for coffee, sugar, cream, and cups
     * @param name the name of the cafe
     * @param address the adress of the cafe
     * @param nFloors the amount of floors of the cafe
     */
    public Cafe(String name, String address, int nFloors){
        super(name, address, nFloors);
        this.nCoffeeOunces = 60;
        this.nSugarPackets = 50;
        this.nCreams = 30;
        this.nCups = 40; 
    }

    /**
     * Method that sells coffee by decreasing the amount of coffee, sugar, cream, and cups
     * @param size the coffee sizes in ounces
     * @param nSugarPackets the amount of sg
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces<size || this.nSugarPackets<nSugarPackets || this.nCreams<nCreams || this.nCups == 0) {
            System.out.println("Stock is low, we are restocking!");
            restock(size, nSugarPackets, nCreams, 1);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Coffee succesfully sold!");
    }

    /**
     * Method that restocks the cafe coffee, sugar, creams, and cups
     * @param nCoffeeOunces the amount of coffee
     * @param nSugarPackets the amount of sugar packets
     * @param nCreams the amount of creams
     * @param nCups the amount of cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces += nCoffeeOunces;
        nSugarPackets += nSugarPackets;
        nCreams += nCreams;
        nCups += nCups; 
    }

    /**
     * Main used for testin the Cafe class
     * @param args
     */
    public static void main(String[] args) {
        Cafe starbucks = new Cafe("Starbucks", "time square", 2);

        starbucks.sellCoffee(12,3,4);
        starbucks.sellCoffee(75,100, 89);
        System.out.println("Coffee ounces in Starbucks Cafe: " + starbucks.nCoffeeOunces);
        System.out.println("Sugar in Starbucks Cafe: " + starbucks.nSugarPackets);

    }
    
}
