import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean addCustomer(String name, double initialAmount){
        if (findCustomer(name) == null) {
            customers.add(new Customer(name));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){
        if (findCustomer(name) == null)
            return false;

        findCustomer(name).addTransaction(amount);
        return true;
    }

    private Customer findCustomer(String name){
        for (Customer x : customers){
            if (x.getName().equals(name))
                return x;
        }
        return null;
    }
}
