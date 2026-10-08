package repaso4;

public class CoroPorHileras extends Coro{
    private Persona[][] coristas;
    
    public CoroPorHileras(String unNombre, Persona unDirector, int maxCoristas){
        super(unNombre, unDirector, maxCoristas);
        inicializarCoristas();
    }
    
    private void inicializarCoristas(){
        coristas = new Persona[this.getMaxCoristas()][this.getMaxCoristas()];
    }
    
    @Override
    public void agregarCorista(Persona unCorista){
        if(!estaLleno()){
            coristas[getContadorCoristas() / getMaxCoristas()][getContadorCoristas() % getMaxCoristas()] = unCorista;
            aumentarCorista();
        }
    }
    
    @Override
    public boolean estaBienFormado(){
        boolean cumple = true;
        int index = 0;
        int referencia = 0;
        
        while((index < getMaxCoristas() * getMaxCoristas()) && cumple){
            int i = index % getMaxCoristas();
            int j = index / getMaxCoristas();
            
            if(i == 0){
                referencia = coristas[i][j].getAntiguedadTono();
            }
            
            if(coristas[i][j].getAntiguedadTono() != referencia){
                cumple = false;
            }else{
                index ++;
            }
        }
        
        return cumple;
    }
}
