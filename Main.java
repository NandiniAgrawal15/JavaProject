public class Main {
    public static void main(String args[]) {
        Customer c1 = new Customer("Nandini", "Agrawal", "agrawalnandini", "79044648746", "duwgdegd", "dweyudwbeudb",
                "student", null, null);

        String s1 = c1.toString();
        System.out.print(s1);
        // to open account
        CurrentAccount acc1 = new CurrentAccount(c1);
        acc1.setBalance(1000.999);

        System.out.println(acc1.getBalance());

    }
}
