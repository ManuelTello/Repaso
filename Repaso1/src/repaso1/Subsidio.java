package repaso1;

public class Subsidio {
    private double monto;
    
    private String motivo;
    
    private boolean fueOtorgado;
    
    public Subsidio(double unMonto, String unMotivo){
        setMonto(unMonto);
        setMotivo(unMotivo);
        setFueOtorgado(false);
    }
    
    private void setMonto(double unMonto){
        monto = unMonto;
    }
    
    public void setMotivo(String unMotivo){
        motivo = unMotivo;
    }
    
    private void setFueOtorgado(boolean unFueOtorgado){
        fueOtorgado = unFueOtorgado;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public String getMotivo(){
        return motivo;
    }
    
    public boolean getFueOtorgado(){
        return fueOtorgado;
    }

    public void otorgar(){
        setFueOtorgado(true);
    }
}
