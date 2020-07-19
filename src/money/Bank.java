package money;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KIYOTA, Takeshi
 */
class Bank {

    private Map<Pair, Integer> rates = new HashMap<>();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRoute(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to){
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }
}