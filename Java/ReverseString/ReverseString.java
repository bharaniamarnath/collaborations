import java.util.*;

class ReverseString{
public static void main(String[] args){
String s = null;
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
System.out.printf("String length: %d\n", l);
for(int i = l - 1; i >= 0; i--){
System.out.print(s.substring(i, i+1) + " ");
}
}
}