import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int numar = scanner.nextInt();
            if (numar > 0) {
            System.out.println("Numarul afisat este :" + numar);
            }
            else {
            System.out.println("Iesire");
            break;
            }

        }
    }
}



