package ro.fasttrackit.Exercise1;

public class Email implements Ads {
    private int budget;
    private String marketingDudette;

    public Email(int budget, String marketingDudette) {
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
        System.out.println("Email ads running, though nobody likes these.");
        if (this.budget <= 0) {
            System.out.println("Mergem pe datorie");
        }
        this.budget -= 2;
    }

    @Override
    public String
    toString() {
        return "Email{" +
                "budget=" + budget +
                ", marketingDudette='" + marketingDudette + '\'' +
                '}';
    }
}
