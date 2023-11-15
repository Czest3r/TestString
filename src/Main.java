import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //jeden string, przenieść dwa znaki na przód tego stringa pod warunkiem że tych znaków jest co najmniej 3 a jeśli nie to zostawić jak jest

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stringa");
        String test = scanner.nextLine();
        System.out.println(test);

        String testowy = new String();
        if(test.length() >= 3){
            test = test.substring(-2);

        }
    }
}