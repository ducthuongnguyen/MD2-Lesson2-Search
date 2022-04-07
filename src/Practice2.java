import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter "+list.length+" value: ");
        for (int i = 0; i < list.length; i++) {
            list[i]=scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println("Begin sort processing...");
        bubbleSortByStep(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }

    public static void bubbleSortByStep(int[] list){
        for (int k = 1; k < list.length  ; k++) {
            for (int j = 0; j < list.length-k; j++) {
                if (list[j]>list[j+1]){
                    int temp = list[j];
                    list[j]= list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }

}
