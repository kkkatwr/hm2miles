public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int amountBonusMiles = service.ticketPrice(price);
        System.out.println(amountBonusMiles);
    }
}