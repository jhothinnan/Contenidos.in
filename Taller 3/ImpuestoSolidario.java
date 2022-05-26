import java.util.Scanner;
public class ImpuestoSolidario{
    public static void main (String [] args){
        try (Scanner scan = new Scanner(System.in)) {
            double salario = scan.nextDouble();
            String contrato = scan.next();
            if(salario > 10000000 && contrato.equals("publico")){
                System.out.println(String.format("%.2f",salario-(salario*0.85)));
            }
            else{
                System.out.println("No debes aportar");
            }
        }
        
    }
}