package works;
import java.util.Arrays;
public class task2
{
    public static void main(String[] args)
    {
        int appendarray = 1;
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++)
            {
            for (int j = 0; j < arr[i].length; j++)
                {
                arr[i][j] = appendarray;
                appendarray += 1;
                System.out.print(arr[i][j]+ "\t");
                }
                System.out.println();
            }

        int k = 0;
        while (k < arr.length - 1)
            {
            arr[k][k] = 1;
            k++;
            if (k == arr.length-1)
                {
                arr[k][k] = 1;
                }
            }


        k = 0;
        int c = 9;
        while (k < arr.length - 1)
            {
            arr[c][k] = 1;
            k++;
            c--;
            if (k == arr.length-1)
                {
                arr[c][k] = 1;
                }
            }

        for (int i = 0; i < arr.length; i++)
            {
            for (int j = 0; j < arr[i].length; j++)
                {
                System.out.print(arr[i][j]+ "\t");
                }
            System.out.println();
            }
    }
}
