/* */


abstract class PaymentMethod {
    public abstract void processPayment();
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via Credit Card.");
        System.out.println("A transaction fee of 2% is charged for Credit Card payments.");
    }
}

class PayPal extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via PayPal.");
        System.out.println("No transaction fee for PayPal payments.");
    }
}

public class OnlinePaymentSystem {

    public static void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }

    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        System.out.println("Transaction 1:");
        processTransaction(creditCard);

        System.out.println("\nTransaction 2:");
        processTransaction(payPal);
    }
}
