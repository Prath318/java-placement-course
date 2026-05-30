import java.util.Scanner;

public class Trees {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root = null;

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // 🔎 Search method
    public boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trees tree = new Trees();

        while (true) {
            System.out.println("\n1. Insert (Array of values)");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int arr[] = {36, 26, 46, 21, 31, 11, 24, 41, 56, 51, 66};
                    for (int i = 0; i < arr.length; ++i) {
                        tree.root = tree.insert(tree.root, arr[i]);
                    }
                    System.out.println("Inserted array elements into tree.");
                    break;

                case 2:
                    System.out.print("Inorder: ");
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Preorder: ");
                    tree.preorder(tree.root);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Postorder: ");
                    tree.postorder(tree.root);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    if (tree.search(tree.root, key)) {
                        System.out.println(key + " found in tree.");
                    } else {
                        System.out.println(key + " not found in tree.");
                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
