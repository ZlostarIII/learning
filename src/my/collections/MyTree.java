package my.collections;

public class MyTree {

    private Node root;

    public MyTree() {
        this.root = null;
    }

    public void preOrder() {
        System.out.print("Pre-order traversal: ");
        preOrder(root);
        System.out.println("\n==================");
    }

    private void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        System.out.print("Post-order traversal: ");
        postOrder(root);
        System.out.println("\n==================");
    }

    private void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void inOrder() {
        System.out.print("In-order traversal: ");
        inOrder(root);
        System.out.println("\n==================");
    }

    private void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    private static class Node {
        Object data;
        Node left, right;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((data == null) ? 0 : data.hashCode());
            result = prime * result + ((left == null) ? 0 : left.hashCode());
            result = prime * result + ((right == null) ? 0 : right.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Node other = (Node) obj;
            if (data == null) {
                if (other.data != null)
                    return false;
            } else if (!data.equals(other.data))
                return false;
            if (left == null) {
                if (other.left != null)
                    return false;
            } else if (!left.equals(other.left))
                return false;
            if (right == null) {
                if (other.right != null)
                    return false;
            } else if (!right.equals(other.right))
                return false;
            return true;
        }

    }

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.root = new Node("Root");
        myTree.root.left = new Node("Child1");
        myTree.root.right = new Node("Child2");
        myTree.root.left.left = new Node("Child3");
        myTree.root.right.left = new Node("Child4");
        myTree.root.right.right = new Node("Child5");
        myTree.root.right.right.right = new Node("Child6");
        myTree.root.left.left.right = new Node("Child7");
        myTree.root.left.left.right.left = new Node("Child8");

        myTree.preOrder();
        myTree.postOrder();
        myTree.inOrder();
    }
}
