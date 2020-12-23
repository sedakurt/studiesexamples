package purchasebook;


public class PurchaseCalculatorResult {


    public static String getBookName(int bookName){

        switch (bookName){

            case 1: return "Sefiller";
            case 2: return "Göbeklitepe";
            default: return "Invalid book name. Please enter a value book1 or book2"; }
    }

    public static void main(String args[])
    {
        PurchaseCalculator calculatorPurchase = new PurchaseCalculator();
        calculatorPurchase.printBookCost();

    }
}
