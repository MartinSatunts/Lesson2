public class homework7 {
    public static void main(String[] args) {
        int[][] matrix =
                {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 1, 2},
                        {3, 4, 5, 6}};
        System.out.println("Transpose Matrix");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
