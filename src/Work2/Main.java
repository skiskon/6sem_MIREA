package Work2;


import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(new Data(5));
        tree.add(new Data(9));
        tree.add(new Data(456));
        tree.add(new Data(1));
        tree.add(new Data(6546));
        tree.add(new Data(7));



        tree.print();

    }
//    static void vivod(Object obj)
//    {
//        System.out.println(obj.toString());
//    }
//        Graph g = graph("example1").directed().with(node("a").link(node("b")));
//        Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/ex1.png"));
//        tree.vivod();
//        // System.out.println("sdsddsd");
//    }
}
