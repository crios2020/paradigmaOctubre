public class Paradigma2{
    public static void main(String[] args){
        System.out.println("-- Clase 2 --");

        //Objetos Simulados - Objetos MOCKS
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(80000);
        cuenta1.depositar(30000);
        cuenta1.debitar(15000);
        System.out.println(cuenta1.getEstado());

        System.out.println("-- cliente1 --");
        Cliente cliente1=new Cliente(1,"Joaquin",38,2);
        //cliente1.depositar(25000);
        cliente1.getCuenta().depositar(25000);
        cliente1.getCuenta().depositar(30000);
        cliente1.getCuenta().debitar(10000);
        System.out.println(cliente1.getEstado());

    }
}

class Cliente{
    private int nro;
	private String nombre;
	private int edad;
    private Cuenta cuenta;

    public Cliente(int nro, String nombre, int edad, int nroCuenta){
        this.nro=nro;
        this.nombre=nombre;
        this.edad=edad;
        this.cuenta=new Cuenta(nroCuenta, "arg$");
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    public String getEstado(){
        return nro+" "+nombre+" "+edad+" "+cuenta.getEstado();
    }

}

class Cuenta{
    private int nro;
    private String moneda;
    private double saldo;

    //método constructor
    public Cuenta(int nro, String moneda){
        this.nro=nro;
        this.moneda=moneda;
    }

    public void depositar(double monto){
        saldo=saldo+monto;
    }

    public void debitar(double monto){
        if(monto<=saldo){
            saldo=saldo-monto;
        }else{
            System.out.println("Saldo Insuficiente!!!");
        }
    }

    public String getEstado(){
        return nro+" "+moneda+" "+saldo;
    }

}