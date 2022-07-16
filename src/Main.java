public class Main {
    public static void main(String[] args) {
        int account = 88;
        int bonus = 100;
        int replen = 2320;
        int bonusAccount = 0;

        if (replen > 1000){
            bonusAccount = replen / bonus;
        }
        int finalAccount = account + replen + bonusAccount;
        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println("Количество бонусных рублей: " + bonusAccount);
    }
}
