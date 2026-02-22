class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        // Step 1: Count frequency of each task
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        // Step 2: Find maximum frequency
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Step 3: Count how many tasks have max frequency
        int maxCount = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                maxCount++;
            }
        }

        // Step 4: Calculate result
        int intervals = (maxFreq - 1) * (n + 1) + maxCount;

        // Step 5: Return max of intervals and total tasks
        return Math.max(intervals, tasks.length);
    }
}