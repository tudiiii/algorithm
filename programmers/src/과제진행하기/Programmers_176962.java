package 과제진행하기;

import java.util.PriorityQueue;
import java.util.Stack;

class Programmers_176962 {
    public String[] solution(String[][] plans) {
        PriorityQueue<Task> pq = new PriorityQueue<>();

        for (String[] s : plans) {
            pq.offer(new Task(s[0], s[1], s[2]));
        }

        Stack<Task> stack = new Stack<>();
        String[] answer = new String[plans.length];
        int idx = 0;

        int current = pq.peek().start;
        while (!pq.isEmpty() || !stack.isEmpty()) {
            if (stack.isEmpty()) {
                stack.push(pq.poll());
                current = stack.peek().start;
            }

            if (!pq.isEmpty() && pq.peek().start < current + stack.peek().playtime) {
                stack.peek().playtime -= pq.peek().start - current;
                stack.push(pq.poll());
                current = stack.peek().start;
            }else {
                current += stack.peek().playtime;
                answer[idx++] = stack.pop().name;
            }
        }

        return answer;
    }

    static class Task implements Comparable<Task>{
        private final String name;
        private final int start;
        private int playtime;

        public Task(String name, String start, String playtime) {
            this.name = name;
            this.start = timeToMinute(start);
            this.playtime = Integer.parseInt(playtime);
        }

        public int timeToMinute(String start) {
            String[] tmp = start.split(":");
            int h = Integer.parseInt(tmp[0]) * 60;
            int m = Integer.parseInt(tmp[1]);

            return h + m;
        }

        @Override
        public int compareTo(Task o) {
            return this.start - o.start;
        }
    }

}
