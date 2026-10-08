package repaso2;

public class Horario {
    private int hora;
    
    private int minutos;
    
    public Horario(int hora, int minutos){
        setHora(hora);
        setMinutos(minutos);
    }
    
    private void setHora(int unaHora){
        hora = unaHora;
    }
            
    private void setMinutos(int unosMinutos){
        minutos = unosMinutos;
    }
}
