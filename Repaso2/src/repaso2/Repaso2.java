package repaso2;

public class Repaso2 {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento("Test","La Plata",new Horario(8, 0),new Horario(21, 0),3,3);
        
        estacionamiento.registrarAuto(new Auto("Hernesto", "AAA"),1,1);
        estacionamiento.registrarAuto(new Auto("Raul", "BBB"),2,1);
        estacionamiento.registrarAuto(new Auto("Alex", "CCC"),3,2);

        
        System.out.println(estacionamiento.toString());
        System.out.println("Autos en plaza 1: " + estacionamiento.cantidadAutoEnPlaza(1));
        System.out.println(estacionamiento.autoExiste("CCC"));
    } 
}