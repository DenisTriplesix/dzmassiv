//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int array [] = {45,78,-15, 12, 34, 6, 90, 7, -2, -45};
//        int maxNumber = array [6] ; // беру из массива максимальное число
//        System.out.println("Max number"+ maxNumber);
//        int minNumber = array [9]; // беру из массива минимальное число
//        System.out.println("Min number"+ minNumber);

//}
        int[] array = {45, 78, -15, 12, 34, 6, 91, 7, -2, -45};
        int max = 0;                                //переменная максимального
        int min = -1;                               //переменная минимального
        for (int q = 0; q < array.length; q++) {
            if (max <= array[q]) {      //придаю переменной max максимальное значение из массива
                max = array[q];
            } else if (min >= array[q]) {          //минимальное
                min = array[q];
            }
        }
            System.out.println("Минимальное число" + min);
            System.out.println("Максимальное число" + max);

    }
}





