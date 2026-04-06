public class Selection_sort
{
    public static void main(String[] args)
    {
        int[] arr = {6,5,2,8,9,4};
        int size = arr.length;
        int temp ;
        int minIndex ;

        /*
        In selection sort we take the firt index of i as minIndex and check if arr[minIndex]
        is > arr[j] if yes then we make arr[j] = minIndex then we do swapping **outer loop**
        int temp = array[minIndex];
        array[minIndex] = arr[i];
        arr[i] = temp;
         */

        System.out.println("before sort ");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size -1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }

            } temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] =  temp;


        }


        System.out.println("\nafter sort ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
