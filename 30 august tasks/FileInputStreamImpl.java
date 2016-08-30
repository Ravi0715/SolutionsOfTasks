package practice.tasks;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamImpl {

	static FileInputStream fis;
	
	public static void main(String[] args) {
		
		try
		{
			fis=new FileInputStream("D://aaa//student2.txt");
			int  ch;
			StringBuffer sb = new StringBuffer();
			while((ch=fis.read())!=-1)
			{
				if(ch==9)
					sb.append((char)ch+"\\t ");
				else if(ch==13)
					sb.append((char)ch+"\\n");
				else
					sb.append((char)ch);
			}
			System.out.println(sb.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
