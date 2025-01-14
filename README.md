# TipCalculatorTestSuite
SDEV 1060 Project. 

After reading about test suites, try it out. Below is the pseudocode for the project. Create the project in Java or C# as appropriate. Run it, using $30 as the cost of the meal. It should match the example given in the Reading. Then create test methods that use parameterized data, to run many tests with different data.

In the Reading, it discussed that the two methods that run calculations need to be tested (the method to calculate the tip amount, and also the method to calculate the total bill). Implement both test methods in your project. Include test runners in the test methods to be able to test with a lot of different values. In the Reading, find the table of test cases for 12 different meal costs with 5 different tip percentages. Test all 60 results in each test.  

For Java projects: Implement a test suite to run both tests with one command. Run the test suite (one click to run all of the tests in both methods); the results need to show that 120 tests passed.  

For C#, run all tests.     

Code for the project  

Calculation methods:      

public static double calcTip(double cost, double tipPct) {         
    return cost * (tipPct / 100);     
}      
public static double calcTotal(double cost, double tipAmt) {         
    return cost + tipAmt;     
}


Pseudocode for main method:

    print "Tip Calculator by Student Name"
    double mealCost, tip15Value, tip18Value, tip20Value, tip22Value, tip25Value, total
    print "What is the cost of the meal? "
    mealCost = input from user
    // repeating block of code
    tip15Value = calcTrip(mealCost, 15)
    total = calcTotal(mealCost, tip15Value)
    display(total, tip15Value, "15")
    // repeat those 3 lines for the other tip rates
    // by changing 15 to the other number in 5 places,
    // change tipXXValue variable x 3, and at end of 1st and 3rd lines
    // there should be 5 sets of that repeating block of code,
    // for tip rates 15, 18, 20, 22, 25

 

Run the project and use $30 as the meal cost. Make sure, by visual inspection, that the values are correct (match the test case in the table). Take a screenshot of the execution of the project.

Add the data for all 60 tests for both methods in the tests. Run the tests and fix as needed until all tests pass. Take a screenshot of the successful test results.  

Submission: specified screenshots and the root folder for the project.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
