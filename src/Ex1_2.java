public class Ex1_2 {


public static void insertionSort(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++) {
       int key = arr[i];
       int j = i-1;
       while (j>=0 && arr[j]>key){
           arr[j+1] = arr[j];
           j=j-1;
       }
       arr[j+1] = key;
    }
}
static  void printArray(int[] arr){
    int n= arr.length;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        int[] arr = {9,6,3,-7,44,0};
        insertionSort(arr);
        printArray(arr);
    }
}
