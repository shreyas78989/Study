class reversearray
{
    public static void main(String[] args)
    {
       int arr1 []=new int[] {9,8,7,6,5};
        System.out.println("Original array: ");
        for (int i = 0; i < arr1.length; i++)
       {
           System.out.print(arr1[i]+" ");
       }
       System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = arr1.length-1; i >= 0; i--)
        {
            System.out.print(arr1[i] + " ");

        }
    }
}