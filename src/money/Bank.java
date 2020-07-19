package money;

/**
 * @author KIYOTA, Takeshi
 */
class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRoute(String from, String to, int rate) {
    }

    int rate(String from, String to){
        return  (from.equals("CHF") && to.equals("USD")) ? 2: 1;
    }
}
