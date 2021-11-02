public class TwoDimensionalArray {

    public static void main(String[] args)
    {
        int[][] array = new int[11][11];
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                array[i][j] = i*j;
            }
        }
        PrintArray(array);
        SwapColumnsAndRows(array);
        PrintArray(array);
    }

    private static int[][] SwapColumnsAndRows(int[][] array){ //not done
        return array;
    }

    private static void PrintArray(int[][] array){
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.printf("%5d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
