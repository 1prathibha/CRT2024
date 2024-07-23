class Vowels
{
	public static void main(String[] args)
	{
		String s="steczaINEA";
		int vowelcount=0,consonantcount=0;
		for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vowelcount++;
		else
			consonantcount++;
		}
		System.out.println(vowelcount+" "+consonantcount+" ");
	}
}