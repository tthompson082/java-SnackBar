package snackBar;

public class Customer
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //methods

    // add cash on hand
    public void addCashOnHand(double cash)
    {
        this.cashOnHand += cash;
    }

    // buy with given cash on hand
    public void buyWithCashOnHand(double cash)
    {
        this.cashOnHand -= cash;
    }

    // get customer name
    public String getCustomerName()
    {
        return name;
    }

    // set customer name
    public void setCustomerName(String name)
    {
        this.name = name;
    }

    // get cash on hand
    public double getCashOnHand()
    {
        return cashOnHand;
    }
}