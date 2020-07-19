package money;

import java.util.Objects;

/**
 * @author KIYOTA, Takeshi
 */
public class Franc extends Money{

    Franc(int amount){
        this.amount = amount;
    }


    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
