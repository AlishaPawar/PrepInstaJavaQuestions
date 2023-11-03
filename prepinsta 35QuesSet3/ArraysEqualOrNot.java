import java.util.Arrays;
import java.util.Scanner;
class ArraysEqualOrNot
{
      public static boolean equal(int a1[],int a2[])
      {
             int n=a1.length;
             int m=a2.length;
             Arrays.sort(a1);
             Arrays.sort(a2);
             if (n!= m) 
                return false; 
             for (int i = 0; i < n; i++) 
             {
                 if (a1[i] != a2[i]) 
                     return false; 
             }
             return true;

     }
      public static void main(String[] arg)
     {
         int[] a1 = new int[50];
         int[] a2 = new int[50];

         Scanner sc1 = new Scanner(System.in);

		  System.out.println("Enter size of array 1");
         int size1 = sc1.nextInt();

         System.out.println("Enter element");

         for(int i=0;i<size1;i++)
             a1[i]=sc1.nextInt();

         System.out.println("Enter size of array2");
         int size2=sc1.nextInt();

         System.out.println("Enter element");

         for(int i=0;i<size2;i++)
             a2[i]=sc1.nextInt();

        if(equal(a1,a2))
             System.out.println("Both array is same");
        else
             System.out.println("arrays is not same");
      }
}
