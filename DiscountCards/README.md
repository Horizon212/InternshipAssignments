# DiscountCards

DiscountCards, or "Assignment Backend" is the one of the two coding 

assignments given to potential Prime Holding interns.

## Installation and startup

Ensure that you have Java SE 8u202 or above installed. Unzip the archive 

provided and you have 2 options. You could either use the command line to 

run the project or your favourite IDE. Since I use Intellij IDEA, the 

instructions I provide will be for use with the latter IDE.

1. Start up Intellij IDEA
2. Go to File -> Open and navigate to the directory where you unzipped the project files.
3. Click on the folder DiscountCards
4. Now the project is open
5. In order to run the code, go to Run -> Run 'Main'
6. The code should now be running and you should be seeing the output in the IDE's console.


## Logic and Usage

The project represents an object-oriented model of a simplified market store system. It contains 3 kinds of discount cards (Bronze, Silver and Gold)
 whose discount values vary depending on the previous month's turnover of purchases.

There is one abstract superclass called "DiscountCard" which provides the blueprint for the remaining 3 card
 subclasses (BronzeCard, SilverCard and GoldCard). Each of the latter contain code that calculates a discount
 rate based on the assignment's instructions (i.e. taking the "turnover" into account, etc.).

The PayDesk class contains the following code:

- a "doPurchase" method (that performs the purchasing action).

- a calculation of the discount value derived from a card's discount percentage based on the purchase value
 submitted in the Main method.
 
- a calculation of the total amount of money that is owed based on the formula
 "total = purchase value - discount value".
 
- code that formats the program's output based on the assignment's instructions
 (in this case the class "DecimalFormat" is employed to that purpose).
 
- a "print" method that prints the output generated.

Please note that the Main method is populated with sample data as per the assignment's instructions.


## Author
Ilin Argirov