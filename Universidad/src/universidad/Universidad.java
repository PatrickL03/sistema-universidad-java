/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

public class Universidad {
public static void main(String[] args) {
    
// 1. Crear docente
Docente ana = new Docente("D01", "Ana Torres", "ana@uni.edu", "Ingeniera de Software");


// 2. Crear estudiantes
Estudiante carlos = new Estudiante("E01", "Carlos Pérez", "carlos@uni.edu", 3);
Estudiante maria = new Estudiante("E02", "María Gómez", "maria@uni.edu", 2);


// 3. Crear curso y asignar docente
Curso curso = new Curso("CS101", "Programación en Python");
curso.asignarDocente(ana);


// 4. Matricular estudiantes
curso.matricularEstudiante(carlos);
curso.matricularEstudiante(maria);


// 5. Agregar notas
carlos.agregarNota(4.2);
maria.agregarNota(4.8);


// 6. Mostrar información en pantalla
curso.mostrarInformacionCurso();
}
}