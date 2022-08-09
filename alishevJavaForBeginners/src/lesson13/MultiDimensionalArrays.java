package lesson13;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int index = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = index;
                index++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {6},
                {7, 8, 9}
        };
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
