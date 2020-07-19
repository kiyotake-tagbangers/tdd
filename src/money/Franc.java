package money;

import java.util.Objects;

/**
 * @author KIYOTA, Takeshi
 */
class Franc extends Money{

    private String currency;

    Franc(int amount){
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
