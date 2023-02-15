package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        var rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        var seats = scanner.nextInt();
        var price = 0;

        if (rows * seats < 60) {
            price = 10;
            var result = price * (rows * seats);
            System.out.println("Total income:");
            System.out.println("$" + result);
        } else if (rows * seats > 60 && rows * seats % 2 == 1){
            var frontPrice = (rows - 1) / 2 * seats * 10;
                    var backPrice = (rows + 1) / 2 * seats * 8;
                    var result = frontPrice + backPrice;
                    System.out.println("Total income:");
            System.out.println("$" + result);
        } else {
            var frontPrice = rows / 2 * seats * 10;
                    var backPrice = rows / 2 * seats * 8;
                            var result = frontPrice + backPrice;
            System.out.println("Total income:");
            System.out.println("$" + result);
        }

    }
}