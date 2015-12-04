public class Array2D
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    int[][] counts = {
                        {1,0,1},
                        {1,1,0},
                        {0,0,1},
                        {1,0,0},
                        {0,1,1},
                        {0,1,1},
                        {1,1,0}
                    };
    
    public static void main(String[] args)
    {
        //The array counts is already filled and initialized
        //counts = new int[COUNTRIES][MEDALS];
    }
    
    public void displayElements()
    {
        //counts.length gets the amount of rows in the 2D array 
        for (int r = 0; r < this.counts.length; r++)
        {
            //counts[r].length gets the amount of elements in that row
            for (int c = 0; c < this.counts[r].length; c++)
            {
                System.out.print(this.counts[r][c]+"\t");
            }
            System.out.println();
        }
    }
    
    public int totalMedalsForCountry(int country)
    {
        //Sum of the elements in the specified row
        int total = 0;
        
        for (int c = 0; c < this.counts[country].length; c++)
        {
            total += counts[country][c];
        }
        return total;
    }
    
    public int totalMedalsType(int medalType)
    {
        int total = 0;
        
        for (int r = 0; r < this.counts.length; r++)
        {
            total += counts[r][medalType];
        }
        
        return total;
    }
    
    public void animate()
    { 
        for (int r = 0; r < this.counts.length; r++)
        {
            for (int c = 0; c < this.counts[r].length; c++)
            {
                this.counts[r][c] = 0;
            }
        }
        
        for (int r = 0; r < this.counts.length; r++)
        {
            for (int c = 0; c < this.counts[r].length; c++)
            {
                this.counts[r][c] = 1;
                if (r != 0)
                {
                    this.counts[r-1][c] = 0;
                }
                
                for (int row = 0; row < this.counts.length; row++)
                {
                    for (int col = 0; col < this.counts[r].length; col++)
                    {
                        System.out.print(this.counts[row][col]);
                    }
                }
                System.out.println();
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
    }
}
/**
 *                 try
                {
                    Thread.sleep(250);
                }
                catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
 */
