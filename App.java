import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {   
      Scanner input = new Scanner(System.in);
      System.out.println("You are going to make a man. You get to decide how tall he is and what color hair he has. What color hair should he have?");
      String inputColor = input.nextLine();


      System.out.println("and how many inches would you like him to be?");
      int inputHeight = input.nextInt();

      Man guy = new Man ("", 0);

      guy.setColor(inputColor);
      guy.setHeight(inputHeight);

      System.out.println("His hair color is " + guy.getColor());
      System.out.println(" and his height in inches is " + guy.getHeight());
      System.out.println("Now, there is a little twist, little do you know, the man you created is allowed to have a superpower! Only one though... What power would you like him to have?");
      String inputPower = input.nextLine();

      Power p = new Power("");
      p.setPower(inputPower);

      System.out.println("You have " + numPowers + ". Would you like to create another one?");
      String yesNo = input.nextLine();

      if(yesNo == "yes" || yesNo == "Yes")
      {
        System.out.println("What would your next power be?");
        String inputPower = input.nextLine();
        Power p2 = new Power("");
        p2.setPower(inputPower);
        System.out.println(Power.getNumPowers);
      }
      else
      {
        System.out.println("Okay, that is fine.");
      }






       
       
   
    }
}
