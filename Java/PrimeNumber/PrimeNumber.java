class PrimeNumber{
public static void main(String[] args){
for(int x = 1; x < 20; x++){
if(isPrime(x)){
System.out.printf("%d ", x);
}
}
}
public static boolean isPrime(int n){
boolean p = true;
if(n == 0 || n == 1){
System.out.println("0 and 1 are not prime");
p = false;
}
else{
for(int i = 2; i <= n/2; i++){
if(n%i == 0){
p = false;
break;
}
}
}
return p;
}
}