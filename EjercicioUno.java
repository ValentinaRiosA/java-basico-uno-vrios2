import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Digite 3 valores distintos");
        System.out.print("A: ");
        a = scanner.nextInt();
        System.out.print("B: ");
        b = scanner.nextInt();
        System.out.print("C: ");
        c = scanner.nextInt();

        if (a != b && a != c && b != c){
            if (a > b && a > c){
                System.out.println("A es el mayor");
                if (b > c){
                    System.out.println("C es el menor");
                }else{
                    System.out.println("B es el menor");
                }
            } else if (b > a && b > c) {
                System.out.println("B es el mayor");
                if (a > c){
                    System.out.println("C es el menor");
                }else{
                    System.out.println("A es el menor");
                }
            }else{
                System.out.println("C es el mayor");
                if (a > b){
                    System.out.println("B es el menor");
                }else{
                    System.out.println("A es el menor");
                }
            }
        }else{
            System.out.println("Los valores son iguales, intente de nuevo");
        }
    }
}