public class twodimensionalarray {
 public static void main(String[] args) {
        // Define a 2D array (matrix)
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a new 2D array for the transposed matrix
        int[][] transposed = new int[original[0].length][original.length];

        // Loop through the original matrix and transpose it
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                transposed[j][i] = original[i][j]; // Swap rows and columns
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}


