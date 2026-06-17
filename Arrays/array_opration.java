import array.*;
import java.util.Scanner;

public class array_opration
{
    public static void main(String[] args) {
        Array f = new Array(10);
        boolean num=true;
        while(num)
        {
            System.out.println("1.To  Enter element in arrya"+" 2.TO Insert_at_First"+" 3.To Insert_at_Last"+" 4.Insert_at_Anypotion");
            System.out.println("5.TO Delete_at_First"+" 6.To Delete_at_Last"+" 7.Delete_at_Anypotion"+" 0.to stop");
            int choise = new Scanner(System.in).nextInt();
           switch(choise)
           {
                case 1 -> { f.creat(); f.show(); }
                case 2 -> { f.Insert_At_First();f.show();}
                case 3 -> { f.Insert_At_Last();f.show();}
                case 4 -> { f.Insert_At_Position();f.show();}
                case 5 -> { f.Delete_At_First();f.show();}
                case 6 -> { f.Delete_At_Last();f.show();}
                case 7 -> { f.Delete_At_Position();f.show();}
                case 0 -> num=false;
                default -> {System.out.println("wrong option");}

           } 
        }
    }
}