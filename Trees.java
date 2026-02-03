import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    public static void main(String[] args) {
        Node leafNode1 = new Node(20, null, null);
        Node leafNode2 = new Node(19, null, null);
        Node leafNode3 = new Node(18, null, null);
        Node leafNode4 = new Node(17, null, null);
        Node leafNode5 = new Node(16, null, null);
        Node leafNode6 = new Node(15, null, null);
        Node leafNode7 = new Node(14, null, null);
        Node leafNode8 = new Node(13, null, null);
        Node leafNode9 = new Node(12, null, null);
        Node leafNode10 = new Node(11, null, null);
        Node leafNode1L3 = new Node(10, leafNode1, null);
        Node leafNode2L3 = new Node(9, leafNode3, leafNode2);
        Node leafNode3L3 = new Node(8, leafNode5, leafNode4);
        Node leafNode1L2 = new Node(7, leafNode7, leafNode6);
        Node leafNode2L2 = new Node(6, leafNode9, leafNode8);
        Node leafNode3L2 = new Node(5, leafNode1L3, leafNode10);
        Node leafNode4L2 = new Node(4, leafNode3L3, leafNode2L3);
        Node leafNode1L1 = new Node(3, leafNode2L2, leafNode1L2);
        Node leafNode2L1 = new Node(2, leafNode4L2, leafNode3L2);
        Node rootNode = new Node(1, leafNode2L1, leafNode1L1);
        bfs(rootNode);
    }


    private static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
         
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            System.out.println(node.val);
        }
        
    }
}


class Node {
    Node left;
    Node right;
    int val;

    public Node (int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

