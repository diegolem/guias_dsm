import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Registro de Notas de Alumnos");
    float[] grades = new float[10];
    int good = 0, bad = 0;
    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < 10; i++){
      float value;

      do{
        value = 0;
        System.out.println("Alumno " + (i+1));
        System.out.println("Ingrese la nota entre (0-10): ");
        value = scan.nextFloat();
        System.out.print("\033[H\033[2J");
        System.out.flush();

      }while(value < 0 || value > 10);
      grades[i] = value;
    }

    for(int j = 0; j < grades.length; j++){
      if(grades[j] >= 7){ good++; }
      else{ bad++; }
    }
    System.out.println("Cantidad de notas mayores o iguales a 7.00: " + good);
    System.out.println("Cantidad de notas menores a 7.00: " + bad);
  }
}