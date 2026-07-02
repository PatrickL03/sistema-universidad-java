
package universidad;

import java.util.ArrayList;
import java.util.List;

class Curso {
    private String codigo;
    private String nombre;
    private Docente docente;
    private List<Estudiante> estudiantes;


    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }


    public void asignarDocente(Docente docente) {
        this.docente = docente;
    }


    public void matricularEstudiante(Estudiante est) {
        estudiantes.add(est);
}


    public Estudiante buscarEstudiantePorId(String id) {
        for (Estudiante e : estudiantes) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }


    public void mostrarInformacionCurso() {
        System.out.println("Curso: " + codigo + " - " + nombre);
        System.out.println("Docente a cargo:");
        if (docente != null) docente.mostrarDatos();
        else System.out.println("No hay docente asignado.");

        System.out.println("Estudiantes matriculados:");
        for (Estudiante e : estudiantes) {
        e.mostrarDatos();
    }


        System.out.println();
        System.out.println("Notas:");
        for (Estudiante e : estudiantes) {
            System.out.println("Notas del estudiante: " + e.obtenerNotas());
        }
    }
}