import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int total = 15 - s1.length();
                String spaceLength = String.format("%" + total + "s", ""); // make space string with total
                String numFormat = String.format("%03d", x); // make int to 3 digits
                System.out.println(s1 + spaceLength + numFormat);
            }
            System.out.println("================================");

    }
}