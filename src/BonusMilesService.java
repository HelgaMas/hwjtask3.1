public class BonusMilesService {
    public int calculate(int ticketPrice) {
        System.out.println("Всего бонусных миль:");
        int oneMile = 20;
        int bonusMile = ticketPrice / oneMile;

        return bonusMile;
    }
}
