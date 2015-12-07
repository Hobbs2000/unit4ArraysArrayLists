import java.util.*;
public class ArrayListsRemoval
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(11);
        ints.add(2);
        ints.add(3);
        ints.add(43);
        ints.add(432);
        ints.add(32);
        ints.add(-124);
        
        for (int num : ints)
        {
            System.out.print(num+",");
        }
        System.out.println();
        
        
        //Look in text book 7.7.7 pg.352 for more detail on why it must be done this way
        int i = 0;
        while (i < ints.size())
        {
            int num = ints.get(i);
            if (num < 10) //Removes all numbers in ints that are less than 2
            {
                ints.remove(i);
            }
            else //Only increase the index if the current element is not removed
            {
                i++;
            }
        }
        
        
        for (int num : ints)
        {
            System.out.print(num+",");
        }
        System.out.println();
    }
}