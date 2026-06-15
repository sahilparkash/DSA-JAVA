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
    int[] Insert_at_First(int size , int[] arr) {
        int[] temp = new int[size + 1];
        if (size <= 0) {
            System.out.println("Please fill creat");
            Creat(size, arr);
        } else {
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
        }
        return temp;
    }
    int[] Insert_at_Last(int size , int[] arr) {
        int[] temp = new int[size + 1];
        if (size <= 0) {
            System.out.println("Please fill creat");
            Creat(size, arr);
        } else {
            for (i = 0; i < size; i++) {
                temp [i] = arr[i];
            }
            System.out.println("Enter number to insert at last:");
            temp[size] = sc.nextInt();
            System.out.print("arrays are:");
            for (i = 0; i < temp.length; i++) {
                System.out.print(" " + temp[i]);
            }
            System.out.println();
        }
        return temp;
    }
    int[] Insert_at_Anypotion(int size , int[] arr) {
        int[] temp = new int[size + 1];
        if (size <= 0) {
            System.out.println("Please fill creat");
            Creat(size, arr);
        } else {
            System.out.println("Enter index to insert at Anypotion:");
            int position = sc.nextInt();
            temp[position] = sc.nextInt();
            for (i = 0; i < position; i++) {
                temp [i] = arr[i];
            }
                for(i=position;i<size;i++)
                {
                        temp[i+1]=arr[i];
                }
            System.out.print("arrays are:");
            for (i = 0; i < temp.length; i++) {
                System.out.print(" " + temp[i]);
            }
            System.out.println();
        }
        return temp;
    }
    int[] Delete_at_First(int size , int[] arr) {
        int[] temp = new int[size - 1];
        if (size <= 0) {
            System.out.println("Please fill creat");
            Creat(size, arr);
        } else {
            System.out.println("Number  at first Deleted:");
            for (i = 1; i < size; i++) {
                temp[i-1] = arr[i];
            }
            System.out.print("arrays are:");
            for (i = 0; i < temp.length; i++) {
                System.out.print(" " + temp[i]);
            }
            System.out.println();
        }
        return temp;
    }
    int[] Delete_at_Last(int size , int[] arr) {
        int[] temp = new int[size - 1];
        if (size <= 0) {
            System.out.println("Please fill creat");
            Creat(size, arr);
        } else {
            System.out.println("Number at last Deleted:");
            for (i = 0; i < size-1; i++) {
                temp [i] = arr[i];
            }
            for (i = 0; i < temp.length; i++) {
                System.out.print(" " + temp[i]);
            }
            System.out.println();
        }
        return temp;
    }
    int[] Delete_at_Anypotion(int size , int[] arr) {
        int[] temp = new int[size - 1];
        if (size <= 0) {
            System.out.println("Please fill creat");
            Creat(size, arr);
        } else {
            System.out.println("Enter index to Delete at Anypotion:");
            int position = sc.nextInt();
            for (i = 0; i <position; i++) {
                temp [(i)] = arr[(i)];
            }
                for(i=position;i<size;i++)
                {
                        temp[i-1]=arr[i];
                }
            System.out.print("arrays are:");
            for (i = 0; i < temp.length; i++) {
                System.out.print(" " + temp[i]);
            }
            System.out.println();
        }
    return temp;
    }

}
public class Function_of_Array {
    public static void main(String[] args) {
        Function F1 = new Function();
        System.out.println("Enter size of array:");
        int size = new Scanner(System.in).nextInt();
        int[] arr = new int[size];    
        boolean option=true ;
        while(option)
        {
            System.out.println("1.To  Enter element in arrya"+" 2.TO Insert_at_First"+" 3.To Insert_at_Last"+" 4.Insert_at_Anypotion");
            System.out.println("5.TO Delete_at_First"+" 6.To Delete_at_Last"+" 7.Delete_at_Anypotion"+" 0.to stop");
            int n =new Scanner (System.in).nextInt();
            switch ( n ) {
                case 1 -> F1.Creat(size, arr);
                case 2 -> 
                {
                    arr = F1.Insert_at_First(size, arr);
                    size = arr.length;
                }
                case 3 -> 
                {
                    arr = F1.Insert_at_Last(size, arr);
                    size = arr.length;
                }
                case 4 -> 
                {
                    arr = F1.Insert_at_Anypotion(size, arr);
                    size = arr.length;
                }
                case 5 -> 
                {
                    arr = F1.Delete_at_First(size, arr);
                    size = arr.length;
                }
                case 6 -> 
                {
                arr = F1.Delete_at_Last(size, arr);
                size = arr.length;
                }
                case 7 -> 
                {
                    arr = F1.Delete_at_Anypotion(size, arr);
                    size = arr.length;
                }
                case 0 ->
                {
                    System.out.println("Thanks for using.");
                    option = false;
                } 

                default -> 
                { 
                    System.out.println("You enter wrong option");
                }
            }
        }
    }
}