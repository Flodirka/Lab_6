import java.util.*;

public class Task_2
{
    public static void main(String [] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=s.nextInt();
        float [] arr = new float[n];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=((float)(Math.random()*30)-15);
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.format("  "+"%.2f",arr[i]);
        }

        System.out.println();

        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=0; j<i;j++)
            {
                if (Math.abs(arr[j])>Math.abs(arr[j+1]))
                {
                    float tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.format("  "+"%.2f",arr[i]);
        }

    }
}
