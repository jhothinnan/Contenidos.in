import java.util.Scanner;

public class DeFront {
    public static void main(String[]args) {
    try (Scanner scan = new Scanner(System.in)) {
        String cadena = scan.nextLine();
        int length = cadena.length();
        String temp = "";
        for (int posicion = 0; posicion < length; posicion++) {
            if (posicion == 0 && cadena.charAt(posicion) == 'a'){
            temp = temp + 'a';
            }
            else if (posicion == 1 && cadena.charAt(posicion) == 'b'){
            temp += 'b';
            }
            else if (posicion > 1){
            temp += cadena.charAt(posicion);
            }
        }
        System.out.println(temp);
    }
    }
}