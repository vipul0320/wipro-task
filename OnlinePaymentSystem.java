/*Design an Online Payment System with an abstract class PaymentMethod containing an abstract method 
processPayment(). Create two derived classes: CreditCard and PayPal, each implementing the processPayment() 
method differently (for example, one might charge a fee, and the other might not). Create a method 
processTransaction(PaymentMethod paymentMethod) that accepts a PaymentMethod object and processes the payment 
by calling processPayment(). Demonstrate polymorphism by using both CreditCard and PayPal objects in the 
transaction processing system. */


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
