import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        System.out.println("How many bottles of beer?");
        int origBeerNum = intScanner.nextInt();
        int beer = origBeerNum;

        while (beer >= 1 ){
            System.out.println(beer + " bottles of beer on the wall. " + beer
                    + " bottles of beer. ");
            beer = beer - 1;
            if (beer == 1) {
                System.out.println("Take one down, pass it around, " + beer + " bottle of beer on the wall.");
                System.out.println(beer + " bottle of beer on the wall. " + beer + " bottle of beer.");
                beer = beer - 1;
                System.out.println("Take one down, pass it around, " + beer + " bottles of beer on the wall.");
            } else {
                System.out.println("Take one down, pass it around, " + beer + " bottles of beer on the wall.");
            }
        }
        System.out.println(beer + " bottles of beer on the wall. " + beer + " bottles of beer.");
        System.out.println("Go to the store, buy some more. " + origBeerNum + " bottles of beer on the wall.");



    }
}