package money;

/**
 * @author KIYOTA, Takeshi
 */
class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
