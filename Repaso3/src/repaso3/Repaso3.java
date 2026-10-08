package repaso3;

public class Repaso3 {
    public static void main(String[] args) {
        Recital ocasional = new EventoOcasional("Banda test", 3, "privado", "Raul", 10);
        Recital gira = new EventoGira("Banda test", 3, "Raul", 5);
        
        ocasional.agregarTema("Tema 1");
        ocasional.agregarTema("Tema 2");
        ocasional.agregarTema("Tema 3");
        gira.agregarTema("Tema 1");
        gira.agregarTema("Tema 2");
        // no funciona agregarFecha
        
        System.out.println("Costo de ocasional " + ocasional.calcularCosto());
        //System.out.println("Costo gira " + gira.calcularCosto());
        System.out.println(ocasional.toString());
        //System.out.println(gira.toString());
    }
}
