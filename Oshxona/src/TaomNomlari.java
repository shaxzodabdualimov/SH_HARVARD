import out.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class TaomNomlari {
    private int price;
    private int quantity;
    private String productName;
    Scanner sc = new Scanner(System.in);
    private String ichimliklar;

    private File Cliens;
    private java.io.File Orders;
    private String ClinetName;
    private String OrdersName;
    private FileWriter writer;
    private Scanner scanner;

    public TaomNomlari() throws IOException {


    }

    public void TaomNomi(String[] nom) throws IOException {
        for (String x : nom) {
            System.out.println(x);

        }
        System.out.println("Choose your fovorite food");

        int foodNumber = new Scanner(System.in).nextInt();
        switch (foodNumber) {
            case 1:
                Shashliklar();
                break;
            case 2:
                Osh();
                break;
            case 3:
                Qovurdoqlar();
                break;
            case 4:
                Ichimliklar();
                break;


            default:
                break;
        }

    }

    public void Shashliklar() throws IOException {


        System.out.println("Shashliklar:\n 1.Moloti : 25.000 \n 2.Dumma:50.000 \n 3.Tovuq:18.000 \n4.Kuskavoy:35.000");
        System.out.println("Tanlang...");
        System.out.println("Enter your name");
        ClinetName = sc.nextLine();
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Enter quantity");
                quantity = sc.nextInt();
                price = 25000;
                productName = "Moloti";
                break;

            case 2:
                System.out.println("Enter quantity");
                quantity = sc.nextInt();
                price = 29000;
                productName = "Dumma";
                break;
            case 3:
                System.out.println("Enter quantity");
                quantity = sc.nextInt();
                price = 19000;
                productName = "Tovuq";
                break;
            case 4:
                System.out.println("Enter quantity");
                quantity = sc.nextInt();
                price = 50000;
                productName = "Kuskavoy";
                break;

        }

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("Shimara.txt")
        );
        bufferedWriter.write("Name:"+ClinetName);
        bufferedWriter.newLine();
        bufferedWriter.write( "ProductName:"+productName);

        bufferedWriter.close();

    }

        public void Osh() {
            System.out.println("Osh : 1.Samarqand osh\n2.Toshkent osh\n3.Andijon osh");
            System.out.println("Tanlang : .....");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 55000;
                    productName = "Samarqand";
                    break;
                case 2:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 18000;
                    productName = "Toshkent";
                    break;
                case 3:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 35000;
                    productName = "Andijon";
                    break;

            }
        }

        public void Qovurdoqlar () {
            System.out.println("Qovurdoqlar : \n 1.OlamliQovurdoq;95000 \n2.Go'shtliQovurdoq:85000 \n 3.KarkarQovurdoq:56000");
            System.out.println("Tanlang : .....");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 95000;
                    productName = "OlamliQovurdoq";
                    break;
                case 2:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 85000;
                    productName = "Go'shtliQovurdoq";
                    break;
                case 3:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 56000;
                    productName = "KarkarQovurdoq";
                    break;

            }
        }

        public void Shorvalar () {
            System.out.println("Osh :  ");
        }

        public void Ichimliklar () {
            System.out.println("Ichimliklar :\n 1. Cola \n 2.Pepsi \n 3.Fresh water");
            System.out.println("Tanlang : .....");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 25000;
                    productName = "Cola";
                    break;
                case 2:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 29000;
                    productName = "Pepsi";
                    break;
                case 3:
                    System.out.println("Enter quantity");
                    quantity = sc.nextInt();
                    price = 19000;
                    productName = "Fresh water";
                    break;

            }

        }

        public void paymet () {
            if (productName.equals("Moloti")) {

                System.out.println("Price of your paymet: " + price * quantity + " so'm");

            }
            if (productName.equals("Dumma")) {
                System.out.println("Price of your paymet: " + price * quantity + " so'm");


            }
            if (productName.equals("Tovuq")) {
                System.out.println("Price of your paymet: " + price * quantity + " so'm");

            }

        }
    }

