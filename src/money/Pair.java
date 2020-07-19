package money;

import java.util.Objects;

/**
 * 2つの通貨の組みをレートに紐付けする
 * @author KIYOTA, Takeshi
 */
class Pair {
    private String from;
    private String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    // ハッシュテーブルのキーとして使うためには
    // equals と hashCode メソッドの実装が必要
    @Override
    public boolean equals(Object o) {
        Pair pair = (Pair) o;
        return from.equals(pair.from) && to.equals(pair.to);
    }

    @Override
    public int hashCode() {
        return 0; // tmp implementation
    }
}
