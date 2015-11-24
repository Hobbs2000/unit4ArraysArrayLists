public class ArrayOperations
{
    
    public static void main(String[] args)
    {
        double[] doubles = {8.0, 4.0, 5.0, 21.0, 7.0, 9.0, 18.0, 2.0, 100.0};
        
        System.out.println("Length of array: "+doubles.length);
        System.out.println("First item: "+doubles[0]);
        
        //Length is always one more than the last valid index
        System.out.println("Last item: "+doubles[doubles.length-1]);
        
        for (int i = 0; i < doubles.length; i++)
        {
            System.out.println(doubles[i]);
        }
        
        System.out.println();
        for(int i = 0; i < doubles.length; i++)
        {
            System.out.println("Value at Index["+i+"]: "+doubles[i]);
        }
        
        System.out.println();
        for(int i = doubles.length-1; i >= 0; i--)
        {
            System.out.println("Value at Index["+i+"]: "+doubles[i]);
        }
    }
}