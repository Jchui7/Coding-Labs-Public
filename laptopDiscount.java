package Ch1;

    import java.util.Scanner;

    public class laptopDiscount {
        public static void main(String[] args) {
            //Initialize variables
            double regLaptopCost;
            double discountPercent;
            double discountAmount;
            double discountDecimal;
            double laptopDiscountCost;
            double laptopDiscountCostBeforeTax;
            double gstInDollars;
            double pstInDollars;
            String recieptResponse;
            
            
            //Initialzie constant variables
            final double ENVIRONMENT_FEE = 0.45;
            final double GST = 1.05;
            final double PST = 1.07;
    
            //Initialize scanners
            Scanner scanner = new Scanner(System.in);
    
            //Collect inputs
            System.out.print("Enter cost: $");
            regLaptopCost = scanner.nextDouble();
            System.out.print("Enter discount %: "); 
            discountPercent = scanner.nextDouble();

            //Convert percent to decimal form
            discountDecimal = ((discountPercent / 100) + 1); 

            //Calculate laptop discount cost with discount, added environment fee, GST and PST taxes
            laptopDiscountCostBeforeTax = (regLaptopCost / discountDecimal);
            laptopDiscountCost = ((regLaptopCost / discountDecimal) * GST * PST) + 0.45;
            System.out.print("The cost of the laptop after a " + discountPercent + "% discount, 5% GST tax, 7% PST tax, and $0.45 in enviormental fee is: $" );
            System.out.printf("%.2f", laptopDiscountCost);

            //Receipt with price break down
            System.out.print("\nWould you like your reciept? Yes or No: ");
            recieptResponse = scanner.next().toUpperCase();

            //initialize i for while loop
            int i = 0;

            //While loop for response to question for reciept
            while (i == 0) {
                if (recieptResponse.equals("YES")) {
                    System.out.println("Printing Receipt.");
                    i = 1;
                }
                else if (recieptResponse.equals("NO")) {
                    System.out.println("Thank you for your use of our servies :)");
                    i = 1;
                }
                else {
                    System.out.print("ERROR, TRY AGAIN");
                    System.out.print("\nWould you like your reciept? Yes or No: ");
                    recieptResponse = scanner.next().toUpperCase();
                }
            }    

            //Math for calculating fees
            gstInDollars = ((laptopDiscountCostBeforeTax * GST) - laptopDiscountCostBeforeTax);
            pstInDollars = ((laptopDiscountCostBeforeTax * PST) - laptopDiscountCostBeforeTax);
            discountAmount = (laptopDiscountCost - regLaptopCost);

            //Reciept Printing
            System.out.println("                          ");
            System.out.println("                          ");
            System.out.println("--------------------------");
            System.out.print("Laptop Cost:      $");
            System.out.printf("%.2f", regLaptopCost);
            System.out.print("\nPST:               $");
            System.out.printf("%.2f", pstInDollars); 
            System.out.print("\n" + "GST:               $");
            System.out.printf("%.2f", gstInDollars);
            System.out.println("\n" + "ENVIRONMENT FEE:    $" + ENVIRONMENT_FEE);
            System.out.print("DISCOUNT AMOUNT:  $");
            System.out.printf("%.2f", discountAmount);
            System.out.print("\n" + ("--------------------------"));
            System.out.print("\n" + "Laptop Disc Cost: $");
            System.out.printf("%.2f", laptopDiscountCost);
            System.out.println("                          ");
            

        




            
    }
}
