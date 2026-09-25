/*
*Esta clase es para calcular notas.
 */
public class CalculadoraNotas {
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private boolean aprobado;

    public CalculadoraNotas() {}
    public CalculadoraNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota1 = nota2;
        this.nota1 = nota3;
    }

    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void mostrarNotas(){
        System.out.printf("Notas estudiante %d - %d - %d ",getNota1(), getNota2(), getNota3());
    }

    public double setPromedio(double nota1, double nota2, double nota3) {
        this.promedio = (nota1 + nota2 + nota3) / 3;
        return (nota1 + nota2 + nota3) / 3;
    }
    public double getPromedio() {
        return promedio;
    }
    public boolean isAprobado() {
        return aprobado;
    }
    public double calcularPromedio(double nota1, double nota2, double nota3) {
        //La nota final es el equivalente a sumar las 3 y dividirlas por 3.
        return (nota1 + nota2 + nota3) / 3;
    }
    /**
    *@return retorna la nota final
    *para esto se le entrega @param nota1, @param nota2 y @param nota3
    **/

    /**
    * Determina si el estudiante aprueba según su nota final.
    *
    * @param promedio nota obtenida por el estudiante
    * @return true si la nota es igual o superior a 4.0
    */
    public boolean estaAprobado(double promedio) {
        return promedio >= 4.0;
    }

}