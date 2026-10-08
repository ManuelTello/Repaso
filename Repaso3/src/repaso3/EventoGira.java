package repaso3;

public class EventoGira extends Recital{
    private String nombre;
    
    private Fecha[] fechas;
    
    private int fechaActual;
    
    private final int MAXFECHAS;
    
    private final int COSTOFECHA;
    
    public EventoGira(String banda, int unaCantidadTemas, String nombre ,int cantidadFechas){
        super(banda, unaCantidadTemas);
        setNombre(nombre);
        inicializarFechas(cantidadFechas);
        setFechaActual();
        MAXFECHAS = cantidadFechas;
        COSTOFECHA = 30000;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    private void inicializarFechas(int cantidad){
        fechas = new Fecha[cantidad];
    }
    
    private void setFechaActual(){
        fechaActual  = 0;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getFechaActual(){
        return fechaActual;
    }
    
    public void agregarFecha(Fecha unaFecha){
        if(fechaActual == MAXFECHAS){
            System.out.println("No se pueden agregar mas fechas");
        }else{
            fechas[fechaActual] = unaFecha;
            fechaActual ++;
        }
    }
    
    private void avanzarFecha(){
        if(fechaActual < MAXFECHAS){
            fechaActual ++;
        }
    }
    
    @Override
    public double calcularCosto(){
        return COSTOFECHA * fechaActual;
    }
    
    @Override
    public String toString(){
        String aux = super.toString();
        
        aux += "Los esperamos en " + fechas[fechaActual].getCiudad();
        avanzarFecha();
       
        return aux;
    }
}
