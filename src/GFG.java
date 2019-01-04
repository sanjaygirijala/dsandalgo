
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GFG {

	// Function to find maximum
	// value after 'm' operations
	static long findMax(int n, int m, int a[], int b[], int k[]) {
		int[] arr = new int[n + 1];
		// memset(arr, 0, sizeof(arr));

		// Start performing 'm' operations
		for (int i = 0; i < m; i++) {
			// Store lower and upper
			// index i.e. range
			int lowerbound = a[i];
			int upperbound = b[i];

			// Add k to the lower_bound
			arr[lowerbound] += k[i];

			// Reduce upper_bound+1
			// indexed value by k
			arr[upperbound + 1] -= k[i];
		}

		// Find maximum sum
		// possible from all values
		long sum = 0, res = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
			sum += arr[i];
			res = Math.max(res, sum);
		}

		// return maximum value
		return res;
	}

	// Driver code
	public static void main(String[] args) {
		// Number of values
		int n = 5;

		int a[] = { 0, 1, 2 };
		int b[] = { 1, 4, 3 };
		int k[] = { 100, 100, 100 };

		List<List<Integer>> queries = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			List<Integer> input = new ArrayList<Integer>();

			input.add(a[i]);
			input.add(b[i]);
			input.add(k[i]);

			queries.add(input);
		}

		// m is number of operations.
		int m = a.length;

		System.out.println("Maximum value after " + "'m' operations is " + findMax(n, m, a, b, k));
		System.out.println("Maximum value after " + "'m' operations is " + findMax(n, queries));
	}

  static long findMax(int n, List<List<Integer>> queries ) 
	{
		List<Integer> listsize = queries.get(0);
		
		int m=0;
		
		if(listsize!=null) {
			
			m = listsize.size();
		}
		

		int[] arr = new int[n + 1];
		// memset(arr, 0, sizeof(arr));

		// Start performing 'm' operations
		for (int i = 0; i < m; i++) {
			// Store lower and upper
			// index i.e. range

			List<Integer> list = queries.get(i);

			int lowerbound = list.get(0);
			int upperbound = list.get(1);
			int k = list.get(2);

			// Add k to the lower_bound
			arr[lowerbound] += k;

			// Reduce upper_bound+1
			// indexed value by k
			arr[upperbound + 1] -= k;
		}

		// Find maximum sum
		// possible from all values
		long sum = 0, res = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
			sum += arr[i];
			res = Math.max(res, sum);
		}

		// return maximum value
		return res;
	}

}
