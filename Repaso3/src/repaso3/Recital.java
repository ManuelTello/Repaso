package repaso3;

public abstract class Recital {
    private String banda;
    
    private String[] temas;
        
    private int temasActual;
            
    private final int MAXTEMAS;

    public Recital(String unaBanda, int cantidadTemas){
        setBanda(unaBanda);
        inicializarTemas(cantidadTemas);
        inicializarTemasActual();
        MAXTEMAS = cantidadTemas;
    }
    
    public void setBanda(String unaBanda){
        banda = unaBanda;
    }
    
    private void inicializarTemas(int unaCantidadTemas){
        temas = new String[unaCantidadTemas];
    }
    
    private void inicializarTemasActual(){
        temasActual = 0;
    }
    
    public String getBanda(){
        return banda;
    }
    
    public int getTemasActual(){
        return temasActual;
    }
    
    public void agregarTema(String unTema){
        if(temasActual == MAXTEMAS){
            System.out.println("No se pueden agregas mas temas");
        }else{
            temas[temasActual] = unTema;
            temasActual ++;
        }
    }
    
    public abstract double calcularCosto();
    
    @Override
    public String toString(){
        String aux =  "Somos " + banda + " y a continuacion tocaremos: \n";
        
        for(int i = 0; i < temasActual; i ++){
            aux += temas[i] + "\n"; 
        }
        
        return aux;
    }
}