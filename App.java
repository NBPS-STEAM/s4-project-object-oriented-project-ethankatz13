import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        boolean Again = true;
        
        while (Again == true)
        {
        
        int count = 0;
        Boolean pizza;
        
        
       

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        String name = input.nextLine();
        System.out.println("Oh "+ name +", I am a digital survey. I will be asking you a series of questions, maybe so i can get to know you, or just to trick you...");
        
        // boy or girl
        Scanner genderScanner = new Scanner(System.in);
        System.out.println("Are you a boy? (true or false)");
        Boolean gender = input.nextBoolean();
        
        
       
        
        // pizza question
        if(gender == true)
        {
            
            System.out.println("Okay, you are a boy. So am I. Do you like pizza? (true or false) ");
            pizza = input.nextBoolean();
        }
        
        else 
        {
            System.out.println("Okay, you are a girl. I am a boy. Do you likePizza? (true or false)");
            pizza = input.nextBoolean();
        }
        
        // compound boolean && if else statement
        if((gender == true) && (pizza == true))
        {
            System.out.println("Looks like we have more in common than you think. ");
            
        }
        else if((gender == false && pizza == true) || (gender == true && pizza == false))
        {
            System.out.println("At least we have something in common. ");
            
        }
        else
        {
            System.out.println("Wow, we have nothing in common. Pizza is amazing. ");
            
        }
       System.out.println("How confident are you that you will past this test, 1-10?");
       int confidence = input.nextInt();
       
       while (confidence < 9)
       {
           System.out.println("You can do it. get your hopes up. Now, I'll ask again. How high is your confidence?");
           confidence = input.nextInt();
       }
       
       
       Scanner questions = new Scanner(System.in);
       System.out.println("Okay, here is our first question. (answer in all lowercase) When life gives you lemons, what do you do?");
       System.out.println("(1) sell them \n(2) make lemonade \n(3) cook with them \n(4) none of the above \n(answer as a single number)");
       int Q1 = questions.nextInt();
       int Q1Ans = 2;
       
       
       if (Q1 == Q1Ans)
       {
           count++;
           System.out.println("Correct! Your score is "+ count);
       }
       else
       {
           System.out.println("Incorrect. The correct word was make lemonade. Make the best ot of what you have.");
       }
        System.out.println("Okay, next question. pick a number 50-100");
        int num = input.nextInt();
        
        int times = 0;
        System.out.println("Now, How many times does the number 3 fit into "+ num +"?");
        int guess = input.nextInt();
        
        for (int i = 3; i <= num; i ++)
        {
            times ++;
            i = i + 2;
        }
        
        if (guess == times)
        {
            count ++;
            System.out.println("correct, the answer is "+ times +". Your score is "+ count);
        }
        else
        {
            System.out.println("incorrect. the answer is "+ times);
        }
        
        
        System.out.println("Now we are going to do something different, We are going to make a flat stanley! The starting color is white but you can change it. What color would you like the paper to be?");
        String inputColor = input.nextLine();


        System.out.println("and how long would you like the paper to be?");
        int inputHeight = input.nextInt();

        Man flatStanley = new Man ("white", 0);

        //flatStanley.setColor();
        flatStanley.setHeight(inputHeight);

        //System.out.println(flatStanley.getColor());
        System.out.println(flatStanley.getHeight());



       
        Scanner again = new Scanner(System.in);
        System.out.println("Would you like to play again?(true or false)");
        Again = again.nextBoolean();
       
       
    }
   
    }
}
