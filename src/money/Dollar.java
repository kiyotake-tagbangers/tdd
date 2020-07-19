package money;

import java.util.Objects;

/**
 * @author KIYOTA, Takeshi
 */
class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
