import java.util.Scanner;

public class WithoutString{
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)) {
            String base = scan.next();
            String eliminar = scan.next();
            System.out.println(base.replaceAll(eliminar,""));
        }
    }
}