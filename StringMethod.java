package StringsExample;

public class StringMethod {

	public void countDupli (String str) 
	{
		/*System.out.println(str);
		str.trim();//for password
		str.strip();//for paragraph letters
		str.charAt(0);//single character
		System.out.println(str.codePointAt(7));
		
		char[]ch = str.toCharArray();
		int count = 0;
		for(int i=0; i<str.length(); i++);
		{
		for(int j=1; j<str.length(); j++);
		{
		   if(str.contains("e"));
		   count++;
		}
		}
		int count = 0;
		String s = " ";
		String[] arr = str.split("\\s");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].equalsIgnoreCase("am"))
			{
				count++;
				s = arr[i];
			}
		}
		System.out.println(s);
		System.out.println(count);*/

	
	String str1 = "            123 ";
	String str2 = "Namrata  ";
	System.out.println(str1.stripLeading());//front space
	System.out.println(str1.stripTrailing());//back space remove
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.compareToIgnoreCase(str2));//validation for password
	String str3 ="namratabaviskar";
	String str4 =" ";
	str4 = str3.substring(0,7);//bound value printed
	System.out.println(str4);
	String str5 = "intensity";
	
 char[] ch = str5.toCharArray();
 //char[] reversechar = new char[ch.length];
 int count =0;
 /*for(int i=ch.length-1; i>=0; i--)
 {
	 reversechar[count++] = ch[i];
 }
 
 for(int i=0; i<reversechar.length; i++)
 {
	 System.out.print(reversechar[i]);
 }*/
  for (int i=0;i<ch.length; i++)
  {
	  if(ch[i]=='i' || ch[i]=='e' || ch[i]=='u' || ch[i]=='a' || ch[i]=='o' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U');
	  {
	  count++;
	  System.out.println(i + "=" + ch[i]+ "="+count);
  }
}
}
	
		public static void main(String[] args)
{
	StringMethod ex = new StringMethod();
	ex.countDupli(" I am Developer and am Programmer");
}
}
