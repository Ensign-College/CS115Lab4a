Lab 4a: Dessert Shop, Part 3---Calculate Cost & Tax
=================================================

**Follow the CS 115 Formatting Guide, which is found in the CS 115 Course Information module.**

Getting credit for this assignment requires two steps:

1.  Submit your finished code by clicking **Start Assignment** at the top of the page. Then upload your assignment using the **Choose File** option at the bottom of the page and click **Submit Assignment**. Include any comments you may wish the teacher to see when grading your assignment.  
2.  You **MUST pass off** all the test cases should complete.

**Read the instructions carefully.** Not following the instructions will result in not getting credit for the assignment.\
**Make sure your output matches the Example Run.**

Objectives:
===========

In this lab, you will learn how to do the following:

-   Create an abstract Java class.
-   Create an abstract Java method and the associated concrete methods in the subclasses.
-   Update an existing Java class structure to include additional methods.
-   Add additional JUnit test cases to existing test classes.
-   Regression-test existing methods through JUnit test cases.

Structure:
==========

Update the following classes for this lab.

-   **Package Name: DessertShop**
-   **Class Names:**
    -   **Order**
    -   **DessertShop**
    -   **DessertItem**
    -   **Candy**
    -   **Cookie**
    -   **IceCream**
    -   **Sundae**

Program: Dessert Shop, Part 3---Calculate Cost & Tax
==================================================

In this lab, you will create the ability to calculate the cost of any Dessert Item along with the associated tax. Additionally, an order will have the ability to calculate the cost of all items in the order as well as the associated tax.

To do this, you will make updates to your Dessert Shop classes as described below:

### The DessertItem class will:

-   -   -   be changed to an abstract class,
        -   include an additional attribute, taxPercent, which will be set to 7.25 via Explicit Field Initialization,
        -   have no changes to the constructors,
        -   include two new methods---getTaxPercent() and setTaxPercent(double)---to retrieve and modify the taxPercent instance variable,
        -   include a new abstract method---calculateCost(), and
        -   include a new method---calculateTax()---that will calculate and return the actual tax for the item.

### All subclasses (Candy, Cookie, IceCream, Sundae) will include:

-   -   -   a new method, calculateCost(), that will override the superclass's method and return the correct cost for the item.
        -   NOTE: The cost of a sundae is the cost of the ice cream used plus the cost of the topping.

### The Order class will:

-   -   -   include a new method, orderCost(), that calculates and returns the total cost for all items in the order, and
        -   include a new method, orderTax(), that calculates and returns the total tax for all items in the order.

### The DessertShop will:

-   -   -   Include a loop in main(), which prints out the name of the dessert, the cost of each item, and the tax for each item as shown in the example run.
        -   Print out the subtotal of all items in the order and the total tax for the order as shown in the example run.
        -   Print out the total cost for the order (subtotal + total tax).
        -   Print out the total number of items in the order as shown in the example run.

NOTE: To print out the order in tabular format, use either System.out.printf() or String.format.

System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", stringVar1, doubleVar1, doubleVar2);

or

String outputVar = String.format("%-25s$%-8.2f[Tax: $%.2f]\n", stringVar1, doubleVar1, doubleVar2);

System.out.println(outputVar);

For a reminder on how to use printf, see the [following articleLinks to an external site.](https://alvinalexander.com/programming/printf-format-cheat-sheet/).

JUnit Test Cases:
=================

### Modify DessertItemTest:

Modify all test cases (methods) from the DessertItemTest class to use an object instance from the Candy class.

-   Since you are unable to instantiate an object from an abstract class, you will need to modify all test cases in the DessertItemTest class. Rather than instantiate an object of type DessertItem, you will simply instantiate an object of type Candy and test each DessertItem method using the Candy object.

### Create new test cases:

Add JUnit test cases to your existing JUnit test classes for the following new methods:

#### DessertItemTest class:

-   -   -   getTaxPercent()
        -   setTaxPercent(double)

### All test classes used to test the subclasses (CandyTest, CookieTest, IceCreamTest, SundaeTest):

-   calculateCost()
-   calculateTax()
-   NOTE: Even though calculateTax() is a method in the DessertItem class, you will not test it from that class since it makes use of the calculateCost() method, which is abstract at the superclass level. Therefore, calculateTax() will be tested against an object of each DessertItem subclass to ensure it is functioning correctly.

Key Program Requirements:
=========================

-   The attribute taxPercent must reside in the DessertItem class.
-   calculateCost() is an abstract method in DessertItem and a concrete method in all inheriting subclasses.
-   calculateTax() is a concrete method in the DessertItem class and is **not**overridden in any of the inheriting subclasses.
-   JUnit test cases have been created/modified as described above.
-   The output of running your Dessert Shop program should be formatted and look similar to the Example Run.

Turn in twelve (12) .java files:

-   -   DessertShop.java
    -   Order.java
    -   DessertItem.java
    -   Candy.java
    -   Cookie.java
    -   IceCream.java
    -   Sundae.java
    -   DessertItemTest.java
    -   CandyTest.java
    -   CookieTest.java
    -   IceCreamTest.java
    -   SundaeTest.java

Example Run:
============

Candy Corn:                  $0.38      [Tax: $0.03]\
Gummy Bears:              $0.09      [Tax: $0.01]\
Chocolate Chip:           $2.00      [Tax: $0.14]\
Pistachio:                        $1.58      [Tax: $0.11]\
Vanilla:                             $3.36      [Tax: $0.24]\
Oatmeal Raisin:           $0.58      [Tax: $0.04]\
------------------------------------------------------\
Order Subtotals:         $7.97      [Tax: $0.58]\
Order Total:                  $8.55\
Total items in the order: 6