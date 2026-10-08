package repaso3;

public class EventoOcasional extends Recital{
    private String motivo;
    
    private String contratante;
    
    private int dia;
    
    public EventoOcasional(String banda, int unaCantidadTemas, String unMotivo, String unContratante, int unDia){
        super(banda, unaCantidadTemas);
        setMotivo(unMotivo);
        setContratante(unContratante);
        setDia(unDia);
    }
    
    public void setMotivo(String unMotivo){
        motivo = unMotivo;
    }
    
    public void setContratante(String unContratante){
        contratante = unContratante;
    }
    
    public void setDia(int unDia){
        dia = unDia;
    }
    
    public String getMotivo(){
        return motivo;
    }
    
    public String getContratante(){
        return contratante;
    }
    
    public int getDia(){
        return dia;
    }
    
    @Override
    public double calcularCosto(){        
        if(motivo.equals("beneficio")){
            return 0;
        }else if(motivo.equals("show de TV")){
            return 50000;
        }else if(motivo.equals("privado")){
            return 150000;
        }else{
            return -1;
        }
    }
    
    @Override
    public String toString(){
        String aux = super.toString();
        
        if(getMotivo().equals("beneficio")){
            aux += "Recuerden colaborar con " + contratante;
        }else if(getMotivo().equals("shot de TV")){
            aux += "Saludos amigos televidentes";
        }else if(getMotivo().equals("privado")){
            aux += "Un feliz cumpleaños para " + contratante;
        }
        
        return aux;
    }
}
