public class Merge_sort
{
    public static void main(String[] args) {
        int [] arr ={ 3,2,5,7,1,9};
        meargeSort(arr, 0, arr.length-1);

        for (int n :arr){
            System.out.print(n+" ");
        }
        System.out.println();

    }

    public static void meargeSort(int [] arr, int low, int high){

        if(low < high){
            int mid = (low + high)/2;
            meargeSort(arr, low,mid);
            meargeSort(arr, mid + 1, high);
            merge(arr, low,mid,  high);
         }
    }

    public static void merge(int [] arr1, int low, int mid, int high){

        int n1 = mid - low +1;
        int n2 = high - mid;
        int [] larr = new int [n1];
        int [] harr = new int [n2];

        for(int x=0;x<n1;x++){
            larr[x]=arr1[low+x];
        }for(int x=0;x<n2;x++){
            harr[x]= arr1[mid+x+1];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2) {
            if (larr[i] <= harr[j]) {
                arr1[k] = larr[i];
                i++;
            } else {
                arr1[k] = harr[j];
                j++;
            }k++;
        }
        while(i<n1){
            arr1[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr1[k]=harr[j];
            j++;
            k++;
        }

    }
}
