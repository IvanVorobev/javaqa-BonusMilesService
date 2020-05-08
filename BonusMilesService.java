public class BonusMilesService {
    public int calculate(int price) {
        int bonusmilevalue = 20;
        int miles = price / bonusmilevalue;
        return miles;
    }
}
