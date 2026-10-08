package repaso2;

public class Auto {
    private String dueño;
    
    private String patente;
    
    public Auto(String unDueño, String unaPatente){
        setDueño(unDueño);
        setPatente(unaPatente);
    }
    
    public void setDueño(String unDueño){
        dueño = unDueño;
    }
    
    public void setPatente(String unaPatente){
        patente = unaPatente;
    }
    
    public String getDueño(){
        return dueño;
    }
    
    public String getPatente(){
        return patente;
    }
}
