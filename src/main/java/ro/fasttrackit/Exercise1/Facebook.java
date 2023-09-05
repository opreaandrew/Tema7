package ro.fasttrackit.Exercise1;

public class Facebook implements Ads {

    private int budget;
    private String marketingDudette;

    public Facebook(int budget, String marketingDudette) {
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
        System.out.println("Facebook ads running");
        if (this.budget <= 10) {
            System.out.println("We almost can't afford it");
        }
        this.budget -= 10;
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "budget=" + budget +
                ", marketingDudette='" + marketingDudette + '\'' +
                '}';
    }
}
