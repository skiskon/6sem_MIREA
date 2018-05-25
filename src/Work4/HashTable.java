package Work4;

import org.omg.PortableInterceptor.INACTIVE;

public class HashTable {
    private Data[] massiv;
    private int[] schet;
    private HashFunction h1,h2;
    private int count = 0;
    public HashTable(int length, HashFunction h1, HashFunction h2) {
        this.h1 = h1;
        this.h2 = h2;
        massiv = new Data [length];
        schet = new int[length];
    }

    public void dell(int key){
        int i;
        int index = findIndex(key);
        if (index == -1) {
            System.out.println("Нельзя удалить несуществующий элемент");
            return;
        }
        count--;
        int hash = h1.calc(key);
        index = hash % massiv.length;
        schet[index]--;
        if (massiv[index].key == key){
            massiv[index] = null;
            return;
        }
        while (massiv[index].key != key) {
            hash += h2.calc(key);
            index = hash % massiv.length;
            schet[index]--;
        }
        massiv[index] = null;





    }

    public boolean add(Data data){
        int currnetIndex = findIndex(data.key);
        if (currnetIndex != -1) {
            return false;
        }
        if (count == massiv.length) return false;
        count++;
        int hash = h1.calc(data.key);
        int index = hash % massiv.length;
        schet[index]++;
        if (massiv[index] == null){
            massiv[index] = data;
            return true;
        }
        int i = 0;
        while (massiv[index] != null){
            hash = (h1.calc(data.key)+ i*h2.calc(data.key));
      //      hash += h2.calc(data.key);
            index = hash % massiv.length;
          //  System.out.println(hash+"   "+index);
            schet[index]++;
            i++;


        }
        massiv[index] = data;
        return true;
    }
    public Data find(int key){
        int index = findIndex(key);
        return index == -1?null:massiv[index];

    }
    private int findIndex(int key){
        int i = 0;
        int index = (h1.calc(key)+ i*h2.calc(key)) % massiv.length;

        while (massiv[index] != null && massiv[index].key != key){
            if (schet[index] < 2) return -1;
            i++;
            index = (h1.calc(key)+ i*h2.calc(key)) % massiv.length;
        }
        return massiv[index] == null ? -1 : index;
    }
    public void print(){
        for (int i = 0;i < massiv.length;i++){
            System.out.println(i+": "+schet[i]+" "+massiv[i]);
        }
        System.out.println("----------------------------------------");
    }

}
