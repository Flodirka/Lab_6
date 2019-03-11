import java.util.*;

public class Task_11
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
            f=Math.asin(i)-Math.acos(i);
            System.out.format("   "+"%.5f",f);
        }
    }
}
