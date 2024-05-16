class Node {
    int info;
    Node left, right;

    Node(int info) {
        this.info = info;
        this.right = this.left = null;
    }
}

class BinarySearchTree {
    Node root;

    public Node createTree(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        this.root = node;

        node.left = creatTree(arr, start, mid - 1);
        node.right = createTree(arr, mid + 1, end);

        return node;
    }

    public void inorderTraversal(Node node) {
        System.out.print("Inorder Traversal: ");
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.info + " ");
            inorderTraversal(node.right);
        }

    }
}

public class A8Q5 {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        BinarySearchTree tree = new BinarySearchTree();
        tree.createTree(arr, 0, arr.length);
        tree.inorderTraversal(tree.root);
    }
}
