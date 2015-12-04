import java.util.*;

public class MagicSquare
{
    public static int[] startArray = new int[16];
    public static int[][] square = new int[4][4];
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        for (int i = 0; i < startArray.length; i++)
        {
            System.out.println("Enter a number: ");
            startArray[i] = in.nextInt();
        }
        
        Arrays.sort(startArray);
        for (int i = 0; i < startArray.length-1; i++)
        {
            if (startArray[i]+1 != startArray[i+1])
            {
                System.out.println("Not a magic square!");
                return;
            }
        }
        
        int i = 0;
        for (int r = 0; r < square.length; r++)
        {
            for (int col = 0; col < square[r].length; col++)
            {
                square[r][col] = startArray[i];
                i++;
            }
        }
        
        System.out.println();
        for (int r = 0; r < square.length; r++)
        {
            for (int col = 0; col < square[r].length; col++)
            {
                System.out.print(square[r][col]+"\t");
            }
            System.out.println();
        }
    }
}
