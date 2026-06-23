package stack;
import java.util.Scanner;

public class Stack
{
    private int top, size;
    private int[] arr;
    public  static Scanner sc = new Scanner (System.in);
    public Stack (int capacity)
    {
        arr = new int [capacity];
        size = arr.length;
        top = -1 ;
    }
    public void push()
    {
        int value;
        if(top == size -1)
        {
            System.out.print(" Stak overflow ");
        }
        else if(top < size-1)
        {
            System.out.print("Enter number : ");
            value = sc.nextInt();
            arr[++top] = value;
            
        }
    }
    public void pop()
    {
        if(top == size -1)
        {
            System.out.print(" Stak underflow ");
        }
        else if(top < size-1)
        {
            System.out.print(" Number poped ");
            arr[top--] = 0;
            
        }
    }
    public void show()
    {
        System.out.print(" Staic are : ");
        for (int i = 0 ; i < size-1 ;i++ )
        {
            System.out.print(" " + arr[i]);
        }
            System.out.println(" ");
    }
}