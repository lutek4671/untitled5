import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Bank> banks = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            int value = scanner.nextInt();
            switch (value) {
                case 1: {
                    createBank();
                    break;
                }
                case 2: {
                    createBranch();
                    break;
                }

                default: {
                    running = false;
                    break;
                }
            }
        }

    }
z i
        0
    public static void createBank() {
        System.out.print("Bank name: ");
        String name = scanner.next();
        if (findBank(name) == null) {
            banks.add(new Bank(name));
            System.out.println("Bank \"" + name + "\" added.");
        } else {
            System.out.println("Bank \"" + name + "\" already exists.");
        }

    }

    public static void createBranch() {
        System.out.println("Type bank name, which the branch is supposed to belong to: ");
        String bankName = scanner.next();
        Bank bank = findBank(bankName);
        if (bank == null) {
            System.out.println("Bank doesn't exist.");
        } else {
            System.out.println("Branch name: ");
            String branchName = scanner.next();
            if (bank.addBranch(branchName))
                System.out.println("Branch \"" + branchName + "\" added.");
            else
                System.out.println("This branch already exists.");
        }
    }

    private static Bank findBank(String name) {
        for (Bank x : banks) {
            if (x.getName().equals(name))
                return x;
        }
        return null;
    }
}
