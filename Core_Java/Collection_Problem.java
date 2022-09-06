import java.util.*;
import java.util.stream.Collectors;

public class Collection_Problem
{
    // 1) (Set)Find true friends: Given two arraylists containing friend names,
    // find the true friends that appear in both list.
    public static List<String> findTrueFriends(List<String> input1, List<String> input2)
    {
        Set<String> input_One_Set = new HashSet<>(input1);
        List<String> result = new ArrayList<>();
        for (String value : input2)
        {
            if(input_One_Set.contains(value))
            {
                result.add(value);
            }
        }
        return result;
    }

    // 2) (Map)Given a string, output duplicate characters and their counts
    public static Map<String, Integer>  charactersAndCounts(String input)
    {
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        while(i < input.length())
        {
            String character = String.valueOf(input.charAt(i));
            if(!map.containsKey(character))
            {
                map.put(character ,1);
            }
            else
            {
                map.replace(character, map.get(character)+1);
            }
            i++;
        }
        return map;
    }

    public static void main(String[] args)
    {
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();

        input1.add("Tom");
        input1.add("Tony");
        input1.add("Jobs");
        input1.add("Joey");
        input1.add("Lucy");

        input2.add("Joey");
        input2.add("Mark");
        input2.add("Tom");
        input2.add("Harry");
        System.out.println("##Q1##");
        System.out.println(findTrueFriends(input1,input2));

        System.out.println("##Q2##");
        System.out.println(charactersAndCounts("hello world"));
    }
}
