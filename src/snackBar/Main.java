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

        System.out.println(foodMachineId);
    }
}