
package universidad;

import java.util.ArrayList;
import java.util.List;

class Estudiante extends Persona {
    private int semestre;
    private List<Double> notas;


    public Estudiante(String id, String nombre, String email, int semestre) {
        super(id, nombre, email);
        this.semestre = semestre;
        this.notas = new ArrayList<>();
    }


    public void agregarNota(double nota) {
        notas.add(nota);
    }


    public List<Double> obtenerNotas() {
        return new ArrayList<>(notas);
    }


    @Override
    
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}