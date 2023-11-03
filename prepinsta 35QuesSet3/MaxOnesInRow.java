class MaxOnesInRow 
{
    public static int rowWithMaxOnes(int[][] matrix) 
	{
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int maxRow = 0;  
        int maxOnes = 0; 
        
        for (int i = 0; i < rows; i++) 
		{
            int onesInRow = 0; 
            for (int j = 0; j < columns; j++) 
			 {
                if (matrix[i][j] == 1) 
				 {
                    onesInRow++;
                }
            }
            if (onesInRow > maxOnes) 
			 {
                maxOnes = onesInRow;
                maxRow = i;
            }
        }
        
        return maxRow;
    }

    public static void main(String[] args) 
	{
        int[][] matrix = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 1}
        };

        int row = rowWithMaxOnes(matrix);
        System.out.println("Row with the maximum number of 1s is: " + row);
    }
}
