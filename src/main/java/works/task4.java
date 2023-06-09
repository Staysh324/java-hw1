package works;
import java.util.Arrays;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int [] arr = new int [] { 3, 5, 6, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число сдвига:");
        int num = sc.nextInt();
        int temp = 0;
        int backindex = arr.length - num;
        System.out.println(Arrays.toString(arr));

if (num > arr.length-1){
    System.out.println("введенное число превышает размер массива");
}
        else if (num > 0)
        {
            for (int i = 0; i < num; i++)
                {
                temp = arr[i];
                arr[i] = arr[backindex];
                arr[backindex] = temp;
                backindex++;
                }
        }
        else if (num < 0)
            {
               num = Math.abs(num);
               int index = num - 1;
            for (int j = arr.length-1; index > -1; j--)
                {
                temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp;
                index--;
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}
