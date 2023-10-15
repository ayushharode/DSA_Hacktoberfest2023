import java.util.ArrayList;

public class SubarrayFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        findAllSubarrays(array);
    }

    public static void findAllSubarrays(int[] array) {
        int n = array.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                ArrayList<Integer> subarray = new ArrayList<>();

                for (int i = start; i <= end; i++) {
                    subarray.add(array[i]);
                }

                System.out.println(subarray);
            }
        }
    }
}
