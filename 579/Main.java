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
        List<Integer> list_plus=new ArrayList<>(),list_minus=new ArrayList();


        int count =scanner.nextInt();
        int max=0,min=0;
        for(int i=0;i<count;i++)
        {
            int a=scanner.nextInt();
            if(a>=0) {
                max += a;
                list_plus.add(new Integer(i+1));
            }
            else
            {
                min+=Math.abs(a);
                list_minus.add(new Integer(i+1));
            }
        }

        String out="";
        if(max>min)
        {
            out+=list_plus.size()+"\n";
            for(int i=0;i<list_plus.size();i++)
                out+=list_plus.get(i)+" ";
        }
        else
        {
            out+=list_minus.size()+"\n";
            for(int i=0;i<list_minus.size();i++)
                out+=list_minus.get(i)+" ";
        }



        //System.out.println(out);
        OutputStream stream=new DataOutputStream(new FileOutputStream("OUTPUT.TXT"));
        for(int i=0;i<out.length()-1;i++)
        {
            stream.write(out.charAt(i));
        }

        stream.close();
    }
}
