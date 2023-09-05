package ro.fasttrackit.Exercise1;

public class AdsMain {
    public static void main(String[] args) {
        Ads facebook = new Facebook(50, "Ana");
        Ads email = new Email(25, "Anca");
        Ads print = new Print(5, "Gelu");

        System.out.println(facebook);
        System.out.println(email);
        System.out.println(print);
        facebook.runAds();
        email.runAds();
        print.runAds();
        print.runAds();
        print.runAds();
        print.runAds();
        print.runAds();
        print.runAds();
        print.runAds();
        System.out.println(facebook);
        System.out.println(email);
        System.out.println(print);

    }
}
