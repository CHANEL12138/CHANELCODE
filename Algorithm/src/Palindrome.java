import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        int left=0;
        int right=s.length()-1;
        int count=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;right--;count++;
            }
            else
            {
                System.out.println("Not a Algorithm.Palindrome");
                break;
            }
        }
        if(count==s.length()/2)System.out.println("A Algorithm.Palindrome");
        else
        {
            System.exit(0);
        }
    }
}
