import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] {12, 8, 9, 3, 11, 5, 4};

        System.out.println(Arrays.toString(split(arr, 0, arr.length - 1)));
    }

    public static int[] split(int[] array, int start, int end) {
        if(end == start) {
            return new int[] { array[start] };
        }
        int mid = (start + end)/2;

        int[] left = split(array, start, mid);
        int[] right = split(array, mid + 1, end);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int m = left.length;
        int n = right.length;
        int[] arr = new int[(m + n)];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n) {
            if(left[i] <= right[j]) {
                arr[k] = left[i++];
            } else if(left[i] > right[j]) {
                arr[k] = right[j++];
            }
            k++;
        }

        while(i < m) {
            arr[k++] = left[i++];
        }

        while(j < n) {
            arr[k++] = right[j++];
        }

        return arr;
    }
}