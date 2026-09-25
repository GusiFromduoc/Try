/**
* Representa un estudiante registrado en el sistema académico.
*/
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double notaFinal;

    public Estudiante(String nombre, int edad, String carrera, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.notaFinal = notaFinal;;
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
    public double getNotaFinal() {
        return notaFinal;
    }


    public void Estudiar(){
        System.out.printf("%s está estudiando %s, tiene %d años %n ", getNombre(), getCarrera(), getEdad());
    }



}
