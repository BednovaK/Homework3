public class BonusMilesService {
    public int calculate(int priceTicket) {
        int bonusMile = 20;
        int bonus = priceTicket / bonusMile;
        return bonus;
    }
}
