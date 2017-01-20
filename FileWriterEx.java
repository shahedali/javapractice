import java.io.*;
class FileWriterEx 
{
	public static void main(String[] args)throws Exception 
	{
		FileWriter fw=new FileWriter("abc.txt",true);
		String data=" Hyderabad";
		char[] ch=data.toCharArray();
		fw.write(ch);
		fw.close();
	}
}
