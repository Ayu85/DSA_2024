import java.util.*;

public class Union_Of_Sorted_Arrays {
    static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]) {
                    temp.add(arr1[i]);

                }
                i++;
            } else {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr2[j]) {
                    temp.add(arr2[j]);

                }
                j++;
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };
        ArrayList<Integer> temp = union(arr1, arr2);
        for (Integer i : temp) {
            System.out.print(i + " ");
        }

    }
}
