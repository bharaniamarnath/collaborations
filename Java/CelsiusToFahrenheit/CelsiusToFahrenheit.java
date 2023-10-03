import java.util.Scanner;

class CelsiusToFahrenheit{
public static void main(String[] args){
double c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter degree in celsius: ");
c = sc.nextDouble();
ToFahrenheit tf = new ToFahrenheit();
tf.getResult(c);
}
}

class ToFahrenheit{
public void getResult(double c){
double f;
f = convertToFarenheit(c);
System.out.printf("Fahrenheit value is %f", f);
}
private double convertToFarenheit(double celsius){
return ((celsius * (9/5)) + 32);
}
}