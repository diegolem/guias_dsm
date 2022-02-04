import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Ingrese el numero A: ");
    int numA = in.nextInt();

    System.out.print("ingrese el numero B: ");
    int numB = in.nextInt();

    if(numA % numB == 0){
      System.out.print("Los numeros son divisibles");
    } else{
      System.out.print("Los numeros no son divisibles");
    }
  }
}