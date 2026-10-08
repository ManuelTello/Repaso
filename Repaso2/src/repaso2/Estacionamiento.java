package repaso2;

public class Estacionamiento {
    private String nombre;
    
    private String direccion;
    
    private Horario apertura;
    
    private Horario cierre;
    
    private Auto[][] puestos;
    
    private int pisos;
    
    private int plazas;
        
    public Estacionamiento(String unNombre, String unaDireccion){
        setNombre(unNombre);
        setDireccion(unaDireccion);
        setApertura(new Horario(8,0));
        setCierre(new Horario(21,00));
        inicializarPuestos(5,10);
        setPisos(5);
        setPlazas(10);
    }
    
    public Estacionamiento(String unNombre, String unaDireccion, Horario unaApertura, Horario unCierre, int unosPisos, int unasPlazas){
        setNombre(unNombre);
        setDireccion(unaDireccion);
        setApertura(unaApertura);
        setCierre(unCierre);
        inicializarPuestos(unosPisos, unasPlazas);
        setPisos(unosPisos);
        setPlazas(unasPlazas);
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    
    private void setApertura(Horario unaApertura){
        apertura = unaApertura;
    }
    
    private void setCierre(Horario unCierre){
        cierre = unCierre;
    }
    
    private void inicializarPuestos(int f, int c){
        puestos = new Auto[f][c];
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                puestos[i][j] = null;
            }
        }
    }
    
    private void setPisos(int unosPisos){
        pisos = unosPisos;
    }
    
    private  void setPlazas(int unasPlazas){
        plazas = unasPlazas;  
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public Horario getApertura(){
        return apertura;
    }
    
    public Horario getCierre(){
        return cierre;
    }
    
    public int getPisos(){
        return pisos;
    }
    
    public int getPlazas(){
        return plazas;
    }
    
    public int getCantidadPuestos(){
        return pisos * plazas;
    }
    
    public void registrarAuto(Auto unAuto, int unPiso, int unaPlaza){
        puestos[unPiso - 1][unaPlaza - 1] = unAuto;
    }
    
    private int buscarAuto(String unaPatente){       
        int index = 0;
        boolean seEncontro = false;
        
        while(index < getCantidadPuestos() && !seEncontro){
            Auto actual = puestos[index / getPisos()][index % getPisos()];
            if(actual != null){
                if(unaPatente.equals(actual.getPatente())){
                    seEncontro = true;
                }else{
                    index ++;
                }
            }else{
                index ++;
            }
        }
        
        if(seEncontro){
            return index;
        }else{
            return -1;
        }
    }
    
    public String autoExiste(String unaPatente){
        int index = buscarAuto(unaPatente);
        String respuesta = null;
        
        if(index != -1){
            respuesta = "Piso " + ((index / getPisos()) + 1) + ", plaza " + ((index % getPisos() + 1));
        }else{
            respuesta = "Auto con patente " + unaPatente + " no existe";
        }
        
        return respuesta;
    }
    
    public int cantidadAutoEnPlaza(int unaPlaza){
        int total = 0;   
        
        for(int i = 0; i < getPisos(); i++){
            if(puestos[i][unaPlaza - 1] != null){
                total++;
            }
        }
        
        return total;
    }
    
    @Override
    public String toString(){
        String aux = "";
        
        for(int i = 0; i < getPisos(); i ++){
            aux += "Piso " + (i + 1)+ "\n";
            for(int j = 0; j < getPlazas(); j++){
                String estado = null;
                Auto actual = puestos[i][j];
                if(actual == null){
                    estado = " libre";
                }else{
                    estado = " dueño " + actual.getDueño() + ", patente " + actual.getPatente();
                }
                
                aux += "    Plaza " + (j + 1) + estado + "\n";
            }
        }
        
        return aux;
    }
}
