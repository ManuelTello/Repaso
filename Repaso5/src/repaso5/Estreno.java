package repaso5;

public class Estreno {
    private String titulo;
    
    private int tipo;
    
    private double recaudacion;
    
    private int visualizaciones;
    
    public Estreno(String unTitulo, int unTipo, double unaRecaudacion, int unasVisualizaciones){
        setTitulo(unTitulo);
        setTipo(unTipo);
        setRecaudacion(unaRecaudacion);
        setVisualizaciones(unasVisualizaciones);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public int getTipo() {
        return tipo;
    }

    public double getRecaudacion() {
        return recaudacion; 
    }
    
    public double getGanancia(){
        return recaudacion / 2;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setTitulo(String unTitulo) {
        titulo = unTitulo;
    }

    public void setTipo(int unTipo) {
        tipo = unTipo;
    }

    public void setRecaudacion(double unasRecaudacion) {
        recaudacion = unasRecaudacion;
    }

    public void setVisualizaciones(int unasVisualizaciones) {
        visualizaciones = unasVisualizaciones;
    }
    
    @Override
    public String toString(){
        return titulo + ", " + tipo + ", " + recaudacion + ", " + visualizaciones + "\n";
    }
}
