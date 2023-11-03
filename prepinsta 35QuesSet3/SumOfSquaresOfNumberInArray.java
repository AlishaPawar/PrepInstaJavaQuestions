import java.util.Scanner;

class SumOfSquaresOfNumberInArray
{
    static int squareSum(int a[],int size) 
    {
        int sum = 0;
        int square = 0;
       
        for(int i = 0;i < size; i++)
        {
            square = a[i] * a[i];
            sum += square;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int j = 0;
         
        int[] arr = new int[40];
        
        Scanner sc1 = new Scanner(System.in);
     
        System.out.println("Enter size");
        int size = sc1.nextInt();
       
        System.out.println("Enter element");

        for(int i = 0; i < size; i++)
              arr[i]=sc1.nextInt();
      
        System.out.print("square sum of element "+squareSum(arr,size));
     }
}