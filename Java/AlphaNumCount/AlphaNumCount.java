class AlphaNumCount{
public static void main(String[] args){
String s = "a1b2c3";
int l = s.length();
for(int i = 0; i < l; i++){
char c = s.charAt(i);
if(Character.isDigit(c)){
char x = s.charAt(i - 1);
int j = c - '0';
for(int y = 0; y < j; y++){
System.out.print(x);
}
}
}
}
}