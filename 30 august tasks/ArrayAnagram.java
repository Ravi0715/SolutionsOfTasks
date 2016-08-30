package practice.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayAnagram {
	
	public static boolean isAnagram(String s1,String s2)
	{
		String c1=s1.replaceAll("\\s","").toLowerCase();
		String c2=s2.replaceAll("\\s","").toLowerCase();
		boolean check=true;
		if(c1.length()!=c2.length())
			return false;
		else
		{
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for(int i=0;i<c1.length();i++)
			{
				char ch =c1.charAt(i);
				int count=0;
				if(hm.containsKey(ch))
				{
					count=hm.get(ch);
				}
				hm.put(ch, ++count);
				ch=c2.charAt(i);
				count=0;
				if(hm.containsKey(ch))
				{
					count=hm.get(ch);
				}
				hm.put(ch, --count);
			}
			for(int val:hm.values())
			{
				if(val!=0)
					check=false;
			}
			return check;
		}
	}
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
				boolean b=isAnagram(str[i], str[j]);
				if(b)
					System.out.println(str[i]+" and "+str[j]+" are anagrams");
			}
		}
			

	}

}
