import java.util.Stack;

class FinalPrices {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ans[i] -= prices[stack.peek()];
            }

            stack.push(i);
        }

        return ans;
    }
}