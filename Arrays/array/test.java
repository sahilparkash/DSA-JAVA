void main()
{
  int [] arr = {5,4,3,2,1} ;
  int i ,j ;
  for ( i = 0 ; i < arr.length-1 ; i++)
        {
            for(  j = 0 ; j<arr.length-1 ; j++)
            {

                if( arr[j] > arr[j+1] )
                {
                    int temp = arr[ j ] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    System.out.print("array are :");
    for(int k:arr)
    {
        
        System.out.print(" " + k);
    }

}