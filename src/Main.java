public class Main {
    public static void main(String[] args) {

        // Creating first account
        HDFCAccount pushpHDFC = new HDFCAccount("Pushp", 5000, "Pushp@123");
        System.out.println(pushpHDFC.getName()+" Account created. Your account number is: "+ pushpHDFC.getAccountNo());

        // Creating first account
        HDFCAccount ratanHDFC = new HDFCAccount("Ratan", 7503, "Ratan@123");
        System.out.println(ratanHDFC.getName()+" Account created. Your account number is: "+ ratanHDFC.getAccountNo());

        pushpHDFC.addMoney(70000);

        System.out.println(pushpHDFC.withdrawMoney("salkcm", 7000));
        System.out.println(pushpHDFC.withdrawMoney("Pushp@123", 7000));

        System.out.println(pushpHDFC.fetchBalance("Pushp@123"));

        System.out.println(pushpHDFC.changePassword("Rat9835@an", "Pushp@123"));

        System.out.println(pushpHDFC.fetchBalance("Pushp@123"));
    }
}