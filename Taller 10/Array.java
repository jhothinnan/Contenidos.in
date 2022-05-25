public class Array{
    public static void recorrerArray(int[] array, int indice){
        if(indice == array.length-1){
            System.out.println(array[indice]);
        }
        else{
            System.out.println(array[indice]);
            recorrerArray(array, indice+1);
        }
    }
}