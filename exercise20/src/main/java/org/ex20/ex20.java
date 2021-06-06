package org.ex20;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double total = 0;
        double tax_amt = 0;
        double tax = 0.05;

        System.out.print("What is the order amount?");
        int order_amt = scanner.nextInt();

        System.out.print("What state do you live in?");
        String state = scanner2.nextLine();

        if(state.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            String county = scanner2.nextLine();
            tax_amt = tax * order_amt;
            total = tax_amt + order_amt;
            if(county.equals("Dunn")){
                tax = 0.055;
                tax_amt = tax * order_amt;
                total = tax_amt + order_amt;
            }
            else if(county.equals("Eau Claire")){
                tax = 0.054;
                 tax_amt = tax * order_amt;
                total = tax_amt + order_amt;

            }
        }
            else if (state.equals("Illinois")){
             tax = 0.08;
             tax_amt = tax *order_amt;
             total = tax_amt + order_amt;
            }

        else{
           total = order_amt;

           }
        double roundOff = (double) Math.round(total * 100) / 100;
        double roundoff_tax = (double) Math.round(tax_amt * 100) / 100;


        System.out.println("The tax is $"+ roundoff_tax + "\nThe total is $" + roundOff);

        }





    }

