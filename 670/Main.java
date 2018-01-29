package saxib;
import com.sun.javafx.collections.ImmutableObservableList;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.*;
/**
 * Created by Samsung on 30.12.2017.
 */

public class Main {



    static boolean check(String s)
    {
        int count=1;
        for(int i=0;i<s.length()-1;i++)
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    count++;

            }
        if(count>1)
            return true;
        else
            return false;

    }
    public static void main(String[] args) throws FileNotFoundException,IOException
    {

        Scanner scanner = new Scanner(new FileInputStream("INPUT.TXT"));
      int n=scanner.nextInt();
       List<Integer> list=new ArrayList<>();
        for(int i=1;;i++) {
            String s = new Integer(i).toString();
            if(!check(s))
            {
                list.add(new Integer(i));
            }
            if(list.size()==n)
                break;

        }




      OutputStream stream=new DataOutputStream(new FileOutputStream("OUTPUT.TXT"));
        String out=list.get(n-1).toString();
        for( int i=0;i<out.length();i++)
        {
            stream.write(out.charAt(i));
        }

        stream.close();
    }
}
