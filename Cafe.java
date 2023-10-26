/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

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
        int remainingCoffee = this.nCoffeeOunces-size; 
        int remainingSugar = this.nSugarPackets-nSugarPackets;
        int remainingCream = this.nCreams-nCreams;
        int remainingCups = this.nCups-1;

        if( remainingCoffee > 0  && remainingSugar > 0  && remainingCream > 0  && remainingCups > 0){
            // then i can make a coffee! 
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups = nCups - 1;
        } else{
            System.out.println( name + " has restocked!");
            this.restock(60, 50, 30, 40); 
            }
        
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
