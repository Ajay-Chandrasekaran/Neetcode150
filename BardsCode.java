import java.util.Arrays;
import java.util.PriorityQueue;

public class BardsCode {

    public static void main(String[] args) {
        // Get the input array from the user
        int[] array = {1, 5, 3, 2, 4};
        int k = 3;

        // Create a priority queue to store the first k elements of the array
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.add(array[i]);
        }

        // Iterate over the remaining elements of the array
        for (int i = k; i < array.length; i++) {
            // If the current element is smaller than the top element of the priority queue,
            // remove the top element and add the current element
            if (array[i] < queue.peek()) {
                queue.poll();
                queue.add(array[i]);
            }
        }

        // The top element of the priority queue is the kth smallest element
        System.out.println("The kth smallest element is " + queue.peek());
    }
}
