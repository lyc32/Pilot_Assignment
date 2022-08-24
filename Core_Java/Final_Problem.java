import java.util.Arrays;

final class MyFinalClass
{
    public final void method(int[] input)
    {
        input[0] = 3;
        input[1] = 4;
        input[2] = 5;
    }

}

public class Final_Problem
{
    public static void main(String[] args)
    {
        final int[] input = {0,1,2};
        MyFinalClass myFinalClass = new MyFinalClass();
        System.out.println(Arrays.toString(input));//[0, 1, 2]
        myFinalClass.method(input);
        System.out.println(Arrays.toString(input));//[3, 4, 5]
    }
}
