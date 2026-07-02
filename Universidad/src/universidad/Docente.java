
package universidad;

class Docente extends Persona {
    private String titulo;


    public Docente(String id, String nombre, String email, String titulo) {
        super(id, nombre, email);
        this.titulo = titulo;
    }


    @Override
    public void mostrarDatos() {
        // mostramos los datos base (ID, nombre, email)
        super.mostrarDatos();
    }


public String getTitulo() { return titulo; }
}