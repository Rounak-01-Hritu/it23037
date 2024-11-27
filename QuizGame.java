import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args)
    {
        int score=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Quiz Game.");
        System.out.println("1. 89 + 11 = ?");
        System.out.println("a. 90 ");
        System.out.println("b. 100 ");
        System.out.println("c. 78 ");
        System.out.println("d. 111");
        System.out.println("Choose your answer.");
        String ans = sc.nextLine();
        if(ans.equals("b"))
        score++;
        else
        score--;
        System.out.println(score);


      
        System.out.println("2. 80 + 11 = ?");
        System.out.println("a. 90 ");
        System.out.println("b. 100 ");
        System.out.println("c. 78 ");
        System.out.println("d. 91");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("d"))
        score++;
        else
        score--;
        System.out.println(score);

     
        System.out.println("3. 89 + 100 + 11 = ?");
        System.out.println("a. 200 ");
        System.out.println("b. 100 ");
        System.out.println("c. 178 ");
        System.out.println("d. 111");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("a"))
        score++;
        else
        score--;
        System.out.println(score);


        System.out.println("4. 898 + 111 = ?");
        System.out.println("a. 900 ");
        System.out.println("b. 1001 ");
        System.out.println("c. 1009 ");
        System.out.println("d. 1111");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("c"))
        score++;
        else
        score--;
        System.out.println(score);



        System.out.println("5. 8989 + 1111 = ?");
        System.out.println("a. 10100 ");
        System.out.println("b. 1010 ");
        System.out.println("c. 10101 ");
        System.out.println("d. 1110");
        System.out.println("Choose your answer.");
        ans = sc.nextLine();
        if(ans.equals("a"))
        score++;
        else
        score--;
        System.out.println("Your final score is "+score);

    }
}
