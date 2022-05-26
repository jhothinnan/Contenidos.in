import java.util.Scanner;
public class Trabajo{
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int dia = scan.nextInt();
            double salario = scan.nextDouble();
            switch(dia){
                case 1: salario = salario*1.455;
                    break;
                case 2:
                case 3:
                    break;
                case 4: salario = salario*1.1;
                    break;
                case 5: salario = salario*1.295;
                    break;
                case 6: 
                case 7: salario = salario*1.75;
                    break;
            }
            System.out.println(String.format("%.2f",salario));
        }
    }
}