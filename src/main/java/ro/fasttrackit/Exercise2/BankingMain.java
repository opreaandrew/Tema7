package ro.fasttrackit.Exercise2;

public class BankingMain {
    public static void main(String[] args) {
        Bank ing = new ING(25);
        Bank bt = new BT(50);
        Bank brd = new BRD(5);

        System.out.println(ing);
        System.out.println(bt);
        System.out.println(brd);

        ing.deposit(5);
        bt.withdraw(10);
        brd.withdraw(10);
        System.out.println("-------------------------");

        System.out.println(ing);
        System.out.println(bt);
        System.out.println(brd);
    }
}
