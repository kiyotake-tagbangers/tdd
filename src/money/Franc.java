package money;

import java.util.Objects;

/**
 * @author KIYOTA, Takeshi
 */
public class Franc {
    private int amount;
    Franc(int amount){
        this.amount = amount;
    }


    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }
}
