public class BonusMilesService {
    public int calculate (int cost) {
        int counter = 20; // кратность
        int price = 7000; // цена билета
        int miles = price / counter; // итоговый бонус
        return miles;
    }
}
