public class Paradigma3{
    public static void main(String[] main){
        Auto.acelerar(10);
        System.out.println("-- auto1 --");
        Auto auto1=new Auto("Jeep","Cheroke","Negro");
        auto1.acelerar(10);
        System.out.println(auto1.getEstado()+" "+auto1.getVelocidad());  //20

        System.out.println("-- auto2 --");
        Auto auto2=new Auto("Renault","12","Azul");
        auto2.acelerar(10);
        System.out.println(auto2.getEstado()+" "+auto2.getVelocidad());     //30
        System.out.println(auto1.getEstado()+" "+auto1.getVelocidad());     //30

    }
}

class Auto{
    private String marca;
    private String modelo;
    private String color;
    private static int velocidad;

    public Auto(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

    public String getEstado(){
        return marca+" "+modelo+" "+color;
    }

    public static void acelerar(int kilometros){
        velocidad=velocidad+kilometros;
    }

    public static void frenar(int kilometros){
        velocidad=velocidad-kilometros;
    }

    public static int getVelocidad(){
        return velocidad;
    }

}