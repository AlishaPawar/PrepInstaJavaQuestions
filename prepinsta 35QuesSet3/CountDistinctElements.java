import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5};

        int count = countDistinctElements(array);
        System.out.println("Number of distinct elements: " + count);
    }

    public static int countDistinctElements(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        return set.size();
    }
}
