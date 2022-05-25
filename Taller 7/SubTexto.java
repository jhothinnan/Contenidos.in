import java.util.Scanner;

public class SubTexto {
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)) {
            String texto = scan.next();
            int inicio = scan.nextInt();
            int end = scan.nextInt();
            String subTexto = texto.substring(inicio,(end+1));
            System.out.println(subTexto);
        }
    }
}