import java.util.Scanner;

public class Word {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String palabra = scan.next();
        int largoPalabra = palabra.length();
        System.out.println(largoPalabra);
        System.out.println(palabra.replace("A","a").indexOf("a", 1));
    }
}