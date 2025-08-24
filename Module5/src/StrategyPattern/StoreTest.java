package StrategyPattern;

public class StoreTest {

    public static void main(String[] args) {
        VkusVill vkusVill = new VkusVill();
        vkusVill.display();
        vkusVill.checkout(2000);
        vkusVill.getReceipt();
        vkusVill.setPaymentMethod(new CreditCardPayment("554444", "John Doe"));
        vkusVill.checkout(3000);

        OnlineStore onlineStore = new OnlineStore();
        onlineStore.display();
        onlineStore.checkout(5000);
        onlineStore.getReceipt();
    }
}
