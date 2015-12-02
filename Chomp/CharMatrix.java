// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  char[][] grid;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
      this.grid = new char[rows][cols];
      
      for (int row = 0; row < this.grid.length; row++)
      {
          for (int col = 0; col < this.grid[row].length; col++)
          {
              this.grid[row][col] = ' ';
          }
      }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
      this.grid = new char[rows][cols];
      
      for (int row = 0; row < this.grid.length; row++)
      {
          for (int col = 0; col < this.grid[row].length; col++)
          {
              this.grid[row][col] = fill;
          }
      }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
      return this.grid.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
      return this.grid[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
      return this.grid[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
      this.grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
      if (this.grid[row][col] == ' ')
      {
          return true;
      }
      else
      {
          return false;
      }
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
      int rows = row1-row0;
      int cols = col1-col0;
      for (int row = row0; row <= col1; row++)
      {
          for (int col = col0; col <= col1; col++)
          {
              this.grid[row][col] = fill;
          }
      }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
      int rows = row1-row0;
      int cols = col1-col0;
      for (int row = row0; row <= row1; row++)
      {
          for (int col = col0; col <= col1; col++)
          {
              this.grid[row][col] = ' ';
          }
      }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
      int count = 0;
      
      for (int col = 0; col < this.grid[row].length; col++)
      {
           if (this.grid[row][col] != ' ')
           {
               count++;
           }
      }
      
      return count;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
      int count = 0;
      
      for (int row = 0; row <  this.grid.length; row++)
      {
          if (this.grid[row][col] != ' ')
          {
              count++;
          }
      }
    
      return count;
  }
}
