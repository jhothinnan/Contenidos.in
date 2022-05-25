public class InvertirArreglo {
    public static int[] invertir(int[]a){
        for (int i = 0; i < a.length/2; i++) {
             int temp = a[i];
             a[i]=a[a.length-1-i];
             a[a.length-1-i]=temp;
         }
         return a;
    }
    public static void imprimir(int[]a){
             if (a.length >= 1) {
                 System.out.print(a[0]);
             }
             for (int i = 1; i < a.length; i++) { 
                  System.out.print("," + a[i]);
             }
         }
    }