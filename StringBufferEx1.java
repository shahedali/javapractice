class StringBufferEx1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		sb.ensureCapacity(18);
		System.out.println(sb.capacity());
	}
}