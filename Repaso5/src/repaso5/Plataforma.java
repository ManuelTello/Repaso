package repaso5;

public class Plataforma {
    private String nombre;
    
    private int cantidadSubs;
    
    private Estreno[][] estrenos;
        
    private final int MAXMESES = 12;
    
    private int[] ocupados;
    
    private int cantCategorias;
    
    public Plataforma(String unNombre, int unaCantidadSubs, int unaCantidadCategorias){
        setNombre(unNombre);
        setCantidadSubs(unaCantidadSubs);
        inicializarEstrenos(unaCantidadCategorias);
        inicializarOcupados(unaCantidadCategorias);
        setCantidadCategorias(unaCantidadSubs);
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setCantidadSubs(int unaCantidadSubs){
        cantidadSubs = unaCantidadSubs;
    }
    
    public void setCantidadCategorias(int unaCantidad){
        cantCategorias = unaCantidad;
    }
    
    private void inicializarEstrenos(int unaCantidadCategorias){
        estrenos = new Estreno[unaCantidadCategorias][12];
    }
    
    private void inicializarOcupados(int unaCantidadCategorias){
        ocupados = new int[unaCantidadCategorias];
        for(int i = 0; i < unaCantidadCategorias; i++){
            ocupados[i] = 0;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidadSubs(){
        return cantidadSubs;
    }
    
    public int getCantidadCategorias(){
        return cantCategorias;
    }
    
    public void registrarEstreno(Estreno unEstreno, int unaCategoria){
        estrenos[unaCategoria - 1][ocupados[unaCategoria - 1]] = unEstreno;
        ocupados[unaCategoria - 1]++;
    }
    
    public String informarCategoria(int unaCategoria){
        String aux = "";
        for(int i = 0; i < ocupados[unaCategoria - 1]; i++){
            aux += estrenos[unaCategoria - 1][i].toString();
        }
        
        return aux;
    }
    
    private double calcularGananciaTotal(){
        double total = 0;
        
        for(int i = 0; i < cantCategorias; i++){
            for(int j = 0; j < ocupados[i]; j ++){
                total += estrenos[i][j].getRecaudacion();
            }
        }
        
        return total;
    }
    
    @Override
    public String toString(){
        String aux = "";
        
        for(int i = 0; i < cantCategorias; i++){
            for(int j = 0; j < ocupados[i]; j ++){
                aux += estrenos[i][j].toString() + "\n";
            }
        }
        
        aux += calcularGananciaTotal();
        
        return aux;
    }
}
