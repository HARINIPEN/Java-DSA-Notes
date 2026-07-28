import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of intervals
        int n = sc.nextInt();

        // Input intervals
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        // Sort intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Merge intervals
        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int[] last = result.get(result.size() - 1);

            if (intervals[i][0] <= last[1]) {

                last[1] = Math.max(last[1], intervals[i][1]);

            } else {

                result.add(intervals[i]);
            }
        }

        // Print result
        System.out.print("[");

        for (int i = 0; i < result.size(); i++) {

            System.out.print("[" + result.get(i)[0] + ", " + result.get(i)[1] + "]");

            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}