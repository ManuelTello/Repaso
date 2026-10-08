package repaso4;

public class CoroSemicircular extends Coro{
    private Persona[] coristas;
    
    public CoroSemicircular(String unNombre, Persona unDirector, int maxCoristas){
        super(unNombre, unDirector, maxCoristas);
        inicializarCoristas();
    }
    
    private void inicializarCoristas(){
        coristas = new Persona[this.getMaxCoristas()];
    }
    
    @Override
    public void agregarCorista(Persona unCorista){
        if(!estaLleno()){
            coristas[getContadorCoristas()] = unCorista;
            aumentarCorista();
        }
    }
    
    @Override
    public boolean estaBienFormado(){
        boolean cumple = true;
        int index = 1;
        
        while(index < getMaxCoristas() && cumple){
            if(coristas[index].getAntiguedadTono() >= coristas[index - 1].getAntiguedadTono()){
                cumple = false;
            }else{
                index++;
            }
        }
        
        return cumple;
    }
}
