package Clases;

public class Persona {
    private String name;
    private String lastname;
    private int edad;
    private int dni;

    public Persona() {}
    
    public Persona(String name, String lastname, int dni, int edad) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.edad = edad;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [name=" + name + ", lastname=" + lastname + ", edad=" + edad + ", dni=" + dni + "]";
    }

    
    
}
