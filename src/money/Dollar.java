package money;

import java.util.Objects;

/**
 * @author KIYOTA, Takeshi
 */
class Dollar extends Money {

    private String currency;

    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
