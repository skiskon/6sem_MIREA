package Work2;

//import guru.nidi.graphviz.engine.Format;
//import guru.nidi.graphviz.engine.Graphviz;
//import guru.nidi.graphviz.model.Graph;
//import guru.nidi.graphviz.model.LinkSource;
//
//import java.io.File;
//import java.io.IOException;
//
//import static guru.nidi.graphviz.model.Factory.*;

public class Tree {
     int i = 1;
    Node head;

    public int getI() {
        return i;
    }

    public Tree() {
        head = null;
    }

    public void add(Data a) {
        Node node = new Node(a);

        if (head == null) {
            head = node;
            head.data = a;
            return;
        }

        Node now = head;
        while (true) {
            if (a.key > now.data.key) {
                if (now.left == null) {
                    now.left = node;
                    i++;
                    return;

                }
                now = now.left;
                continue;
            }
            if (now.right == null) {
                now.right = node;
                i++;
                return;

            }
            now = now.right;

        }
    }

    public void balance(){
        double k;
        k = Math.log(i+1)/Math.log(2);
        if (i != 1 && i != 3 && i != 7 && i != 15 && i != 31 && i != 63 && i != 127){
            System.out.println("Nevernoe kili4estvo elementov");
            return;
        }
        Node node;
        while (head.right != null){
            if (head.right.left == null){
                node = head.right;
                node.left = head;
                node.left.right = null;
                head = node;
                System.out.println("======"+node.left);
                continue;
            }
            node = head.right;
            head.right = node.left;
            node.left = head;
            head = node;

        }

        node = head;
        Node tmp;
        while (node != null) {
            while (node.left.right != null) {
              //  if (node.left.right != null) {
                    tmp = node.left;
                    node.left = node.left.right;
                    tmp.right = node.left.left;
                    node.left.left = tmp;
               // }
            }
            node = node.left;
            if (node.left == null){
                break;
            }
        }


        for (int u = 1; u < k;u++) {
            node = head;
            tmp = node.left;
            node.left = node.left.right;
            tmp.right = node;
            head = tmp;

            for (int j = 1; j < (Math.pow(2, k - u) - 1); j++) {
                node = head;
                tmp = head.left;
                node.left = node.left.left;
                tmp.left = node.left.right;
                node.left.right = tmp;
                head = node;


            }
        }


//                node.left.right = node;
//                node = node.left;
//                node.right.left = null;
//                head = node;
//                node = node.left;

//                node.left.left.right = node.left;
//                node.left.left = node.left;
//                node.left.right.left = null;











    }


//    @Override
//    public String toString() {
//        if (head == null) return "Spisok pust";
//        StringBuilder builder = new StringBuilder();
//        Node now = head;
//        builder.append(now.data.key+"\n");
//        int k = 0;
//        while (true){
//            if (now.left != null){
//                for (int i=0;i<k;i++){
//                    builder.append("-");
//                }
//                builder.append(now.left.data.key+"\n");
//                now = now.left;
//            }
//
//
//
//            now = now.next;
//        }
//        return builder.toString();
//    }

    public void print()
    {
        printNode(head, 0);
    }

    private void printNode(Node node, int deep)
    {
        for (int i = 0; i  < deep; i++)
            System.out.print('-');
        System.out.println(node == null ? "null" : node.data.key);
        if (node != null) {
            printNode(node.right, deep + 1);
            printNode(node.left, deep + 1);

        }

    }
//    public void vivod() throws IOException {
//        Graph g = graph("example2").directed();
//        Node now = head;
//        guru.nidi.graphviz.model.Node node = node(now.data.key + "");
//       //Enter(head, node);
//        g.with(node);
//        Graphviz.fromGraph(g).width(900).render(Format.PNG).toFile(new File("example/ex2.png"));
//    }
//
//    private void Enter(Node n, guru.nidi.graphviz.model.Node source)
//    {
//        if (n.left != null)
//        {
//            guru.nidi.graphviz.model.Node node = node(n.left.data.key + "");
//            source.link(node);
//            Enter(n.left, node);
//        }
//        if (n.right!= null)
//        {
//            guru.nidi.graphviz.model.Node node = node(n.right.data.key + "");
//            source.link(node);
//            Enter(n.right, node);
//        }
//    }


}
