import java.util.Scanner;

public class ExtraccionProfesional {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String texto = scan.nextLine();

            int primeraPosicion = texto.indexOf('>',0);
            int segundaPosicion = texto.indexOf('<',primeraPosicion);
            nombre = texto.substring(primeraPosicion+1, segundaPosicion);
            
            int primeraPosicion1 = texto.indexOf('>',segundaPosicion+8);
            int segundaPosicion1 = texto.indexOf('<',primeraPosicion1);
            apellido = texto.substring(primeraPosicion1+1, segundaPosicion1);
            System.out.println(nombre+apellido);
        
        
        scan.close();
    }
}