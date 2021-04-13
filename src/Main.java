public class Main {
    public static void main(String[] args) {
        double amount = 1_075;
        double mult = 20;
        double reminder = 0;
        double bonusMiles = reminder + amount / mult;
        double totalBonus = Math.floor(bonusMiles);
        reminder = bonusMiles - totalBonus;
        System.out.println(totalBonus);
    }

}
