package Work1;

/**
 * Created by Max on 01.03.2018.
 */
public class Data {
    int key;
    String value;

    public Data(int key) {
        this.key = key;
        value = "key " + key;
    }

    @Override
    public String toString() {
        return "Work1.Data{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    public int getKey() {
        return key;
    }
}
