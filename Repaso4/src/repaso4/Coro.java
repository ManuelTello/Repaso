package repaso4;

public abstract class Coro {
    private String nombre;
    
    private Persona director;
    
    private int contadorCoristas;
    
    private final int MAXCORISTAS;
    
    public Coro(String unNombre, Persona unDirector, int maxCoristas){
        inicializarContadorCoristas();
        MAXCORISTAS = maxCoristas;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setDirector(Persona unDirector){
        director = unDirector;
    }
    
    private void inicializarContadorCoristas(){
        contadorCoristas = 0;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Persona getDirector(){
        return director;
    }
    
    public int getMaxCoristas(){
        return MAXCORISTAS;
    }
    
    public int getContadorCoristas(){
        return contadorCoristas;
    }
    
    public boolean estaLleno(){
        return (contadorCoristas == (MAXCORISTAS * MAXCORISTAS));
    }
    
    public void aumentarCorista(){
        contadorCoristas ++;
    }
    
    public abstract void agregarCorista(Persona unCorista);
    
    public abstract boolean estaBienFormado();
    
    @Override
    public String toString(){
        return "Coro " + nombre + "\nDirector " ;
    }
}
