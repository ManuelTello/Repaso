package repaso1;

public class Repaso1 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto de prueba", 1, "Raul");
        Investigador investigador1 = new Investigador("Hernesto", 1, "bioquimica");
        Investigador investigador2 = new Investigador("Manuel", 2, "electronica");
        Investigador investigador3 = new Investigador("Felipe", 3, "ingeniero");
       
        for(int i = 0; i < 2; i++){
            //Subsidio subsidio = new Subsidio(10.0,"test") <-- esto esta mal
            investigador1.agregarSubsidio(new Subsidio(10.0,"test"));
            investigador2.agregarSubsidio(new Subsidio(10.0,"test"));
            investigador3.agregarSubsidio(new Subsidio(10.0,"test"));
        }
        proyecto.agregarInvestigador(investigador1);
        proyecto.agregarInvestigador(investigador2);
        proyecto.agregarInvestigador(investigador3);
        proyecto.otorgarTodos("Hernesto");
        
        System.out.println(proyecto.toString());
    }
}
