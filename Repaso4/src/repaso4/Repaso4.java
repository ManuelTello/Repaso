package repaso4;

public class Repaso4 {
    public static void main(String[] args) {
        Coro hileras = new CoroPorHileras("Test", new Persona(40, "Hernan", 32, 4),2);
        Coro semi = new CoroSemicircular("Test 2",new Persona(40, "Hernan", 32, 4), 3);
                
        
        hileras.agregarCorista(new Persona(20,"Raul",22,1));
        hileras.agregarCorista(new Persona(20,"Raul",22,2));
        hileras.agregarCorista(new Persona(20,"Raul",22,1));
        hileras.agregarCorista(new Persona(20,"Raul",22,2));
        semi.agregarCorista(new Persona(20,"Raul",22,10));
        semi.agregarCorista(new Persona(20,"Raul",22,5));
        semi.agregarCorista(new Persona(20,"Raul",22,2));
        
        System.out.println(hileras.estaBienFormado());
        System.out.println(semi.estaBienFormado());
    }
}
