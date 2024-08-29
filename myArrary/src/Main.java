import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //                     0       1        2       3
        String nombres[] = {"Edwar","Antonio","Joel","Pablo"};
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre "+ i + ":"+nombres[i]);
        }
    }
}