package Work1;

/**
 * Created by Max on 01.03.2018.
 */
public class List {
    Item head;
    int k = 0;

    public void add(Data data, int pos) {
        Item item = new Item(data);
        if (head == null) {
            head = item;
            head.next = head;
            head.prev = head;
            k++;
            return;
        }
        Item now = head;

        if (pos <= k) {
            for (int i = 1; i < pos; i++) {
                now = now.next;
            }
        }

        item.prev = now.prev;
        now.prev.next = item;
        now.prev = item;
        item.next = now;
        k++;
    }

    public void dell(int pos) {
        Item now = head;
        for (int i = 1; i < pos; i++) {
            now = now.next;

        }
        now.prev.next = now.next;
        now.prev = null;
        now.next.prev = now.prev;
        now.next = null;
        k--;
        return;
    }

    @Override
    public String toString() {
        if (k == 0) return "Spisot pust";
        StringBuilder builder = new StringBuilder();
        Item now = head;
        for (int i = 1; i <= k; i++) {
            builder.append(i);
            builder.append(": ");
            builder.append(now.data.toString());
            builder.append("\n");
            now = now.next;
        }
        return builder.toString();
    }
}