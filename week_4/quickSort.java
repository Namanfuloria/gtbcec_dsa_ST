package week_4;

public class quickSort {
        public static void quickSort(int[] arr) {
            quickSort(arr, 0, arr.length - 1);
        }
    
        private static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivot = partition(arr, low, high);
                quickSort(arr, low, pivot - 1);
                quickSort(arr, pivot + 1, high);
            }
        }
    
        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;
    
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
    
            swap(arr, i + 1, high);
            return i + 1;
        }
    
        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    
        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 3, 1, 6, 4};
            quickSort(arr);
            System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
        }
    }  
   
