package saxib;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.*;
/**
 * Created by Samsung on 30.12.2017.
 */

public class Main {



    public static void main(String[] args) throws FileNotFoundException,IOException
    {

        Scanner scanner = new Scanner(new FileInputStream("INPUT.TXT"));
       String s=new String(scanner.nextLine()), t = new String(scanner.nextLine());
      //  System.out.println(s+" " +t.);

        String out="NO";
        int i=0, j=0;
        for(;i< t.length();i++)
        {
            if(s.charAt(j)==t.charAt(i))
                j++;
            if(j==s.length()) {
                out = "YES";
                break;
            }

        }

        OutputStream stream=new DataOutputStream(new FileOutputStream("OUTPUT.TXT"));
        for( i=0;i<out.length();i++)
        {
            stream.write(out.charAt(i));
        }

        stream.close();
    }
}
