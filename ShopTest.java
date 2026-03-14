import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShopTest {


// Computer Class
String expectedDescription = "2019 MacBook Pro"; 
String expectedProcessorType = "Intel";
int expectedHardDriveCapacity = 256; 
int expectedMemory = 32;
String expectedOperatingSystem= "High Sierra";
int expectedYearMade = 2019;
int expectedPrice = 1000;
Computer testComputer = new Computer(
            expectedDescription,
            expectedProcessorType,
            expectedHardDriveCapacity,
            expectedMemory,
            expectedOperatingSystem,
            expectedYearMade,
            expectedPrice);

    @Test
    public void testConstructorDescription(){
        assertEquals(testComputer.description, expectedDescription);
    }

    @Test
    public void testConstructorProccesorType(){
        assertEquals(testComputer.processorType, expectedProcessorType);
    }

    @Test
    public void testConstructorHardDriveCapacity(){
        assertEquals(testComputer.hardDriveCapacity, expectedHardDriveCapacity);
    }

    @Test
    public void testConstructorMemory(){
        assertEquals(testComputer.memory, expectedMemory);
    }  

    @Test
    public void testConstructorOperatingSystem(){
        assertEquals(testComputer.operatingSystem, expectedOperatingSystem);
    }        

    @Test
    public void testConstructorYearMade(){
        assertEquals(testComputer.yearMade, expectedYearMade);
    }   

    @Test
    public void testConstructorPrice(){
        assertEquals(testComputer.price, expectedPrice);
    }   

    @Test
    public void testSetPrice(){
        testComputer.setPrice(1200); 
        testComputer.setPrice(2000); 

        assertEquals(testComputer.price, 2000);

    }

    @Test
    public void testSetOS(){
        testComputer.setOS("Somona"); 
        testComputer.setOS("Sequoia"); 

        assertEquals(testComputer.operatingSystem, "Sequoia");

    }

    @Test
    public void testGetYear(){
        assertEquals(testComputer.yearMade, testComputer.getYear());

    }

    @Test
    public void testToString(){
        String expectedString= testComputer.description + "\n" + testComputer.processorType  + "\n" + testComputer.hardDriveCapacity  + "\n" + testComputer.memory  + "\n" + testComputer.operatingSystem  + "\n" + testComputer.yearMade  + "\n" + testComputer.price;  
        assertEquals(testComputer.toString(), expectedString);

    }
    









// 
        
    
}
