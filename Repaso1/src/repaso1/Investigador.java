package repaso1;

public class Investigador {
    private String nombre;
    
    private int categoria;
    
    private String especialidad;
    
    private Subsidio[] subsidios;
    
    private int subsidiosActual;
    
    private int MAXSUBSIDIOS = 5;
    
    public Investigador(String unNombre, int unaCategoria, String unaEspecialidad){
        setNombre(unNombre);
        setCategoria(unaCategoria); 
        setEspecialidad(unaEspecialidad);
        setSubsidiosActual();
        inicializarSubsidios();
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setCategoria(int unaCategoria){
        categoria = unaCategoria;
    }
    
    public void setEspecialidad(String unaEspecialidad){
        especialidad = unaEspecialidad;
    }
    
    private void setSubsidiosActual(){
        subsidiosActual = 0;
    }
    
    private void inicializarSubsidios(){
        subsidios = new Subsidio[MAXSUBSIDIOS];
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    private boolean verificarCantidadDeSubsidios(){
        boolean sePuede = (subsidiosActual < MAXSUBSIDIOS);
        
        if(sePuede){
            subsidiosActual += 1;
        }else {
            System.out.println("No se puede agregar mas subsidios");
        }
        
        return sePuede;
    }
    
    public void agregarSubsidio(Subsidio unSubsidio){
        if(verificarCantidadDeSubsidios()){
            subsidios[subsidiosActual - 1] = unSubsidio;
        }
    }

    public double getMontoTotalDeOtorgados(){
        double total = 0;

        for(int i = 0; i < subsidiosActual; i++){
            if(subsidios[i].getFueOtorgado()){
                total += subsidios[i].getMonto();
            }
        }

        return total;
    }

    public void otorgarTodosLosSubsidios(){
        for(int i = 0; i < subsidiosActual; i++){
            subsidios[i].otorgar();
        }
    }

    @Override
    public String toString(){
        String aux = "Nombre " + getNombre() + ", categoria " + getCategoria() + ", monto otorgado " + getMontoTotalDeOtorgados() + "\n";
        return aux;
    }
}