import java.util.*;

public class Task_1
{
    public static void main (String [] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=s.nextInt();
        int [] arr = new int[n];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=((int)(Math.random()*30)-15);
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

       System.out.println();

        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=0; j<i;j++)
            {
                if (Math.abs(arr[j])>Math.abs(arr[j+1]))
                {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
