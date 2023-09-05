package ro.fasttrackit.Exercise1;

public class Print implements Ads {
    private int budget;
    private String marketingDudette;

    public Print(int budget, String marketingDudette) {
        this.budget = budget;
        this.marketingDudette = marketingDudette;
    }

    public int remainingBudget() {
        return this.budget;
    }

    public String personResponsable() {
        return this.marketingDudette;
    }

    public void runAds() {
        System.out.println("Print ads running");
        if (this.budget <= 0) {
            System.out.println("Money printer goes BRRRRR");
        }
        this.budget -= 5;
    }

    @Override
    public String toString() {
        return "Print{" +
                "budget=" + budget +
                ", marketingDudette='" + marketingDudette + '\'' +
                '}';
    }
}
