package snackBar;

public class Snack 
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // methods (getters and setters)

    // get the snack's id
    public int getId()
    {
        return id;
    }

    // get the snack's name
    public String getName()
    {
        return name;
    }

    // set the snack's name
    public void setName(String name)
    {
        this.name = name;
    }

    // get the snack's cost
    public double getCost()
    {
        return cost;
    }

    // set the snack's cost
    public void setCost(double cost)
    {
        this.cost = cost;
    }

    // get the snack's vending machine Id
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    // set the snack's vending machine Id
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    // get the snack's quantity
    public int getQuantity()
    {
        return quantity;
    }

    // add to the snack's quantity
    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    // buy snack when told how many to buy
    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }

    // get total cost when given a quantity
    public double totalCost(int purchaseQuantity)
    {
        return this.cost * purchaseQuantity;
    }
}