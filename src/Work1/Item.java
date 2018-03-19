package Work1;

/**
 * Created by Max on 01.03.2018.
 */
public class Item {
    Data data;
    Item next;
    Item prev;

    public Item(Data data) {
        this.data = data;
        this.next = null;
        this.prev = null;

    }

}
