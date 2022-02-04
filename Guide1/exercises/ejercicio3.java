import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

int imp=0,par=0,f,n,valor;
System.out.print("Ingrese cuantos numeros piensa ingresar");
n = teclado.nextInt();
for (f = 1; f <= n; f++) {
System.out.print("Ingrese valor:");
valor = teclado.nextInt();
if(valor%2==0){
  par=par+1;
}
else{
  imp=imp+1;
}
  }
  System.out.print("Numeros pares ingresados: ");
System.out.println(par);
System.out.print("Numeros impares ingresados: ");
System.out.print(imp);
}}