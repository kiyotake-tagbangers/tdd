package money;

/**
 * Dollar,Franc を共通化したクラス
 * @author KIYOTA, Takeshi
 */
public class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    };

    String currency(){
        return currency;
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;

        // クラスではなく currency を比較する
        return amount == money.amount && currency().equals(money.currency());
    }
}
