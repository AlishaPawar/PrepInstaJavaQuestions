class MatrixRotation 
{
    public static void main(String[] args) 
	{
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] rotatedMatrix = rotateMatrix(matrix);
        printMatrix(rotatedMatrix);
    }

    static int[][] rotateMatrix(int[][] matrix) 
	{
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] rotated = new int[cols][rows];

        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                rotated[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    static void printMatrix(int[][] matrix) 
	{
        for (int i = 0; i < matrix.length; i++) 
		{
            for (int j = 0; j < matrix[i].length; j++) 
			 {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
