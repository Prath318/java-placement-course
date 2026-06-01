import java.util.ArrayList;
import java.util.Scanner;

public class Graph {

    int countNodes;
    ArrayList<String> nodes;
    ArrayList<ArrayList<Integer>> graph;

    Graph() {
        countNodes = 0;
        nodes = new ArrayList<>();
        graph = new ArrayList<>();
    }

    //add node to graph

    public void addNode(String v) {
        if (nodes.contains(v)) {
            System.out.println("Node already present");
        } else {
            nodes.add(v);
            countNodes++;

            for (ArrayList<Integer> row : graph) {
                row.add(0);
            }

            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < countNodes; i++) {
                temp.add(0);
            }

            graph.add(temp);
            System.out.println("Node added successfully");
        }
    }
//add edge to graph
    public void addEdge(String v1, String v2) {
        if (!nodes.contains(v1)) {
            System.out.println(v1 + " is not available in graph");
        } else if (!nodes.contains(v2)) {
            System.out.println(v2 + " is not available in graph");
        } else {
            int index1 = nodes.indexOf(v1);
            int index2 = nodes.indexOf(v2);

            graph.get(index1).set(index2, 1);
            graph.get(index2).set(index1, 1);

            System.out.println("Edge added successfully");
        }
    }

//add undirected weighted edge to graph

    public void addEdgeUndirectedWeighted(String v1, String v2, int w) {
        if (!nodes.contains(v1)) {
            System.out.println(v1 + " is not available in graph");
        } else if (!nodes.contains(v2)) {
            System.out.println(v2 + " is not available in graph");
        } else {
            int index1 = nodes.indexOf(v1);
            int index2 = nodes.indexOf(v2);

            graph.get(index1).set(index2, w);
            graph.get(index2).set(index1, w);

            System.out.println("Weighted edge added successfully");
        }
    }

    //add directed weighted edge to graph

    public void addEdgeDirectedWeighted(String v1, String v2, int w) {
        if (!nodes.contains(v1)) {
            System.out.println(v1 + " is not available in graph");
        } else if (!nodes.contains(v2)) {
            System.out.println(v2 + " is not available in graph");
        } else {
            int index1 = nodes.indexOf(v1);
            int index2 = nodes.indexOf(v2);

            graph.get(index1).set(index2, w);

            System.out.println("Directed weighted edge added successfully");
        }
    }

    //delete node from graph

    public void deletedNode(String del) {
        if (!nodes.contains(del)) {
            System.out.println("Node is not present in graph");
        } else {
            int index = nodes.indexOf(del);

            graph.remove(index);

            for (ArrayList<Integer> row : graph) {
                row.remove(index);
            }

            nodes.remove(index);
            countNodes--;

            System.out.println("Node deleted successfully");
        }
    }

    //print graph

    public void printGraph() {
        System.out.print("  ");

        for (String node : nodes) {
            System.out.print(node + " ");
        }

        System.out.println();

        for (int i = 0; i < countNodes; i++) {
            System.out.print(nodes.get(i) + " ");

            for (int j = 0; j < countNodes; j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Graph ob = new Graph();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Node");
            System.out.println("2. Add Edge");
            System.out.println("3. Add Undirected Weighted Edge");
            System.out.println("4. Add Directed Weighted Edge");
            System.out.println("5. Print Graph");
            System.out.println("6. Delete Node");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Vertex: ");
                    String v = sc.next();
                    ob.addNode(v);
                    break;

                case 2:
                    System.out.print("Enter Vertex 1: ");
                    String v1 = sc.next();

                    System.out.print("Enter Vertex 2: ");
                    String v2 = sc.next();

                    ob.addEdge(v1, v2);
                    break;

                case 3:
                    System.out.print("Enter Vertex 1: ");
                    String v11 = sc.next();

                    System.out.print("Enter Vertex 2: ");
                    String v21 = sc.next();

                    System.out.print("Enter Weight: ");
                    int w = sc.nextInt();

                    ob.addEdgeUndirectedWeighted(v11, v21, w);
                    break;

                case 4:
                    System.out.print("Enter Vertex 1: ");
                    String v12 = sc.next();

                    System.out.print("Enter Vertex 2: ");
                    String v22 = sc.next();

                    System.out.print("Enter Weight: ");
                    int w1 = sc.nextInt();

                    ob.addEdgeDirectedWeighted(v12, v22, w1);
                    break;

                case 5:
                    ob.printGraph();
                    break;

                case 6:
                    System.out.print("Enter Node to Delete: ");
                    String del = sc.next();

                    ob.deletedNode(del);
                    break;

                case 0:
                    System.out.println("Program Ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}