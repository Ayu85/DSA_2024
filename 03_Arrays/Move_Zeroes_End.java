import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeroes_End {
    static void move_brute(int[] arr, int n) {
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        for(int i=j;i<n;i++){
            temp[i]=0;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args){
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        move_brute(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
