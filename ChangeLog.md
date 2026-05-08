Resubmit 5/8/26

Changes:

- Deleted Bug 6 as it was a repeat of Bug 3.
- Added testBuyInInv() to find bug 6, ta bug in buy() method where it promises to throw a a RuntimeException if computer is in the inventory, but does not actually do it
- Added testResaleShopConstructor() to find Bug 9, where the ResaleShop constructor adds a computer to the shop from the start.
- Added testSellNotInInv() to find Bug 8, where the sell() method promises to throw a RuntimeException if computer is not in inventory, but does not actually do it
- Added testrefurbishAfterBuy() to find Bug 10, where refurbish() throws a runtime exception after refurbishing something bought to inventory
- Added tests to reflection