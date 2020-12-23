package purchasebook;


/*
1. birinci kitap basecostu a
2. ikinci kitap basecostu b
3. tax yani kdv %8
4. hangi kitaptan satın almak istersiniz? a
5. kaç tane almak istersiniz? x
6. Purchase = (a * % 8 )* x // sonucu ekrana yazdır.
 */

import java.math.RoundingMode;
import java.util.Scanner;

public class PurchaseCalculator {
    Scanner scanner = new Scanner(System.in);

    private double baseCostFirstBook;
    private double baseCostSecondBook;

    public PurchaseCalculator() {
        baseCostFirstBook = 26.99;
        baseCostSecondBook = 45;
    }

    public PurchaseCalculator(double fb, double sb) {
        this.baseCostFirstBook = fb;
        this.baseCostSecondBook = sb;
    }

    public double getBaseCostFirstBook() {
        return baseCostFirstBook;
    }

    public void setBaseCostFirstBook(double baseCostFirstBook) {
        this.baseCostFirstBook = baseCostFirstBook;
    }

    public double getBaseCostSecondBook() {
        return baseCostSecondBook;
    }

    public void setBaseCostSecondBook(double baseCostSecondBook) {
        this.baseCostSecondBook = baseCostSecondBook;
    }


    public void printBookCost() {

        double taxRate = 0.08;
        double purchase = 0;

        PurchaseCalculatorResult a = new PurchaseCalculatorResult();


        System.out.println("Which do you buy book? Please enter the name: ");
        int bookName = scanner.nextInt();
        System.out.println("How many do you buy this book? Please enter the piece number: ");
        int numberOfPurchase = scanner.nextInt();
        if (bookName == 1) {
             purchase = (getBaseCostFirstBook() + taxRate * getBaseCostFirstBook())*numberOfPurchase;
            System.out.println("\nYour chosen book name: " + a.getBookName(1) );
            System.out.println("Your book's base cost is " + getBaseCostFirstBook());
            System.out.println("Book's tax (kdv) is " + String.format("%.2f",taxRate * getBaseCostFirstBook()));
            System.out.println("***Your purchase:  " + String.format("%.2f",purchase)+ "TL");

        } else if (bookName == 2) {
             purchase = (getBaseCostSecondBook() + taxRate * getBaseCostSecondBook())*numberOfPurchase;
            System.out.println("\nYour chosen book name: " + PurchaseCalculatorResult.getBookName(2) );
            System.out.println("Your book' s base cost is " + getBaseCostSecondBook());
            System.out.println("Book's tax (kdv) is " +  String.format("%.2f",taxRate * getBaseCostSecondBook()));
            System.out.println("***Your purchase:  " +String.format("%.2f",purchase) + "TL");
        }
        scanner.close();
    }

}
