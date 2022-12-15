package 자료구조.큐2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_18258 {	// 메모리 355228KB	시간 1464ms

    public static Deque<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(st.hasMoreTokens()){
                push(Integer.parseInt(st.nextToken()));
            }else if(str.equals("pop")) {
                sb.append(pop()).append("\n");
            }else if(str.equals("size")) {
                sb.append(size()).append("\n");
            }else if(str.equals("empty")) {
                sb.append(empty()).append("\n");
            }else if(str.equals("front")) {
                sb.append(front()).append("\n");
            }else if(str.equals("back")) {
                sb.append(back()).append("\n");
            }

        }

        System.out.println(sb);
    }

    public static void push(int item){
        queue.add(item);
    }

    public static int pop(){
        if(queue.isEmpty()) return -1;
        else return queue.pop();
    }

    public static int size(){
        return queue.size();
    }

    public static int empty(){
        if(queue.isEmpty()) return 1;
        else return 0;
    }

    public static int front(){
        if(queue.isEmpty()) return -1;
        else {
            return queue.getFirst();
        }
    }

    public static int back(){
        if(queue.isEmpty()) return -1;
        else {
            return queue.getLast();
        }
    }

}
