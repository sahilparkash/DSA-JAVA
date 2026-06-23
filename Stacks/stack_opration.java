import stack.*;

public class stack_opration
{
    public static void main (String[] args)
    {
        Stack f1 = new Stack(10);
        boolean num =  true;
        while(num)
        {
            System.out.println(" Enter 1 to push : " + " Enter 2 to pop : " + " Enter 3 to show : " + " Enter 0 to stop :");
            int choise = f1.sc.nextInt();
            switch (choise)
            {
                case 1 -> f1.push();
                case 2 -> f1.pop();
                case 3 -> f1.show();
                case 0 -> num = false;
                default -> System.out.println(" you enter wrong choise :");

            }

        }
    }

}