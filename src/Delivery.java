import java.util.concurrent.TimeUnit;

public class Delivery extends Seller {
    public Delivery() {
        String order = orderNum + numberItem;
        String orderInfo = orderNum + street + house + flat;

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();

        }
        if (numberItem == 1) {
            double cheque = 0;
            double chequeOrder = cheque + 100;
        } else if (numberItem == 2) {
            double cheque = 0;
            double chequeOrder = cheque + 160;
        } else if (numberItem == 3) {
            double cheque = 0;
            double chequeOrder = cheque + 210;
        }
        System.out.println(" Курьер получил заказ");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }System.out.println(" Заказ доставлен");
        System.out.println(" Приянтого аппетита,пожалуйста оцените сервис от 1 до 10 для его улучшения");
    }String order;
    String chequeOrder;

}
