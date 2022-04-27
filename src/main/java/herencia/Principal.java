package herencia;


public class Principal {
    public static void main(String[] args) {
        Persona[] lasPersonas =new Persona[2];
        lasPersonas[0]= new Empleado("Jose Henrry Matituy","1500000");
        lasPersonas[1]= new Alumno("Marinela Villota","Administración de Empresas");

        for (Persona p:lasPersonas){
            System.out.println(p.dameNombre()+ ", "+p.dameDescripcion());
        }


    }




}
