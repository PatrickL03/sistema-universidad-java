
package universidad;

import java.util.ArrayList;
import java.util.List;

class Persona {
    private String id;
    private String nombre;
    private String email;
    
    public Persona(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
    
    public void mostrarDatos() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}

