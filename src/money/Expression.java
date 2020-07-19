package money;

/**
 * @author KIYOTA, Takeshi
 */
public interface Expression {
    Money reduce(Bank bank, String no);

    Expression plus(Expression addend);
}
