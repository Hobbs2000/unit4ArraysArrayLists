import java.util.*;
public class ArrayLists
{
    public static void main(String[] args)
    {
        //Cannot use primitive types with the ArrayList class
        //Strings are not primitives
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Hello"); //Now has a size of 1 (at index 0)
        list.add("World!"); // Now has a size of 2 (at index 1)
        
        //Have to use the .get() method to get an element at an index
        System.out.println(list.get(0)+" "+list.get(1));
        //Can use .remove() method to get rid of elements at an index
        
        
        //To create primitive arraylists, you must use wrapper classes
        //Wrapper classes use the same name as primitives, only beginning with a capitol letter
        ArrayList<Integer> ints = new ArrayList<Integer>(); //Integer not int
        
        //Adding is the same for wrappers
        ints.add(10);
        ints.add(1234);
        
        //Accessing is also the same
        System.out.println(ints.get(0)); //Will print out 10
        
        
    }
}