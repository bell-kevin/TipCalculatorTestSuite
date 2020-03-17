package tipcalculator;

/******************************************************************************
* TipCalculator.java 
* Programmer: @author jcboyd
* Version: 1.0
* Course: SDEV 2210
* This program (which calculates the total cost of a meal with various tip 
* percentages) is designed to practice unit testing and TDD
******************************************************************************/

import java.util.*; //Scanner

public class TipCalculator {

    public static void main(String[] args) {
        System.out.println("Tip Calculator by JC Boyd\n");
        
        //this project calculates 5 tip amounts for a meal
        //and displays the tip and the total cost
        Scanner stdIn = new Scanner(System.in);
        double mealCost, tip15Value, tip18Value, tip20Value,
                tip22Value, tip25Value, total;
        
        System.out.print("What is the cost of the meal? $");
        mealCost = Double.parseDouble(stdIn.nextLine());
        
        tip15Value = calcTip(mealCost, 15);
        total = calcTotal(mealCost, tip15Value);
        display(total, tip15Value, "15");

        tip18Value = calcTip(mealCost, 18);
        total = calcTotal(mealCost, tip18Value);
        display(total, tip18Value, "18");

        tip20Value = calcTip(mealCost, 20);
        total = calcTotal(mealCost, tip20Value);
        display(total, tip20Value, "20");

        tip22Value = calcTip(mealCost, 22);
        total = calcTotal(mealCost, tip22Value);
        display(total, tip22Value, "22");

        tip25Value = calcTip(mealCost, 25);
        total = calcTotal(mealCost, tip25Value);
        display(total, tip25Value, "25");
    } //end main
    
    public static double calcTip(double cost, double tipPct) {
        //calculate tip amount
        return cost * (tipPct / 100);
    } //end calcTip
    
    public static double calcTotal(double cost, double tip) {
        //calculate complete cost of meal and tip
        return cost + tip;
    } //end calcTotal
    
    public static void display(double total, double tip, String tipP) {
            System.out.printf("%-3s%-16s%4.2f%-15s%6.2f\n", tipP,
                    "percent tip = $", tip,
                    ", total cost = $", total);
    } //end display
    
} //end TipCalculator
