import java.util.*;
public class divideconquer {
    public static void printArr(int arr[]) {
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei) {       // lc 2+3;
        // base 
        if(si>=ei) {
            return;
        }
        // kaam 
        int mid = si + (ei-si)/2; // (si+ei)/2
        mergeSort(arr, si, mid); // left part 
        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        // it is an temperory variable for storing array of correct order;
        // si to mid (0-3)= 4 element and (4,6) = 3 element but 6-0 != 7 hence 6-0+1
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid +1; //  iterator for right part
        int k = 0; // iterator for temp arr

        while(i<=mid && j<=ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++; 
            } 
            k++;
        }
        // left part remaining element 
        while(i<=mid) {
            temp[k++] = arr[i++]; // ya phala k and i ki current value la laga fir usa ++ update kar dega;
        }
        while(j<=ei) {
            temp[k++] = arr[j++]; // ya phala k and j ki current value la laga fir usa ++ update kar dega;
        }

        // COPY THE CURRENT TEMP ARRAY TO ORIGINAL ONE
        for(k = 0, i = si; k < temp.length;k++,i++) {
            arr[i] = temp[k];
        }

    }

        public static void quicksort(int arr[], int si, int ei) {       // lc 4+5+6;
            if(si>=ei) {
                return;
            }
           //last element PIVOT;
           int pidx =  partition(arr,si,ei); // bc imagine kar rahaya hai ki ya phala pivot sa chota and bara element ko seperate kar dega,
                                             // int pidx ya partition pivot ka index laka dega updated index;
            quicksort(arr,si,pidx-1); // left
            quicksort(arr,pidx+1,ei); // right
        }

        public static int partition(int arr[], int si, int ei) {
            int pivot = arr[ei];
            int i = si-1;// to make space for ele smaller than pivot;

            for(int j = si; j<ei;j++ ) {
                if(arr[j]<= pivot) {
                    i++;
                    // swap
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


        public static int search(int arr[], int tar, int si, int ei){
             if(si>ei) {
                return -1;
            }
            // kaam
            int mid = si + (ei-si)/2;
            // case found
            if(arr[mid] == tar) {
                return mid;
            }

            // mid on L1;
            if(arr[si] <= arr[mid]) {
       // case a : left 
            if(arr[si] <= tar && tar <= arr[mid]) {
            return search(arr, tar, si, mid-1);
            } else {
                // case b : right;
                return search(arr, tar, mid+1, ei);
            }
        }

            // mid on L2;
            if(arr[mid] <= arr[ei]) {
                // case c: left 
                if(arr[mid]<= tar && tar <= arr[ei]) {
                    return search(arr, tar, mid+1, ei);
                } else {
                    // case d: right 
                    return search(arr, tar, si, mid-1);
                }
            }
            return tar;
        }

    public static void main(String args[]) {
        // int arr[] = {6,3,9,8,2,5};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);                          lc 2+3;

        // quicksort(arr,0,arr.length-1);
        // printArr(arr);                          lc 4+5+6

    int arr[] = {4,5,6,7,0,1,2};
    int target = 0; // output -> 4;
    int targidx = search(arr, target,0,arr.length-1);
    System.out.println(targidx);
    }
    
}
