package practice.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class DuplicateWordRemove {

	static FileReader fr;
	static BufferedReader br;
	public static void main(String[] args) {
		
		try
		{
			fr = new FileReader("D://aaa//student2.txt");
			br=new BufferedReader(fr);
			String line;
			LinkedHashMap<String, Integer> al = new LinkedHashMap<String, Integer>();
			//ArrayList<String> al = new ArrayList<String>();
			while((line=br.readLine())!=null)
			{
				String arr[] = line.split(" ");
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i].contains("."))
					{
						String ar[]=arr[i].split(".");
						for(int j=0;j<ar.length;j++)
						{
							if(al.containsKey(ar[j]))
							{
								al.put(ar[j], al.get(ar[j])+1);
							}
							else
								al.put(ar[j],1);
						}
					}
					else if(arr[i].contains(","))
					{
						String ar[]=arr[i].split(",");
						for(int j=0;j<ar.length;j++)
						{
							if(al.containsKey(ar[j]))
							{
								al.put(ar[j], al.get(ar[j])+1);
							}
							else
								al.put(ar[j],1);
						}
					}
					else
					{
						if(al.containsKey(arr[i]))
						{
							al.put(arr[i], al.get(arr[i])+1);
						}
						else
							al.put(arr[i],1);
					}
				}
			
			}
			for(String s:al.keySet())
			{
				int val=al.get(s);
				if(val==1)
					System.out.print(s+" ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
