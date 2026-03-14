Use this file to record your reflection on this assignment.

What are your initial impressions of how `Unit Testing` affects your programming?
What worked, what didn't, what advice would you give someone taking this course in the future?
I think it's a good way to seperate each aspect of the shop. It is kind of tedious but overall, it saves time by targeting specific errors. I had a difficult time setting up the before because I intiliazed them outside the before in the beginning. I eventually figured it out but that was probably the most difficult part. I also did struggle with the assertEqual at the beginning when I sometimes didn't have the same types so it wouldn't work. I couldn't find all of the bugs. I only found 7 instead of all 10, but I couldn't figure out what else was missing unless it was just stylistic stuff. 

For my tests, I tested first the constructor of computer by comparing what was output from the constructor to what was input.

I tested the setPrice and setOS by calling the method and seeing if it actually ended up changing to intended.

I tested getYear by comparing the output to the actual year of a computer.

I tested toString by calling it and comparing it to what was expected to output.

I tested buy by clearing the inventory, buying a new computer, and then comparing the computer to the actual inventory index to see if it was the same.

I tested sell by clearing inventory, buying a new computer, then selling it and compared to inventory size to 0.

I tested refurbish by testing all the different years: before 200, before 2012, before 2018, and after to see if it correctly changed the price.

I tested refurbish's new OS to see if it updates by comparing the expected to the actual OS it updated to.

I tested printInventory to see if it crashed by comparing boolean values.




