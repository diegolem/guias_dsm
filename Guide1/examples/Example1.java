import java.util.*;

public class Example1 {

  public static void main(String[] args) {
    //Creando un objeto de la clase Scanner
    Scanner in = new Scanner(System.in);
    //Obtener el primer dato
    System.out.println("Como te llamas?");
    String nombre = in.nextLine();

    //Obtener el segundo dato
    System.out.println("Cuantos años tienes?");
    int edad = in.nextInt();

    //mostrar el resultado en la consola
    System.out.println("Hola, " + nombre + ". El año que viene tendras " + (edad + 1) + " años");
  }
}