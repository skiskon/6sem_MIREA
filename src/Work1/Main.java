package Work1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Scanner in = new Scanner(System.in);
        System.out.println("Dobro boz'alovat'");
        System.out.println("Please choose what you want:\n1.Add Item\n2.Delete Item\n3.List the list\n4.Exit");
        int num = in.nextInt();
        boolean bol = true;
        while (bol) {
            if (num == 1) {
                System.out.println("Vvedite zna4enie klu4a v vide 4isla");
                int key = in.nextInt();
                System.out.println("Vvedite na kakoe mesto trebuetsa dobavit' element");
                int numad = in.nextInt();
                list.add(new Data(key), numad);
                System.out.println("Vvedite novuu komandu");

            }
            if (num == 2) {
                System.out.println("Vvedite nomer elementa, kotorii trebuetsa udalit");
                int numdel = in.nextInt();
                list.dell(numdel);
                System.out.println("Vvedite novuu komandu");
            }
            if (num == 3) {
                vivod(list);
                System.out.println("Vvedite novuu komandu");
            }
            if (num == 4) {
                System.out.println("Spasibo za vnimanie");
//                return;
                break;
            }
            num = in.nextInt();
        }
        System.out.println(list.find(2).data);

//        list.add(new Work1.Data(1), 5); vivod(list);
//        list.add(new Work1.Data(2), 5);vivod(list);
//        list.add(new Work1.Data(3), 5);vivod(list);
//        list.add(new Work1.Data(4), 5);vivod(list);
//        list.add(new Work1.Data(5), 5);vivod(list);
//        list.add(new Work1.Data(6), 5);vivod(list);
//        list.add(new Work1.Data(7), 5);vivod(list);
//        list.dell(2);
//        System.out.println("Hello World!");
//        vivod(list);
    }

    static void vivod(Object obj)
    {
        System.out.println("=----------=");
        System.out.println(obj.toString());
        System.out.println("=----------=");
    }
}
