package co.foodService;
import java.util.Scanner;
import lombok.Getter;

@Getter
public class Cafe {
    private double frenchFries = 50;
    private double burger = 30;
    private double coffee = 23;
    private double pizza = 76;
    private double garlicBread = 15.5;
    private double temp = 0;
    private String orderAgain;
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("What you would like to have today, This is our menu");
        System.out.println(" ================================================== ");
        System.out.println("1. frenchFries = " + frenchFries);
        System.out.println("2. burger = " + burger);
        System.out.println("3. coffee = " + coffee);
        System.out.println("4. pizza = " + pizza);
        System.out.println("5. garlicBread = " + garlicBread);
        order();

    }

    public void order() throws RuntimeException {
        do {
            System.out.println("Please Enter your choice");
            int i = sc.nextInt();
            if (i>5) {
                throw new RuntimeException("Please put valid integer number");

            }
            switch (i) {
                case (1):
                    System.out.println("How many french fries you want " + frenchFries);
                    int i1 = sc.nextInt();
                    double total = i1 * frenchFries;
                    bill(total);
                    System.out.println("your total is " + i1 * frenchFries);
                    break;
                case (2):
                    System.out.println("How many burger you want " + burger);
                    int i2 = sc.nextInt();
                    System.out.println("your total is " + i2 * burger);
                    double total2 = i2 * burger;
                    bill(total2);
                    break;
                case (3):
                    System.out.println("How many coffee you want " + coffee);
                    int i3 = sc.nextInt();
                    System.out.println("your total is " + i3 * coffee);
                    double total3 = i3 * coffee;
                    bill(total3);
                    break;
                case (4):
                    System.out.println("How many pizza you want " + pizza);
                    int i4 = sc.nextInt();
                    System.out.println("your total is " + i4 * pizza);
                    double total4 = i4 * pizza;
                    bill(total4);
                    break;
                case (5):
                    System.out.println("How many garlicBread you want " + garlicBread);
                    int i5 = sc.nextInt();
                    System.out.println("your total is " + i5 * garlicBread);
                    double total5 = i5 * garlicBread;
                    bill(total5);
                    break;
                default:
                   throw  new  RuntimeException("Please Enter valid input");
                   }


            System.out.println("Anything else! (Y/N)");
            orderAgain = sc.next();
        } while (orderAgain.equals("Y"));

        if (orderAgain.equals("N")) {
            System.out.println("your total bill is :" + temp);
        }else {
            throw  new RuntimeException("Please enter Y/N as input");
        }
    }
    private void bill(double billOfItem) {
        temp = temp + billOfItem;
    }
}
