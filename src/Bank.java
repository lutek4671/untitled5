import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.branches = new ArrayList<>();
        this.name = name;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            branch.addCustomer(customerName, initialAmount);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean addCustomerTransactionToBranch(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            branch.addCustomerTransaction(customerName, amount);

            return true;
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch x : branches) {
            if (x.getName().equals(name))
                return x;
        }
        return null;
    }
}
