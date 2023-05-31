package 자료구조.프린터큐;

/*
    프린터큐 https://www.acmicpc.net/problem/1966
    메모리 15156KB	시간 164ms
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Document {
        int idx;
        int priority;

        public Document(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }

    static int n; // 문서의 개수
    static int m; // 궁금한 출력 인덱스

    static Queue<Document> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.offer(new Document(j, Integer.parseInt(st.nextToken())));
            }

            check();
        }
    }

    static void check() {

        int count = 1;

        while (!queue.isEmpty()) {
            Document document = queue.poll();
            boolean priorityCheck = true;

            for (Document value : queue) {
                if (document.priority < value.priority) {
                    priorityCheck = false;
                    break;
                }
            }

            if (priorityCheck) {
                if (document.idx == m) {
                    System.out.println(count);
                }
                count++;
            } else {
                queue.offer(document);
            }

        }

    }
}
