import java.util.*;

public class Intersection_Sorted_Arrays {
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]) {
                    temp.add(arr1[i]);

                }
                i++;
                j++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int[] arr2 = { 2, 3, 3, 5, 6, 6, 7 };
        ArrayList<Integer> temp = intersection(arr1, arr2);
        for (Integer i : temp) {
            System.out.print(i + " ");
        }
    }
}
