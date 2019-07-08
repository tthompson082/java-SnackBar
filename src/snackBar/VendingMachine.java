package snackBar;

public class VendingMachine
{
    // fields
    private int maxId = 0;
    private int id;
    private String name;

    // constructor
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // methods

    // get the vending machine's Id
    public int getMachineId()
    {
        return id;
    }

    // get the vending machine's name
    public String getMachineName()
    {
        return name;
    }

    // set the vending machine's name
    public void setMachineName(String name)
    {
        this.name = name;
    }
}