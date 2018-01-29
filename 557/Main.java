package saxib;
import com.sun.javafx.collections.ImmutableObservableList;
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

        int m=scanner.nextInt(),//количество матриц
                n=scanner.nextInt(),//размер матрицы
                a=scanner.nextInt(),//искомая строка
                b=scanner.nextInt(),//искомый столбец
                p=scanner.nextInt();
       // System.out.println(m+ " "+n+ " "+a+ " "+b+ " "+p);

        int [][][] A=new int[m][n][n];
        int [][] C=new int[n][n];
        int [][] C1=new int[n][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n ;j++) {
                for (int k = 0; k < n; k++) {
                    A[i][j][k] = scanner.nextInt();
                }
            }

            for(int j=0;j<n ;j++) {
                C[a-1][j] = A[0][a-1][j];
            }

        for(int i=1;i<m;i++) {
                for (int k = 0; k < n; k++) {
                    int temp = 0;
                    for (int inner = 0; inner < n; inner++) {
                        temp += C[a-1][inner] * A[i][inner][k];
                    }
                    C1[a-1][k] = temp % p;


                }
                for (int k = 0; k < n; k++) {
                    C[a-1][k] = C1[a-1][k];

                }
        }

      OutputStream stream=new DataOutputStream(new FileOutputStream("OUTPUT.TXT"));
        String out=new Integer(C[a-1][b-1]).toString();

            stream.write(out.getBytes());

        stream.close();
    }
}
