package practice.tasks;

import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
		{
			System.out.print("Enter string "+(i+1)+":");
			str[i]=in.next();
		}
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>1)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
			System.out.println(str[i]);
		}

	}

}
