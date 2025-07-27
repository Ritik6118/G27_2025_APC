package Lec_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_Handeling_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("demo.txt");
		f.createNewFile();
//		f.delete();
		
//		FileWriter fr=new FileWriter(f);
//		FileWriter fr=new FileWriter(f,true);
//		FileWriter fr=new FileWriter("demo2.txt");
		
//		char[] arr= {'a','b','c','d','e','f'};
//		fr.write('a');
//		fr.write(100);
//		fr.write(arr);
//		fr.write("my String");
//		fr.write("\n");
//		fr.write("my String");
//		fr.flush();
//		fr.close();
		
//		BufferedWriter br=new BufferedWriter(fr);
//		
//		br.write(100);
//		br.newLine();
//		br.write(arr);
//		br.write("my String");
//		br.write("\n");
//		br.write("my String");
//		
//		
//		br.flush();
//		br.close();
	
//		PrintWriter pr=new PrintWriter(fr); 
//		pr.println(true);
//		pr.println(1234);
//		pr.println("print writer demo");
//		pr.println(Long.MAX_VALUE);
//		pr.println(arr);
//		pr.println('a');
//		pr.flush();
//		pr.close();
		
		FileReader fr=new FileReader(f);
//		int a=fr.read();
//		int c=0;
//		while(a!=-1) {
//			c++;
//			System.out.print((char)(a));
//			a=fr.read();
//		}
//		System.out.println(c);
		
//		BufferedReader br=new BufferedReader(fr);
//		String s=br.readLine();
//		int c=0;
//		while(s!=null) {
//			c++;
//			System.out.println(s);
//			s=br.readLine();
//		}
//		System.out.println(c);
//		
		Scanner sc=new Scanner(f);
		while(sc.hasNextBoolean()) {
			System.out.println(sc.nextBoolean());
		}
	}

}
