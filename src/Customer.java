import java.util.Scanner;

public class Customer extends Delivery{
    public Customer() {
        String customerOrder = order + chequeOrder;
        Scanner scanner = new Scanner(System.in);
        int feedback = scanner.nextInt();

        if (feedback > 10) {
            System.out.println(" Спасибо за щедрую оценку ;)");
        } else if (feedback >= 5) {
            System.out.println(" Мы ради что вам все понравилось :)");
        } else if (feedback < 5) {
            System.out.println(" Мы будем стараться ради вас!");

        }System.out.println(" Ждем вас снова!");
    }
}
