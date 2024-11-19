public class BonusMilesService {
    int bonus;

    public int calculate(int sumTicket) {
        if (sumTicket > 20) {
            bonus = sumTicket / 20;
            System.out.println("Ваше количество миль " + bonus);
        } else {
            System.out.println("Сумма покупки недостаточно для получения подарочных миль");
        }
        return bonus;
    }
}
