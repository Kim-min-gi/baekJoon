



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}


public class Main {
    Node root;

    public void BFS(Node root){
        int level = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
//        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()){
            int length = queue.size();
            System.out.print(level + " : ");
            for (int i =0; i<length; i++){
                Node result = queue.poll();
                System.out.print(result.value + " ");
                if(result.left != null) queue.offer(result.left);
                if(result.right != null) queue.offer(result.right);
            }
            level++;
            System.out.println();
        }



    }



    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.BFS(tree.root);


    }
}