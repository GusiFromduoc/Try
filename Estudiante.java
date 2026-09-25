/**
* Representa un estudiante registrado en el sistema académico.
*/
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double notaFinal;
    private boolean aprobado;

    public Estudiante(String nombre, int edad, String carrera, double notaFinal, boolean aprobado) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.notaFinal = notaFinal;
        this.aprobado = aprobado;
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
    public boolean isAprobado() {
        return aprobado;
    }

    public void Estudiar(){
        System.out.printf("%s está estudiando %s, tiene %d y es un %s %n", getNombre(), getCarrera(), getEdad(), getClass());
    }


    /**
    * Determina si el estudiante aprueba según su nota final.
    *
    * @param notaFinal nota obtenida por el estudiante
    * @return true si la nota es igual o superior a 4.0
    */
    public void estaAprobado(double notaFinal) {
        if (notaFinal >=4.0) {this.aprobado = true;} else {this.aprobado = false;}
        if (aprobado == true) {System.out.printf("El estudiante %s está aprobado! %n", getNombre());} else {
            System.out.printf("El estudiante %s no ha aprobado.", getNombre());
        }
    }



}
