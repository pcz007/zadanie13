import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) throws IOException {

        String firstName;
        String choice;
        String fileName = "stats.csv";
        Scanner scan = new Scanner(System.in);
        File file = new File(fileName);
        List<Player> table = new ArrayList<>();

        do {
            System.out.println("Podaj imię kolejnego gracza lub stop");
            firstName = scan.nextLine();
            if (firstName.equals("stop")) {
                break;
            } else {
                System.out.println("Podaj nazwisko gracza");
                String lastName = scan.nextLine();
                System.out.println("Podaj wynik gracza");
                int result = scan.nextInt();
                table.add(new Player(firstName, lastName, result));
                scan.nextLine();
            }
        } while (!firstName.equals("stop"));

        for (Player tabelka : table) {
            System.out.println(tabelka.toString());
        }
        System.out.println("Wybierz algorytm sortowania (imię/nazwisko/punkty)");
        choice = scan.nextLine();

        String comparator;
        switch (choice) {
            case "imię":
                Collections.sort(table);
                break;
            case "nazwisko":
                Collections.sort(table);
                break;
            case "punkty":
                ResultComparator resultComparator = new ResultComparator();
                Collections.sort(table, resultComparator);
                break;
            default:
                System.out.println("Zły wybór!");
        }

                for (Player tabelka : table) {
                    System.out.println(tabelka.toString());


                    //stworzenie klas sortujacych i posortowanie
                    //próba zapisu do pliku posortowanych stats.csv
                }
        }
    }

