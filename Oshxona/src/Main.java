import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {


        String[] array = {};

        Scanner sc = new Scanner(System.in);


        System.out.println(" MILLIY TAOMLAR oshxonasiga  Xush kelibsiz");



        TaomNomlari nomlari;
        nomlari = new TaomNomlari();

        String[] taomNomlari = {"1.Shashlik", "2.Osh", "3.Qovurdoqlar", "4.Sho'rvalar", "5.Ichimliklar"};


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n 1.Buyurma berish\n2.To'lov qilish\n3.Client \n 0.Exit");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    nomlari.TaomNomi(taomNomlari);break;
                    case 2:nomlari.paymet();break;
                case 3:new Client();
                    case 0:new Exit().exit();break;

                default:
                    System.out.println("Enter correct number");break;
            }


            }
        }
    }
