package lotto.domain;

public enum Statistics {
    THREE(3, 5_000),
    FOUR(4, 50_000),
    FIVE(5, 1_500_000),
    SIX(6, 2_000_000_000);

    private int matchCount;
    private double money;

    Statistics(int matchCount, int money) {
        this.matchCount = matchCount;
        this.money = money;
    }


    public double getYield(int buyAmount, int winningAmount) {
        return (double) winningAmount / buyAmount;
    }

}
