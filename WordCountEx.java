import java.io.*;
class WordCountEx 
{
	public static void main(String[] args)throws Exception 
	{
		FileInputStream fis=new FileInputStream("g:/xyz/abc/abc.txt");
		int size=fis.available();
		byte[] b=new byte[size];
		fis.read(b);
		String data=new String(b);
		String[] str=data.split(" ");
		System.out.println("No Of Words :"+str.length);
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("Hyderabad"))
			{
				count=count+1;
			}
		}
		System.out.println("Hyderabad repeated:"+count);
		fis.close();
	}
}
