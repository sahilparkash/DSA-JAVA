import java.util.Scanner;
class Function
{
    int size;
    Function() {
        this.size = 0;
    }
    int Creat(int size)
    {
        this.size = size;
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter number ["+(i+1)+"]:");
            arr[i] = new Scanner (System.in).nextInt();
        }
             System.out.print( "arrays are:" );
        for (int i : arr) {
             System.out.print( " "+i );
             return i;
        }
        return 0;
    }
    void InsertAT-First(int size)
    {
        this.size=size;

    }

}
void main(String[] args)
{
     Function F1 = new Function();
     System.out.println("Enter size of array:");
    int size = new Scanner (System.in).nextInt();
     F1.Creat(size);
}