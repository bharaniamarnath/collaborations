import java.util.*;

class SimpleArithmetic{
public static void main(String[] args){
int a, b, sum, diff, mul, div, mod;
Scanner sc = new Scanner(System.in);
System.out.println("Simple Arithmetic");
try{
System.out.println("Enter a number for A:");
a = Integer.parseInt(sc.nextLine());
System.out.println("Enter a number for B:");
b = Integer.parseInt(sc.nextLine());
add(a, b);
subtract(a, b);
multiply(a, b);
divide(a, b);
modulus(a, b);
}catch(Exception e){
System.out.println("Error: " + e);
}finally{
sc.close();
}
}
public static void add(int a, int b){
int c;
c = a + b;
System.out.println("Add: " + c);
}
public static void subtract(int a, int b){
int c;
if(a > b){
c = a - b;
}
else{
c = b - a;
}
System.out.println("Subtract: " + c);
}
public static void multiply(int a, int b){
int c;
c = a * b;
System.out.println("Multiply: " + c);
}
public static void divide(int a, int b){
int c = 0;
if(b == 0){
System.out.println("Divide by Zero error");
}
else{
c = a / b;
}
System.out.println("Divide: " + c);
}
public static void modulus(int a, int b){
int c;
c = a % b;
System.out.println("Modulus: " + c);
}
}