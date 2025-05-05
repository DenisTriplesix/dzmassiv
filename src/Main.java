//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int array [] = {45,78,-15, 12, 34, 6, 90, 7, -2, -45};
//        int maxNumber = array [6] ; // беру из массива максимальное число
//        System.out.println("Max number"+ maxNumber);
//        int minNumber = array [9]; // беру из массива минимальное число
//        System.out.println("Min number"+ minNumber);


        int[] arr = {45, 78, -15, 12, 34, 6, 91, 7, -2, -45};

        int max = 0;
        int min = -1;
        for (int q = 0; q < arr.length; q++) {
            if (max <= arr[q]) {
                max = arr[q];
            } else if (min >= arr[q]) {
                min = arr[q];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

