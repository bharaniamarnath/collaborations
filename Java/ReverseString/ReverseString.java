import java.util.Scanner;

class ReverseString{
public static void main(String[] args){
String s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
try{
s = sc.nextLine();
reverseString(s);
}catch(Exception e){
System.out.println("Error: " + e);
}finally{
sc.close();
}
}
public static void reverseString(String s){
int l = s.length();
int i;
System.out.printf("%d\n", l);
for(i = l-1; i >= 0; --i){
System.out.print(s.charAt(i));
}
}
}