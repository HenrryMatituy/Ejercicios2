package herencia;

public class Alumno extends Persona{
    private String carrera;
    public Alumno(String nom, String car){
        super(nom);
        carrera=car;
    }
    public String dameDescripcion(){
        return "Este Alumno está estudiando: " + carrera;
    }
}
