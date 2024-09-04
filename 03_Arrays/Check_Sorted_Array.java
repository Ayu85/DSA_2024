public class Check_Sorted_Array {
    static boolean checkArr(int[] arr){
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            isSorted=false;
        }
        return isSorted;
    }

    public static void main(String[] args) {
        System.out.println(checkArr(new int[] {1,2,3,3,4
        }));
    }
}