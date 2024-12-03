import java.util.Scanner;

public class cgpa {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student id : ");
        String it;
        it=sc.nextLine();
        int crs_num=sc.nextInt();
      
        double cgpa=0.00;

        double  gpa;
        int earned_credit=0,taken_credit=0;
        for(int i=0;i<crs_num;i++)
        {
            System.out.println("Credit : ");
            int credit = sc.nextInt();
            System.out.println("CT : ");
            int ct = sc.nextInt();
            System.out.println("AT : ");
            int at = sc.nextInt();
            System.out.println("FE : ");
            int fe = sc.nextInt();
            taken_credit=taken_credit+credit;
            if((ct+at+fe)<40)
            {
                credit=0;
                gpa=0.00;
            }
            else if((ct+at+fe)>=80)
            gpa=4.00;
            else if((ct+at+fe)<80 && (ct+at+fe)>=75)
            gpa=3.75;
            else if((ct+at+fe)<75 && (ct+at+fe)>=70)
            gpa=3.50;
            else if((ct+at+fe)<70 && (ct+at+fe)>=65)
            gpa=3.25;
            else if((ct+at+fe)<65  && (ct+at+fe)>=60)
            gpa=3.00;
            else if((ct+at+fe)<60 && (ct+at+fe)>=55)
            gpa=2.75;
            else if((ct+at+fe)<55 && (ct+at+fe)>=50)
            gpa=2.50;
            else if((ct+at+fe)<50 && (ct+at+fe)>=55)
            gpa=2.25;
            else
            gpa=2.00;

            gpa=(ct+at+fe)*credit;
            earned_credit=earned_credit+credit;
            cgpa=cgpa+gpa;
            
        }

        double result = cgpa/earned_credit;


        System.out.println("ID: IT"+it);
        System.out.println("Credit Taken: "+taken_credit);
        System.out.println("Credit Earned: "+earned_credit);
        System.out.println("CGPA: "+result);

        if(result>=4.00)
        System.out.println("Grade: A+");
        else if(result<4.00 && result>=3.75)
        System.out.println("Grade: A");
        else if(result<3.75 && result>=3.50)
        System.out.println("Grade: A-");
        else if(result<3.50 && result>=3.25)
        System.out.println("Grade: B+");
        else if(result<3.25 && result>=3.00)
        System.out.println("Grade: B");
        else if(result<3.00 && result>=2.75)
        System.out.println("Grade: B-");
        else if(result<2.75 && result>=2.50)
        System.out.println("Grade: C+");
        else if(result<2.50 && result>=2.25)
        System.out.println("Grade: C");
        else if(result<2.25 && result>=2.00)
        System.out.println("Grade: C-");
       else
        System.out.println("Grade: F");
        
        
       

    }
    
}
