package repaso4;

public class Persona {
    private int dni;
    
    private String nombre;
    
    private int edad;
    
    private int antiguedadTono;
    
    public Persona(int unDni, String unNombre, int unaEdad, int unaAntiguedadTono){
        setDni(unDni);
        setNombre(unNombre);
        setEdad(unaEdad);
        setAntiguedadTono(unaAntiguedadTono);
    }
    
    public void setDni(int unDni){
        dni = unDni;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    
    public void setAntiguedadTono(int unaAntiguedadTono){
        antiguedadTono = unaAntiguedadTono;
    }
    
    public int getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getAntiguedadTono(){
        return antiguedadTono;
    }
    
    @Override
    public String toString(){
        return "dni " + dni + ", nombre " + nombre + ", tono/antiguedad " + antiguedadTono;
    }
}
