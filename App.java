public class App {
    public static void main(String[] args) {
        //Este es del estudiante 1
        Estudiante estud1 = new Estudiante();
        estud1.setNombre("Tania");
        estud1.setMatricula("20243ds011");
        estud1.setNota(0, 80);
        estud1.setNota(1, 75);
        estud1.setNota(2, 85);
        estud1.setNota(3, 90);
        estud1.setNota(4, 70);
        //Este es del estudiante 2
        Estudiante estud2 = new Estudiante();
        estud2.setNombre("Zuri");
        estud2.setMatricula("20243ds036");
        estud2.setNota(0, 60);
        estud2.setNota(1, 55);
        estud2.setNota(2, 70);
        estud2.setNota(3, 65);
        estud2.setNota(4, 68);
        //Este es del estudiante 3
        Estudiante estud3 = new Estudiante();
        estud3.setNombre("Eliel");
        estud3.setMatricula("20243ds058");
        estud3.setNota(0, 90);
        estud3.setNota(1, 85);
        estud3.setNota(2, 92);
        estud3.setNota(3, 88);
        estud3.setNota(4, 95);
        //Este es del estudiante 4
        Estudiante estud4 = new Estudiante();
        estud4.setNombre("Viviana");
        estud4.setMatricula("20243ds078");
        estud4.setNota(0, 70);
        estud4.setNota(1, 73);
        estud4.setNota(2, 76);
        estud4.setNota(3, 74);
        estud4.setNota(4, 72);

        //Este es del estudiante 5
        Estudiante estud5 = new Estudiante();
        estud5.setNombre("Lizette");
        estud5.setMatricula("20243ds015");
        estud5.setNota(0, 50);
        estud5.setNota(1, 45);
        estud5.setNota(2, 55);
        estud5.setNota(3, 60);
        estud5.setNota(4, 58);
        //Este es para mostrar la  información
        mostrarInformacion(estud1);
        mostrarInformacion(estud2);
        mostrarInformacion(estud3);
        mostrarInformacion(estud4);
        mostrarInformacion(estud5);
    }
    public static void mostrarInformacion(Estudiante estudiante) {
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Promedio del estudiante: " + estudiante.calcularPromedio());
        System.out.println("Esta aprobado? " + (estudiante.aprobado() ? "Si esta aprobado" : "No esta aprobado"));
    }
}