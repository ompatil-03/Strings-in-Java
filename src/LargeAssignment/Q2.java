package LargeAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        try {
            File fio1=new File("file1");
            File fio2=new File("file2");
            File fio3=new File("common_names");

            fio1.createNewFile();
            fio2.createNewFile();
            fio3.createNewFile();

            Scanner sc1=new Scanner(fio1);
            StringBuffer sb1=new StringBuffer();
            while(sc1.hasNextLine()){
                sb1.append(sc1.nextLine());
            }
            System.out.println(sb1);
            String str1=String.valueOf(sb1);
            String c1[]=str1.split(" ");

            Scanner sc2=new Scanner(fio2);
            StringBuffer sb2=new StringBuffer();
            while(sc2.hasNextLine())
            {
                sb2.append(sc2.nextLine());
            }
            System.out.println(sb2);
            String str2=String.valueOf(sb2);
            String c2[]=str2.split(" ");



            System.out.println("Common word of two text files:");
            FileWriter w1=new FileWriter(fio3);
            BufferedWriter bw=new BufferedWriter(w1);
            for(int i=0;i<c1.length;i++)
            {
                for(int j=0;j<c2.length;j++)
                {
                    if(c1[i].equals(c2[j]))
                    {
                        bw.write(c1[i]+" ");

                    }
                }
            }
            bw.close();
            Scanner sc3=new Scanner(fio3);
            StringBuffer sb3=new StringBuffer();
            while(sc3.hasNextLine())
            {
                sb3.append(sc3.nextLine());
            }
            System.out.println(sb3);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}