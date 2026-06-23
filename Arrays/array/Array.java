package array;
import java.util.Scanner;
public class Array
{
    static Scanner sc = new Scanner (System.in); 
    private final int[] arr;
    public int size,i;
    public Array(int capacity)
    {
        arr = new int [capacity];
    }
    public void creat()
    {
        System.out.println("Enter size:");
        size = sc.nextInt();
        if(size < arr.length)
        {
            for( i=0;i<size;i++)
            {
                System.out.println("Enter Array [" +(i+1)+ "]:");
                arr[i]=sc.nextInt();
            }
        }
        else { System.out.println("Enter size to less than Array Length");
        creat(); }
    }
    public void Insert_At_Last()
    {
        System.out.println("Enter last numbber:");
        if(size >= arr.length)
        {
            System.out.println(" Overflow condition!");
            return;
        }
        arr[size++] = sc.nextInt();

    }
    public void Insert_At_Position()
    {
        System.out.println(" Enter positon of element : ");
        int position = sc.nextInt();
        if(position >= arr.length)
        {
            System.out.println(" Element is not present ");
        }
        else if(size >= arr.length)
        {
            System.out.println(" Overflow condition!");
        }
        else
        {
            System.out.println(" Enter number: ");
            for ( i = size-1; i >= position; i--)
            {
                arr[ i+1 ] = arr[ i ];
            }
                arr[ position ] = sc.nextInt();
        }

    }
    public void Insert_At_First()
    {
        System.out.println(" Enter number: ");
        if(size >= arr.length)
        {
            System.out.println(" Overflow condition!");
        }
        else
        {
            for ( i = size-1; i >= 0; i--)
            {
                arr[ i+1 ] = arr[ i ];
            }
                arr[ 0 ] = sc.nextInt();
        }

    }
    public void Delete_At_Last()
    {
        System.out.println(" Last number Deleted : ");
        if(size >= arr.length)
        {
            System.out.println(" Overflow condition! ");
            return;
        }
        else if(arr.length == 0 || size == 0)
        {
            System.out.println(" you have deleted all array ");

        }
        arr[--size] = 0;

    }
    public void Delete_At_Position()
    {
        System.out.println(" Delete_At_Position : ");
        int position = sc.nextInt();
        if(position >= arr.length)
        {
            System.out.println(" Element is not present ");
        }
        else if( position > arr.length )
        {
            System.out.println(" This element is not present ");
        }
        else
        {
            System.out.println("  Number deleted : ");
            for ( i = position ; i <size ; i++)
            {
                arr[ i ] = arr[ i+1 ];
            }
        }

    }
    public void Delete_At_First()
    {
        
        if(size >= arr.length)
        {
            System.out.println(" Overflow condition!");
        }
        else if( arr[size] == size-1)
        {
            System.out.println(" cannot delete you have reached at end of array");

        }
        else
        {
            System.out.println(" Number deleted: ");
            for( i = 1 ; i < size+1 ; i++)
            {
                arr[i-1] = arr[i];
            }
        }

    }
    public void Bubble_sort()
    {
        if( arr.length == 0 || arr[size] == 0)
        {
            System.out.println(" Array is empty ");
        }
       for ( i = 0 ; i < arr.length-1 ; i++)
        {
            for(int  j = 0 ; j<arr.length-1 ; j++)
            {

                if( arr[j] > arr[j+1] )
                {
                    int temp = arr[ j ] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }

    }
    public void show()
    {
        System.out.print("Array are: ");
        for( i = 0 ; i < size ; i++)
        {
            System.out.print(" " + arr[i] );
        }
            System.out.println(" ");
    }

}
