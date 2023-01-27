import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double productPrice;
        double taxPercent = 1.18;
        double finalPrice;

        System.out.print("Please enter product price: ");
        productPrice = input.nextDouble();
        finalPrice = (taxPercent * productPrice);
        System.out.print("Tax percent is: %18 / " + taxPercent + "\nTotal price is: " + finalPrice + "\nHave a good day! :)");

    }
}