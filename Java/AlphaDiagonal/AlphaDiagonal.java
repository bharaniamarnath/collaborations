class AlphaDiagonal{
public static void main(String[] args){
String s = "abcde";
int f = 0;
int l = s.length();
try{
for(int i = 0; i < s.length(); i++){
for(int j = 0; j < s.length(); j++){
if(j == f) System.out.print(s.charAt(j));
else if(j == (l - 1)) System.out.print(s.charAt(j));
else System.out.print(" ");
}
System.out.println();
if(f < s.length()) f++;
if(l > 0) l--;
}
}catch(Exception e){
System.err.println(e);
}
}
}