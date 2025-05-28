public class Estudiante {

    private String nombre;
    private String matricula;
    private double[] notas = new double[5]; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //Metodos para acceder a una nota específica
   public double getNota(int i) {
        return notas[i];
    }
    public void setNota(int i, double nota) {
        notas[i] = nota;
    }
    //Metodo para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }
    //Metodo para ver si esta aprobado o no esta aprobado
    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }
}