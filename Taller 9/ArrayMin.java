public class ArrayMin {
	public static int minimoBuscado(int[][] a){     
        int minVal = a[0][0];
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if (a[j][i] < minVal ) {
                    minVal = a[j][i];
                }
            }
        }
    return minVal;
	}
}