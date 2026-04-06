public class insertion_sort
{

    /*
    In insertion sort instead of swapping we use sifting for ex {6,5,2,8,3,7}; our
    arr is this first we run a loop for i which start 1 not form 0 then we take
    a variable which stores 0th index i (j=i-1) and key variable which store a copy
    i (int temp = arr[i];
    then we iterate over the loop for(int i=1;i<arr.length;i++){
    while giving condition (if j >= 0 && arr[j] > key)
    sift  arr[j+1]=arr[j]; then go back if the condition is true
    j--
    and save the result in tem/key
     */
    public static void main(String[] args)
    {
        int[] arr = {6,5,2,8,3,7};

        int temp;

        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            int j=i-1;

            while( j>=0 && arr[j]>=temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        for (int num : arr)
        {
            System.out.print(num + " ");
        }


    }
}
