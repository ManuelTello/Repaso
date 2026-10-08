package repaso1;

public class Proyecto {
    private String nombre;
    
    private int codigo;
    
    private String director;
    
    private Investigador[] investigadores;
    
    private int investigadoresActual;
    
    final int MAXINVESTIGADORES = 50;
    
    public Proyecto(String unNombre, int unCodigo, String unDirector){
        setNombre(unNombre);
        setCodigo(unCodigo);
        setDirector(unDirector);
        inicializarInvestigadoresActual();
        inicializarInvestigadores();
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setCodigo(int unCodigo){
        codigo = unCodigo;
    }
    
    public void setDirector(String unDirector){
        director = unDirector;
    }
    
    private void inicializarInvestigadoresActual(){
        investigadoresActual = 0;
    }
    
    private void inicializarInvestigadores(){
        investigadores = new Investigador[MAXINVESTIGADORES];
    }

    public String getNombre(){
        return nombre;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getDirector(){
        return director;
    }
    
    public int getMaxInvestigadores(){
        return MAXINVESTIGADORES;
    }
    
    private boolean verificarCantidadDeInvestigadores(){
        boolean sePuede = (investigadoresActual < MAXINVESTIGADORES);
        
        if(sePuede){
            investigadoresActual += 1;
        }else{
            System.out.println("Ya no se pueden agregar mas investigadores.");
        }
        
        return sePuede;
    }
    
    public void agregarInvestigador(Investigador unInvestigador){
        if(verificarCantidadDeInvestigadores()){
            investigadores[investigadoresActual - 1] = unInvestigador;
        }
    }

    public double dineroTotalOtorgado(){
        double total = 0;

        for(int i = 0; i < investigadoresActual; i++){
            total += investigadores[i].getMontoTotalDeOtorgados();            
        }

        return total;
    }
    
    private Investigador buscarInvestigador(String nombre){
        int index = 0;
        Investigador investigador = null;
        
        while(investigador == null && index < investigadoresActual){
            if(nombre.equals(investigadores[index].getNombre())){
                investigador = investigadores[index];      
            }else{
               index += 1;
            }
        } 
        
        return investigador;
    }

    public void otorgarTodos(String nombre){ 
        Investigador investigador = buscarInvestigador(nombre);
        if(investigador != null)
        {
           investigador.otorgarTodosLosSubsidios();
        }else{
            System.out.println("Investigador no existe");
        }
    }
    
    @Override
    public String toString(){ 
        String aux = "Proyecto " + getNombre() + ", codigo " + getCodigo() + ", director " + getDirector() + ", total otorgado del proyecto " + dineroTotalOtorgado() + ".\n";
        for(int i = 0; i < investigadoresActual; i++){
            aux = aux + investigadores[i].toString();
        }
        
        return aux;
    }
}