public class Quicksort {
    public static void Quick_sort(int arr[], int si, int ei) {
        if (si < ei) { 
            int pIdx = partition(arr, si, ei);
            Quick_sort(arr, si, pIdx - 1);
            Quick_sort(arr, pIdx + 1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        Quick_sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
