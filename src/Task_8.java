import java.util.*;

public class Task_8
{
    public static void main (String [] args)
    {
        double a,b,m,i,f;

        Scanner s = new Scanner(System.in);

        System.out.println("Введите a");
        a=s.nextDouble();
        System.out.println("Введите b");
        b=s.nextDouble();
        System.out.println("Введите шаг m");
        m=s.nextDouble();

        for(i=a;i<b;i+=m)
        {
            f=i-Math.asin(i);
            System.out.format("   "+"%.5f",f);
        }
    }
}