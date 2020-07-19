package money;

/**
 * @author KIYOTA, Takeshi
 */
public class Sum implements Expression{

    public Money augend; // 被加算数(足される方の数)

    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
