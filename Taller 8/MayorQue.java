public class MayorQue {
    public static void mayor(int a[]){
        int cont = 0;
        for (int j = 1; j < a.length; j++) {
            
            if(a[j]>a[0]){
                cont++;
                System.out.println(a[j]);
            }
            if (cont==0){
                System.out.println("No hay ningun numero mayor que el primero");
                break;
            }
        }
    }
}