// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int balancePut = 1100;
        int bonus = balancePut / 100;
        int bonusBalance = balance + balancePut + bonus;
        int normalBalance = balance + balancePut;
            if (balancePut > 1000) {
                System.out.println("Ваш баланс:" + bonusBalance);
            } else {
                System.out.println("Ваш баланс:" + normalBalance);
            }
        }
    }