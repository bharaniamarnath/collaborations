import java.util.Scanner;

class PalindromeString{
public static void main(String[] args){
String p;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
try{
p = sc.nextLine();
CheckPalindrome cp = new CheckPalindrome();
cp.getResult(p);
}catch(Exception e){
System.out.println("Error: " + e);
}finally{
sc.close();
}
}
}

class CheckPalindrome{
public void getResult(String p){
boolean ip;
ip = isPalindrome(p);
if(ip == true){
System.out.printf("%s is palindrome", p);
}
else{
System.out.printf("%s is not palindrome", p);
}
}
private boolean isPalindrome(String p){
int l = p.length();
int i;
for(i = 0; i < l/2; ++i){
if(p.charAt(i) != p.charAt(l - i - 1)){
return false;
}
}
return true;
}
}