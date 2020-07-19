package money;

import java.util.Objects;

/**
 * @author KIYOTA, Takeshi
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }


}
