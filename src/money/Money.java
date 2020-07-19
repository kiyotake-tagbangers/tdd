package money;

/**
 * Dollar,Franc を共通化したクラス
 * @author KIYOTA, Takeshi
 */
public abstract class Money {

    protected int amount;


    abstract Money times(int i);

    abstract String currency();

    static Money franc(int amount) {
        return new Franc(amount);
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;

        // 実クラスが等しい時のみ等価であると判定
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
