package herencia;

public class Empleado extends Persona{
    private String sueldo;
  public Empleado(String nom,String sue){
      super(nom);
      sueldo=sue;
  }
  public String dameDescripcion(){
      return "Este empleado tiene un sueldo de " + sueldo;
  }
}



