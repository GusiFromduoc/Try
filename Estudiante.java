import java.nio.channels.Pipe.SourceChannel;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void Estudiar(){
        System.out.printf("%s está estudiando %s, tiene %d y es un %s %n", getNombre(), getCarrera(), getEdad(), getClass());
    }

}
