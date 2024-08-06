import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int calificacion;
        System.out.println("Digite su calificacion");
        calificacion = scanner.nextInt();
        switch (calificacion) {
            case 1:
                System.out.print("Su calificacion es F");
                break;
            case 2:
                System.out.print("Su calificacion es F");
                break;
            case 3:
                System.out.print("Su calificación es: D");
                break;
            case 4:
                System.out.print("Su calificación es: D");
                break;
            case 5:
                System.out.print("Su calificación es: C");
                break;
            case 6:
                System.out.print("Su calificación es: C");
                break;
            case 7:
                System.out.print("Su calificación es: B");
                break;
            case 8:
                System.out.print("Su calificación es: B");
                break;
            case 9:
                System.out.print("Su calificación es: A");
                break;
            case 10:
                System.out.print("Su calificación es: A");
                break;
            default:
                System.out.print("Número no válido, por favor verifique");
        }
    }
}