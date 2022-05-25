public class Array{
    public static void transpuesta(int [][]a){
        int fila = a.length;
        int col = a[0].length;
        int [][] b = new int [col][fila];
        for(int i = 0; i<fila; i++){
            for(int j = 0; j<col; j++){
                b[j][i]=a[i][j];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    } 
}
