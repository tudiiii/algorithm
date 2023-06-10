package 트리순회;

/*
    트리 순회 https://www.acmicpc.net/problem/1991
    메모리 14172KB	시간 128ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static  class Node{
        char value;
        Node left;
        Node right;

        public Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void createNode(Node temp, char root, char left, char right) {
        if (temp.value == root) {
            temp.left = (left == '.' ? null : new Node(left,null,null));
            temp.right = (right == '.' ? null : new Node(right,null,null));
        }else {
            if(temp.left != null) createNode(temp.left, root, left, right);
            if(temp.right != null) createNode(temp.right, root, left, right);
        }
    }

    public static void preOrder(Node node) {
        if(node==null) return;
        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }

    static Node head = new Node('A', null, null);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            createNode(head, root,left,right);
        }

        preOrder(head);
        System.out.println();

        inOrder(head);
        System.out.println();

        postOrder(head);

        br.close();
    }

}
