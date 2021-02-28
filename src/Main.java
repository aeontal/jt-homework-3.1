public class Main {
    public static void main(String[] args) {
        double amount = 1_075;
        double mult = 20;
        double reminder = 0;
        double bonus_miles = reminder + amount / mult;
        double total_bonus = Math.floor(bonus_miles);
        reminder = bonus_miles - total_bonus;
        System.out.println(total_bonus);
    }

}
