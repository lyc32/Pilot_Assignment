import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class String_Problem
{
    public static void main(String[] args)
    {
        System.out.println("###Q1###");
        String[] result = Q1();
        System.out.println(result[0]);
        System.out.println(result[1]);

        System.out.println("###Q2###");
        System.out.println(Q2("hello","hell"));//false
        System.out.println(Q2("hello","Hello"));//false
        System.out.println(Q2("hello","hellO"));//false
        System.out.println(Q2("hello","heLlo"));//false
        System.out.println(Q2("hello","hello"));//true

        System.out.println("###Q3###");
        System.out.println(Q3("https://www.amazon.com/demo?test=abc"));

        System.out.println("###Q4###");
        System.out.println(Q4(new String[]{}));
        System.out.println(Q4(new String[]{"hello"}));
        System.out.println(Q4(new String[]{"hello", "world"}));
        System.out.println(Q4(new String[]{"hello", "world", "hello"}));

    }

    // 1) Given string “Algorithms”, return  “go” and “Algo” using substring
    public static String[] Q1()
    {
        String inputString = "Algorithms";
        String[] result = new String[2];
        result[0] = inputString.substring(2,4);
        result[1] = inputString.substring(0,4);
        return result;
    }

    // 2) Given two strings, compare if these two two strings are equal by comparing each character
    public static boolean Q2(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        else
        {
            int i = 0;
            char a;
            char b;
            while(i < s1.length())
            {
                a = s1.charAt(i);
                b = s2.charAt(i);
                if(a != b)
                {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    // 3) Given string “https://www.amazon.com/demo?test=abc”, return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]
    public static List<String> Q3(String input)
    {
        List<String> result = new ArrayList();
        StringTokenizer st = new StringTokenizer(input,"://.?=");
        while (st.hasMoreTokens())
        {
            result.add(st.nextToken());
            //System.out.println(st.nextToken());
        }
        return result;
    }

    // 4) Given a list of string array, combine them into one string sentence, return the string sentence
    public static String Q4(String[] input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while(i < input.length)
        {
            stringBuilder.append(input[i]);
            i++;
        }
        return stringBuilder.toString();
    }
}
