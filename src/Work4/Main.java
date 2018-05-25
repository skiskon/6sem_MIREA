package Work4;

import Work4.HashFunctions.Divide11;
import Work4.HashFunctions.Qoubik;
import Work4.HashFunctions.Squidward;

public class Main {
    public static void main(String[] args) {
        Work4.HashTable table1 = new HashTable(113,new Divide11(),new Qoubik());
        HashTable table2 = new HashTable(113,new Squidward(),new Qoubik());
        HashTable table3 = new HashTable(113,new Divide11(),new Squidward());
        int rand;
        int a = 100;
        rand =  (int) (1 +  (Math.random() * a));
 //       System.out.println(rand);
        for (int i = 0;i < 1; i++){
            System.out.println(rand);
            rand = (int) ( 1+ (Math.random() * a));
            table1.add(new Data(rand));
            table2.add(new Data(rand));
            table3.add(new Data(rand));
        }
        int b;
        int c;
//        while (true){
//            System.out.println("ВВедите команду:1. Добавление, 2. удаление, 3. поиск, 4. выйти");
//            Scanner in = new Scanner(System.in);
//             b = in.nextInt();
//            System.out.println("Введите ключ элемента");
//             c = in.nextInt();
//            if (b == 1){
//                table1.add(new Data(c));
//            }
//            if (b == 2){
//                table1.dell(c);
//            }
//            if (b == 3){
//                table1.find(c);
//            }
//            if (b == 4){
//                break;
//            }
//        }

        table1.add(new Data(2));
        table1.add(new Data(2));

        table1.print();
//        table2.print();
//        table3.print();

    }
}
