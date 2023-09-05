package ro.fasttrackit.Exercise2;

public class ING implements Bank{
private int availableFunds;

    public ING(int availableFunds) {
        this.availableFunds = availableFunds;
    }

    public int withdraw(int sum) {
        this.availableFunds -= sum;
        return this.availableFunds;
    }

    public int deposit(int sum) {
        this.availableFunds += sum;
        return this.availableFunds;
    }

    @Override
    public String toString() {
        return "ING{" +
                "availableFunds=" + availableFunds +
                '}';
    }
}
