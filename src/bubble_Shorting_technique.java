public class bubble_Shorting_technique
{
    public static void main(String[] args)
    {
       int[] num = {6,2,5,8,3,1};
       int size = num.length;
       int temp = 0;
//        before sorting
        /*
            In bubble sort we check if the num[j] > num[j+1] if yes we swap the place and make temp =  num [j+1] = j = temp
            we do it until we got a sorted array *** bubble sort happens in inner loop**
             temp = num[j];
                   num[j] = num[j+1];
                   num[j+1] = temp;
         */

        System.out.print("before  ");
       for(int nums: num)
       {
           System.out.print(nums);
       }


       for(int i=0; i< num.length; i++)
       {
           for(int j=0; j< num.length-i-1; j++)
           {
               if(num[j] > num[j+1])
               {
                   temp = num[j];
                   num[j] = num[j+1];
                   num[j+1] = temp;
               }

           }

       }

//       after sorting
        System.out.println();
        System.out.print("after  ");
        for(int nums : num)
        {
            System.out.print(nums);
        }

    }
}
