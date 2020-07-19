package money;

/**
 * Dollar,Franc を共通化したクラス
 *
 * @author KIYOTA, Takeshi
 */
public class Money implements Expression {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    ;

    String currency() {
        return currency;
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;

        // クラスではなく currency を比較する
        return amount == money.amount && currency().equals(money.currency());
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to); // 為替レートは bank 引数に問合わせる
        return new Money(amount / rate, to);
    }
}
