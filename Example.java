class Example{
public static void main(String[]args){
Reverse("abcde");
}
public static void Reverse(String s)
{
String r="";
char ch;
for(int i=0;s.length();i++)
{
//Extract each character from given string
ch=s.charAt(i);
//Add character one by one 
r=ch+r;
}
System.out.println(r);
}
}