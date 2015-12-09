import java.util.*;
public class ArrayListOperations
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        
        System.out.println("First:"+names.get(0)+" Last:"+names.get(names.size()-1));
        
        names.add(4, "Doug");
        
        System.out.println();
        for (String name : names)
        {
            System.out.println(name);
        }
        
        ArrayList<String> names2 = new ArrayList<String>(names);
        
        names.remove(0);
        System.out.println("\nNames:");
         for (String name : names)
        {
            System.out.println(name);
        }
        
        System.out.println("\nNames2:");
        for (String name : names2)
        {
            System.out.println(name);
        }
    }
}