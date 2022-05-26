import java.util.Scanner;
public class Estrellas{
    public static void main(String[]args){
        try (Scanner scan = new Scanner(System.in)) {
            int a0 = 0, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
            int i = scan.nextInt();
            int cont = 0;
            while (i>=0){
                switch(i){
                    case 0:
                        a0 = a0 + 1;
                        i = scan.nextInt();
                    break;
                    case 1:
                        a1 = a1 + 1;
                        i = scan.nextInt();
                    break;
                    case 2:
                        a2 = a2 + 1;
                        i = scan.nextInt();
                    break;
                    case 3:
                        a3 = a3 + 1;
                        i = scan.nextInt();
                    break;
                    case 4:
                        a4 = a4 + 1;
                        i = scan.nextInt();
                    break;
                    case 5:
                        a5 = a5 + 1;
                        i = scan.nextInt();
                    break;
                }
                cont++;
                
            }
            System.out.println("0"+"("+a0+") " + "*("+a1+") " + "**("+a2+") " + "***("+a3+") " + "****("+a4+") " + "*****("+a5+")"); 
            System.out.println("Total: "+cont);
        }    
    }
}