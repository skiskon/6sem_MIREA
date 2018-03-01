/**
 * Created by Max on 01.03.2018.
 */
public class List {
    Item head = new Item(null);

    public void add(Data data){
        if (this.head == null) {
            this.head.data = data;
            this.head.next = this.head;
            this.head.prev = this.head;

        }
        else {
            Item nov = new Item(data){
                
            }

        }
    }


}
