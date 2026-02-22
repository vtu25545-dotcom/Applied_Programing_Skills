import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add current request time
        queue.offer(t);

        // Remove outdated requests
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        // Number of requests in the last 3000 ms
        return queue.size();
    }
}