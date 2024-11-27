 import java.util.Scanner;
public class GKgame {
    public static void main(String[] args)
    {
        int score=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Quiz Game.");
        System.out.println("1. What year did World War II end?");
        System.out.println("a. 1990 ");
        System.out.println("b. 1945 ");
        System.out.println("c. 1978 ");
        System.out.println("d. 1911");
        System.out.println("Choose your answer.");
        String ans = sc.nextLine();
        if(ans.equals("b"))
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Incorrect!");
            score--;
        }
        


      
        System.out.println("2. What is the largest continent in the world?");
        System.out.println("a. Europe");
        System.out.println("b. America");
        System.out.println("c. India");
        System.out.println("d. Asia");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("d"))
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Incorrect!");
            score--;
        }
        

     
        System.out.println("3. What planet is known as the \"Red Planet\"?");
        System.out.println("a. Mars");
        System.out.println("b. Jupiter");
        System.out.println("c. Venus");
        System.out.println("d. Pluto");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("a"))
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Incorrect!");
            score--;
        }


        System.out.println("4. How many bones are there in the human body?");
        System.out.println("a. 200");
        System.out.println("b. 201");
        System.out.println("c. 206 ");
        System.out.println("d. 106");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("c"))
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Incorrect!");
            score--;
        }



        System.out.println("5. 8989 + 1111 = ?");
        System.out.println("a. 10100 ");
        System.out.println("b. 1010 ");
        System.out.println("c. 10101 ");
        System.out.println("d. 1110");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("a"))
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Incorrect!");
            score--;
        }
        System.out.println("Your final score is "+score);

    }
}
