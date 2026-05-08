## Bug 1
Brief description: The constructor always assigns memory as 16.  
Failed unit test: testConstructorMemory()

## Bug 2
Brief description: The constructor always assigns price as 0.
Failed unit test: testConstructorPrice()

## Bug 3
Brief description: The setOS() method always sets the OS to "none".
Failed unit test: testSetOS()

## Bug 4
Brief description: The buy() method only buys one specific premade computer.
Failed unit test: testBuy()

## Bug 5
Brief description: The refurbish() method sets the price of computers under 2012 but above 2000 as 2500 instead of 250. 
Failed unit test: testRefurbishMidComputer()

## Bug 6
Brief description: The buy() promises to throw a RuntimeException if computer is already in inventory but does not actually do it.
Faild unit test: testBuyInInv


## Bug 7
Brief description:  Print inventory crashes because of an index out of bounds exception
Failed unit test: testPrintInventory()

## Bug 8
Brief description:  The sell() method promises to throw a RuntimeException if computer is not in inventory, but does not actually do it.
Failed unit test: testSellNotInInv()

## Bug 9
Brief description:  The constructor for ResaleShop adds a computer into the inventory as it initializes, when it should be empty from the start
Failed unit test: testResaleShopConstructor()

## Bug 10
Brief description: The refurbish() throws a runtime exception after buying something to inventory
Failed unit test: testRefurbishAfterBuy()