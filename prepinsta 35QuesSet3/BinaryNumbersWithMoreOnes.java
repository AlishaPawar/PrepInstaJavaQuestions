class BinaryNumbersWithMoreOnes 
{
    public static void generateBinaryNumbers(int n) 
	{
        generateBinaryNumbersHelper(n, "", 0, 0);
    }

    static void generateBinaryNumbersHelper(int n, String current, int ones, int zeros) 
	{
        if (current.length() == n) 
		{
            System.out.println(current);
            return;
        }

        if (ones >= zeros) 
		{
            generateBinaryNumbersHelper(n, current + '0', ones, zeros + 1);
        }
        generateBinaryNumbersHelper(n, current + '1', ones + 1, zeros);
    }

    public static void main(String[] args) 
	{
        int n = 4;
        generateBinaryNumbers(n);
    }
}
