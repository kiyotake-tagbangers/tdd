package money;

/**
 * @author KIYOTA, Takeshi
 */
public class Sum implements Expression{

    Money augend; // 被加算数(足される方の数)

    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank,to).amount;
        return new Money(amount, to);
    }
}
