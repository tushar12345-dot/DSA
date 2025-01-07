class Example{
public static void main(String[]args){
Reverse("abcde");
}
public static void Reverse(String s){
String r="";
char ch;
for(int i=0;i<s.length();i++){ 
//Extract each character from the string 
ch=s.charAt(i);
r=ch+r;
}
System.out.println(r);
}
}