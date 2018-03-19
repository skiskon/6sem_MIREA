package Work2;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.LinkSource;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.*;

public class Tree {
    Node head;

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
                    return;

                }
                now = now.left;
                continue;
            }
            if (now.right == null) {
                now.right = node;
                return;

            }
            now = now.right;

        }
    }

    public void balance(){

    }

    public void dell(){

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
            printNode(node.left, deep + 1);
            printNode(node.right, deep + 1);
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
