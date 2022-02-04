import java.util.*;
class Point{
  private float x;
  private float y;
  
  public Point(float new_x, float new_y){
    x = new_x;
    y = new_y;
  }
  public float getCoordinateX(){
    return x;
  }
  public float getCoordinateY(){
    return y;
  }
}
class Main {
  public static void main(String[] args) {
    int n=0,i,j,first = 0, second=0, third=0, fourth=0, origin=0, x_axis=0, y_axis = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de puntos(x,y) a solicitar: ");
    n = scan.nextInt();
    Point arrayPoints[] = new Point[n];
    for(i = 0; i<n; i++){
      float value_x=0, value_y = 0;
      System.out.println("Creando el punto " + (i+1));
      System.out.println("Ingrese la coordenada X: ");
      value_x = scan.nextFloat();
      System.out.println("Ingrese la coordenada Y: ");
      value_y = scan.nextFloat();
      arrayPoints[i] = new Point(value_x, value_y);
    }
    for(j=0; j<arrayPoints.length; j++){
      if(arrayPoints[j].getCoordinateX() > 0 && arrayPoints[j].getCoordinateY() > 0){
        first++;
      }else if(arrayPoints[j].getCoordinateX() < 0 && arrayPoints[j].getCoordinateY() > 0){
        second++;
      }else if(arrayPoints[j].getCoordinateX() < 0 && arrayPoints[j].getCoordinateY() < 0){
        third++;
      }else if(arrayPoints[j].getCoordinateX() > 0 && arrayPoints[j].getCoordinateY() < 0){
        fourth++;
      }else if(arrayPoints[j].getCoordinateX() == 0 && arrayPoints[j].getCoordinateY() == 0){
        origin++;
      }else if((arrayPoints[j].getCoordinateX() > 0 && arrayPoints[j].getCoordinateY() == 0) || (arrayPoints[j].getCoordinateX() < 0 && arrayPoints[j].getCoordinateY() == 0) ){
        x_axis++;
      }else if((arrayPoints[j].getCoordinateX() == 0 && arrayPoints[j].getCoordinateY() > 0) || (arrayPoints[j].getCoordinateX() == 0 && arrayPoints[j].getCoordinateY() < 0) ){
        y_axis++;
      }
    }
     System.out.println("Cantidad de puntos en el primer cuadrante: " + first);
     System.out.println("Cantidad de puntos en el segundo cuadrante: " + second);
     System.out.println("Cantidad de puntos en el tercero cuadrante: " + third);
     System.out.println("Cantidad de puntos en el cuarto cuadrante: " + fourth);
     System.out.println("Cantidad de puntos en el origen: " + origin);
     System.out.println("Cantidad de puntos en el eje X: " + x_axis);
     System.out.println("Cantidad de puntos en el eje Y: " + y_axis);
  }
}