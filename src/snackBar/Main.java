package snackBar;

public class Main 
{
    public static void main(String[] args)
    {
        // Customer 1
        Customer cm1 = new Customer("Jane", 45.25);

        // Customer 2
        Customer cm2 = new Customer("Bob", 33.14);

        // Vending Machine 1
        VendingMachine vm1 = new VendingMachine("Food");

        // Vending Machine 2
        VendingMachine vm2 = new VendingMachine("Drink");

        // Vending Machine 3
        VendingMachine vm3 = new VendingMachine("Office");

        // Get the id's for the vending machines
        int foodMachineId = vm1.getMachineId();
        int drinkMachineId = vm2.getMachineId();
        int officeMachineId = vm3.getMachineId();

        // Snack 1
        Snack snack1 = new Snack("Chips", 36, 1.75, foodMachineId);

        // Snack 2
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, foodMachineId);

        // Snack 3
        Snack snack3 = new Snack("Pretzel", 30, 2.00, foodMachineId);

        // Snack 4
        Snack snack4 = new Snack("Soda", 24, 2.50, drinkMachineId);

        // Snack 5
        Snack snack5 = new Snack("Water", 20, 2.75, drinkMachineId);

        // Process #1
        snack4.buySnack(3);
        double procOneCost = snack4.totalCost(3);
        cm1.buyWithCashOnHand(procOneCost);

        // Customer 1's cash on hand after Process #1
        System.out.println("Customer #1's cash on hand after Process #1 = $" + cm1.getCashOnHand());

        // Quantity of Snack 4 after Process #1
        System.out.println("Snack #4's quantity after Process #1 = " + snack4.getQuantity());

        // Process #2
        snack3.buySnack(1);
        double procTwoCost = snack3.totalCost(1);
        cm1.buyWithCashOnHand(procTwoCost);

        // Customer 1's cash on hand after Process #2
        System.out.println("Customer #1's cash on hand after Process #2 = $" + cm1.getCashOnHand());

        // Quantity of Snack 3 After Process #2
        System.out.println("Snack #3's quantity after Process #2 = " + snack3.getQuantity());

        // Process #3
        snack4.buySnack(2);
        double procThreeCost = snack4.totalCost(2);
        cm2.buyWithCashOnHand(procThreeCost);

        // Customer 2's cash on hand after Process #3
        System.out.println("Customer #2's cash on hand after Process #3 = $" + cm2.getCashOnHand());

        // Quantity of Snack 4 after Process #3
        System.out.println("Snack #4's quantity after Process #3 = " + snack4.getQuantity());

        // Process #4
        cm1.addCashOnHand(10.00);

        // Custmer 1's cash on hand after Process #4
        System.out.println("Customer #1's cash on hand after Process #4 = $" + cm1.getCashOnHand());

        //Process #5
        snack2.buySnack(1);
        double procFiveCost = snack2.totalCost(1);
        cm1.buyWithCashOnHand(procFiveCost);

        // Customer 1's cash on hand after Process #5
        System.out.println("Customer #1's cash on hand after Process #5 = $" + cm1.getCashOnHand());

        // Quantity of Snack 2 after Process #5
        System.out.println("Snack #2's quantity after Process #5 = " + snack2.getQuantity());

        // Process #6
        snack3.addQuantity(12);

        // Quantity of Snack 3 after Process #5
        System.out.println("Snack #3's quantity after Process #6 = " + snack3.getQuantity());

        // Process #7
        snack3.buySnack(2);
        double procSevenCost = snack3.totalCost(2);
        cm2.buyWithCashOnHand(procSevenCost);

        // Customer 2's cash on hand after Process #7
        System.out.println("Customer #2's cash on hand after Process #7 = $" + cm2.getCashOnHand());

        // Quantity of Snack 3 after Process #7
        System.out.println("Snack #3's quantity after Process #7 = " + snack3.getQuantity());
    }
}