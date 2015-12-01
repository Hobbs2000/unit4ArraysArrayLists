public class ArrayOperations2
{
    private int[] values;
    
    public ArrayOperations2(int[] initialValues) 
    {
        values = initialValues;
    }
    
    public void swapFirstAndLast()
    {
        int temporary = this.values[0];
        this.values[0] = this.values[this.values.length-1];
        this.values[this.values.length-1] = temporary;
    }
    
    public void shiftRight()
    {
        int previous = 0;
        int last = this.values[this.values.length-1];
        for (int i = this.values.length-2; i >= 0; i--) 
        {
            this.values[i+1] = this.values[i];
        }
        
        for (int nums : this.values)
        {
            System.out.println(nums);
        }
        
        this.values[0] = last;
   }
    
    
    public static void main(String[] args)
    {
        int[] startArray = {1,2,3,4,5};
        ArrayOperations2 array = new ArrayOperations2(startArray);
        array.shiftRight();
        System.out.println();
        for (int nums : array.values)
        {
            System.out.println(nums);
        }
    }
}
