import java.util.Scanner;

public class Stringtest {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of cases");
    int cases = sc.nextInt();

    String []str = new String[cases];
   
    for(int i=0;i<cases;i++)
    {
    	System.out.println("Enter string "+i);
    	str[i]=sc.next();
    	
        
    }

}

}
