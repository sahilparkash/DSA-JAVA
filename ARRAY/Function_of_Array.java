import java.util.Scanner;

class Function {
    static Scanner sc = new Scanner(System.in);
    int size, i;

    Function() {
        this.size = 0;
    }

    void Creat(int size, int[] arr) {
        this.size = size;
        for (i = 0; i < size; i++) {
            System.out.println("Enter number [" + (i + 1) +"]:");
            arr[i] = sc.nextInt();
        }
        System.out.print("arrays are:");
        // for (i = 0; i < size; i++) {
        //     System.out.print(" " + arr[i]);
        // }
        for(int j:arr)
        {
             System.out.print( " " + j );
        }
        System.out.println();
    }

    int Insert_at_First(int size , int[] arr) {
        this.size = size;
        if (size <= 0) {
            System.out.println("Please fill creat");
            // Creat(size, arr);
        } else {
            int[] temp = new int[size + 1];
            System.out.println("Enter number to insert at first:");
            temp[0] = sc.nextInt();
            for (i = 0; i < size; i++) {
                temp[i + 1] = arr[i];
            }
            System.out.print("arrays are:");
            for (i = 0; i < temp.length; i++) {
                System.out.print(" " + temp[i]);
            }
            System.out.println();
            return size + 1;
        }
        return 0;
    }
}

public class Function_of_Array {
    public static void main(String[] args) {
        Function F1 = new Function();
        System.out.println("Enter size of array:");
        int size = new Scanner(System.in).nextInt();
        int[] arr = new int[size];    
        System.out.println("1.To  Enter element in arrya"+" 2.TO Insert_at_First"+" 3.To Insert_at_Last"+" 4.Insert_at_Anypotion");
        System.out.println("5.TO Delete_at_First"+" 6.To Delete_at_Last"+" 7.Delete_at_Anypotion"+" 0.to stop");
        boolean option=true ;
        while(option)
        {
            int n =new Scanner (System.in).nextInt();
            switch ( n ) {
                case 1 -> F1.Creat(size, arr);
                case 2 -> F1.Insert_at_First(size, arr);
                case 0 ->
                {
                    option = false;
                    n = 0;
                } 

                default -> 
                { 
                    System.out.println("You enter wrong option");
                }
            }
        }
    }
}