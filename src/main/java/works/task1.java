package works;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 1, 3, 5, 2, 4};
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        int max = arr[0];
        int min = arr[1];

        if (max < min)
            {
            temp = max;
            max = min;
            min = temp;
            }

            for (int i = 2; i < arr.length; i++)
                {
                if (arr[i] > max)
                    {
                    max = arr[i];
                    }
                else if (arr[i] < min)
                    {
                    min = arr[i];
                    }
                }
            System.out.println("минимальное число " + min);
            System.out.println("максимальное число" + max);
    }
}

