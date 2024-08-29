public class RewardValue {
    private final double cash;
    private int miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
        this.cash = this.miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return (int) (this.cash / 0.0035);
    }
}
