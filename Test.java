package com;

import java.io.*;
import java.util.Scanner;

public class Test {
	
		
	
	public static void txt(){
		
	
		File file = new File("D:\\TextA.txt");
		try {
			Student student = new Student();
			Scanner scanner = new Scanner(System.in);
			//请输入姓名，学号，性别，年龄，班级;
			System.out.print("姓名\n");
			student.name = scanner.next();
			System.out.print("学号\n");
			student. number= scanner.next();
			System.out.print("性别\n");
			student.sex = scanner.next();
			System.out.print("年龄\n");
			student.age = scanner.next();
			System.out.print("班级\n");
			student.grade = scanner.next();
			System.out.println(student.toString());
			
			FileReader fInputStream = new FileReader(file);//读取D盘文件
			FileWriter fOutputStream  = new FileWriter("D:\\TextB.txt");//向文件中追加数据
			int p=(int)file.length();
			char[] a = new char[p];
			fOutputStream.write(student.toString());
			fInputStream.read(a);
			int x=0;
			for(int j = 7;j<=file.length()-1;j=j+7,x+=7) {
				if(j%2==0) {//余数为零
					for(int i=x;i<j;i++) {
					fOutputStream.write(a[i]);
					}
					fOutputStream.write("。\n");
					
				}else {//余数不为零
					for(int i=x;i<j;i++) {
					fOutputStream.write(a[i]);
					}
					fOutputStream.write(",\n");
				}
			}
			
			fInputStream.close();//释放资源
			fOutputStream.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}