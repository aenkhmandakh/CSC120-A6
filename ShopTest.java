import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/***
 * ShopTest class for testing 
 */
public class ShopTest {

/***
 * Expected variables for computer to make it easier with @before
 */
Computer testComputer;
ResaleShop testShop;
String expectedDescription;
String expectedProcessorType;
int expectedHardDriveCapacity;
int expectedMemory;
String expectedOperatingSystem;
int expectedYearMade;
int expectedPrice;

/*** Set up shop and computer so we don't have to repeat */
    @Before
    public void setup(){
        testShop = new ResaleShop();

        expectedDescription = "2019 MacBook Pro"; 
        expectedProcessorType = "Intel";
        expectedHardDriveCapacity = 256; 
        expectedMemory = 32;
        expectedOperatingSystem= "High Sierra";
        expectedYearMade = 2019;
        expectedPrice = 1000;
        
        testComputer = new Computer(
                    expectedDescription,
                    expectedProcessorType,
                    expectedHardDriveCapacity,
                    expectedMemory,
                    expectedOperatingSystem,
                    expectedYearMade,
                    expectedPrice);
        }

    /***
     * testing that constructor properly sets up description by comparing to expected
     */
    @Test
    public void testConstructorDescription(){
        assertEquals(expectedDescription, testComputer.description);
    }
    /***
     * testing that constructor properly sets up processorType by comparing to expected
     */
    @Test
    public void testConstructorProccesorType(){
        assertEquals(expectedProcessorType, testComputer.processorType);
    }
    /***
     * testing that constructor properly sets up hardDriveCapacity by comparing to expected
     */
    @Test
    public void testConstructorHardDriveCapacity(){
        assertEquals(expectedHardDriveCapacity, testComputer.hardDriveCapacity);
    }

    /***
     * testing that constructor properly sets up memory by comparing to expected
     */
    @Test
    public void testConstructorMemory(){
        assertEquals(expectedMemory, testComputer.memory);
    }  

    /***
     * testing that constructor properly sets up OS by comparing to expected
     */

    @Test
    public void testConstructorOperatingSystem(){
        assertEquals(expectedOperatingSystem, testComputer.operatingSystem);
    }        
    /***
     * testing that constructor properly sets up yearMade by comparing to expected
     */
    @Test
    public void testConstructorYearMade(){
        assertEquals(expectedYearMade, testComputer.yearMade);
    }   
    /***
     * testing that constructor properly sets up price by comparing to expected
     */
    @Test
    public void testConstructorPrice(){
        assertEquals(expectedPrice, testComputer.price);
    }   
    /***
     * testing it properly sets price by comparing to expected
     */
    @Test
    public void testSetPrice(){
        testComputer.setPrice(1200); 
        testComputer.setPrice(2000); 

        assertEquals(2000, testComputer.price);

    }

    /***
     * testing it properly sets OS by comparing to expected
     */
    @Test
    public void testSetOS(){
        testComputer.setOS("Somona"); 
        testComputer.setOS("Sequoia"); 

        assertEquals("Sequoia", testComputer.operatingSystem);

    }
    /***
     * testing the getter properly gets yearMade by comparing it to the computer's yearMade
     */
    @Test
    public void testGetYear(){
        assertEquals(testComputer.yearMade, testComputer.getYear());

    }
    /***
     * testing it properly converts to string by comparing to expected
     */
    @Test
    public void testToString(){
        String expectedString= testComputer.description + "\n" + testComputer.processorType  + "\n" + testComputer.hardDriveCapacity  + "\n" + testComputer.memory  + "\n" + testComputer.operatingSystem  + "\n" + testComputer.yearMade  + "\n" + testComputer.price;  
        assertEquals(expectedString, testComputer.toString());

    }
    /***
     * testing it properly buys by looking at the inventory
     */
    @Test 
    public void testBuy(){
        testShop.inventory.clear();
        Computer testComputer2 = new Computer(
            "2025 MacBook Pro", 
            "Intel", 
            256, 
            32, 
            "Sequoia", 
            2025, 
            2000);
        testShop.buy(testComputer2);

        assertEquals(testComputer2, testShop.inventory.get(0));

    }

     /***
     * testing it properly sells by seeing if the inventory is empty after selling the only computer
     */
    @Test
    public void testSell(){
        testShop.inventory.clear();
        testShop.inventory.add(testComputer);
        testShop.sell(testComputer);
        assertEquals(true, testShop.inventory.isEmpty());
    }

    /***
     * testing it properly refurbishes computer before 2000
     */
    @Test 
    public void testRefurbishOldComputer(){
        Computer oldComputer=new Computer("Old Computer", "Old Processor", 10, 5, "Old OS", 1999, 500);
        testShop.inventory.add(oldComputer);
        testShop.refurbish(oldComputer, "NewestOS");
        assertEquals(0, oldComputer.price);
    }

    /***
     * testing it properly refurbishes computer before 2012
     */
    @Test 
    public void testRefurbishMidComputer(){
        Computer midComputer=new Computer("Okay Computer", "Okay Processor", 20, 10, "Old OS", 2010, 550);
        testShop.inventory.add(midComputer);
        testShop.refurbish(midComputer, "NewestOS");
        assertEquals(250, midComputer.price);


    }
    /***
     * testing it properly refurbishes computer before 2018
     */
    @Test 
    public void testRefurbishNewerComputer(){
        Computer newerComputer=new Computer("Good Computer", "Good Processor", 128, 16, "Old OS", 2017, 1000);
        testShop.inventory.add(newerComputer);
        testShop.refurbish(newerComputer, "NewestOS");
        assertEquals(550, newerComputer.price);


    }

    /***
     * testing it properly refurbishes computer after 2017
     */
    @Test 
    public void testRefurbishNewestComputer(){
        testShop.inventory.add(testComputer);
        testShop.refurbish(testComputer, "NewestOS");
        assertEquals(1000, testComputer.price);
    }
    /***
     * testing it properly refurbishes computer OS by setting it to the intended
     */
    @Test 
    public void testRefurbishNewOS(){
        testShop.inventory.add(testComputer);
        testShop.refurbish(testComputer, "NewestOS");
        assertEquals("NewestOS", testComputer.operatingSystem);
    }  


    /***
     * testing if it properly prints inventory by comparing booleans if it does
     */
    @Test
    public void testPrintInventory(){
        boolean crashTest=false;
        try {
            testShop.printInventory();
        } catch (IndexOutOfBoundsException e){
            crashTest = true;
        }
        assertEquals(false, crashTest);
    }









    
    








// 
        
    
}
