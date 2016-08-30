package practice.tasks;

import java.util.Scanner;

public class DeleteAtOddAppendAtEvenLengths {

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
		System.out.println("Enter character to append at even string lengths:");
		char ch = in.next().charAt(0);
		for(int i=0;i<str.length;i++)
		{
			StringBuffer sb = new StringBuffer();
			if(str[i].length()%2==0)
			{
				int x=str[i].length()/2-1;
				for(int j=0;j<str[i].length();j++)
				{
					if(j==x)
						sb.append(str[i].charAt(j)+""+ch);
					else
						sb.append(str[i].charAt(j));
				}
			}
			else
			{
				int x=str[i].length()/2;
				for(int j=0;j<str[i].length();j++)
				{
					if(j!=x)
						sb.append(str[i].charAt(j));
				}
			}
			System.out.println(sb.toString());
		}
	}

}
