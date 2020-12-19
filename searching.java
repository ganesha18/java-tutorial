class main{
 public static void main(String arg[]){

         int arr[]={2,3,4,6,7,8};
         int j=0;
        int  item=10;
        int flag=0;
       int n=6;
      for( j = 0; j < n; j++)
        {
            if(arr[j] == item)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(j + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    

       
       
}
}
