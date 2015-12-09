import java.util.*;
public class Store
{
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<Double> amounts =  new ArrayList<Double>();
    
    /**
     * 
     */
    public void addSale(String customerName, double amount)
    {
        this.names.add(customerName);
        this.amounts.add(amount);
    }
    
    /**
     * 
     */
    public String nameOfBestCustomer()
    {
        double largest = 0;
        int largestIndex = 0;
        for (int i = 0; i < amounts.size(); i++)
        {
            if (amounts.get(i) > largest)
            {
                largestIndex = i;
            }
        }
        
        return names.get(largestIndex);
    }
}