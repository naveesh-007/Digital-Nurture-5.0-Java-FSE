package AdapterPattern;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());

        System.out.println("----- PayPal Payment -----");
        paypal.processPayment(5000);

        System.out.println("\n----- Stripe Payment -----");
        stripe.processPayment(7500);
    }
}