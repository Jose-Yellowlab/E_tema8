
/*Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
por último muéstralas por consola.
 */

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(18);
        persona.setNombre("Alex");
        persona.setTelefono(645412457);

        System.out.println(persona.getNombre() + " tiene una Edad de "+ persona.getEdad() + " Años y su teléfono es: "+ persona.getTelefono());

        Persona persona2 = new Persona();

        persona2.setEdad(20);
        persona2.setNombre("Ana");
        persona2.setTelefono(655522145);

        System.out.println(persona2.getNombre() + " tiene una Edad de "+ persona2.getEdad() + " Años y su teléfono es: "+ persona2.getTelefono());


    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}



