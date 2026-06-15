package array;
import java.util.Scanner;
public class Array
{
    static Scanner sc = new Scanner (System.in); 
    private int[] arr;
    public int size;
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
            for(int i=0;i<size;i++)
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
            for (int i = size-1; i >= position; i--)
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
            for (int i = size-1; i >= 0; i--)
            {
                arr[ i+1 ] = arr[ i ];
            }
                arr[ 0 ] = sc.nextInt();
        }

    }
    public void Delete_At_Last()
    {
        System.out.println("Enter last numbber:");
        if(size >= arr.length)
        {
            System.out.println(" Overflow condition!");
            return;
        }
        arr[size--]=0 ;

    }
    public void Delete_At_Position()
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
            for (int i = size-1; i >= position; i--)
            {
                arr[ i+1 ] = arr[ i ];
            }
                arr[ position ] = sc.nextInt();
        }

    }
    public void Delete_At_First()
    {
        System.out.println(" Enter number: ");
        if(size >= arr.length)
        {
            System.out.println(" Overflow condition!");
        }
        else
        {
            for (int i = size-1; i >= 0; i--)
            {
                arr[ i+1 ] = arr[ i ];
            }
                arr[ 0 ] = sc.nextInt();
        }

    }
    public void show()
    {
        System.out.print("Array are: ");
        for(int i:arr)
        {
            System.out.print(" " + i);
        }
            System.out.println(" ");
    }

}
