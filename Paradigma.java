public class Paradigma{
	public static void main(String[] args){
		//Punto de entrada del proyecto
		System.out.println("Hola Mundo!!");
		
		String nombre="Carlos";
		System.out.println(nombre);
		//nombre=2; //error
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();		//se construye un objeto 
		auto1.marca="Citroen";
		auto1.modelo="C4";
		auto1.color="Rojo";
		auto1.acelerar();			// 10
		auto1.acelerar();			// 20
		auto1.acelerar();			// 30
		auto1.frenar();				// 20
		System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
		
		System.out.println("-- auto2 --");
		Auto auto2 = new Auto();
		auto2.marca="Fiat";
		auto2.modelo="Idea";
		auto2.color="Rojo";
		//auto2.acelerar(36);
		//auto2.acelerar(12);
		auto2.acelerar();
		auto2.acelerar(20,true);

		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
		
		auto2.imprimirVelocidad();
		System.out.println(auto2.obtenerVelocidad());

		Auto auto3=new Auto();
		System.out.println(auto3.marca+" "+auto3.modelo+" "+auto3.color+" "+auto3.velocidad);
		
	}
}

//declaración de clases
class Auto{
	
	//atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	
	//métodos
	void acelerar(){												//acelerar
		//velocidad=velocidad+10;
		acelerar(10);
	}
	
	//método sobrecargado
	private void acelerar(int kilometros){ //ingreso de parametros			//acelerarInt
		velocidad=velocidad+kilometros;
		if(velocidad>=100) {
			velocidad=100;
		}
	}

	void acelerar(int km, boolean tieneNitro){						//acelerarIntBoolean
		if(tieneNitro == false){
			acelerar(km);							//llamado de método de la misma clase
		} else {
			acelerar(km*2);
		}
	}


	//void acelerar(int x){}			//error						//acelerarInt

	void acelerar(String x){}										//acelerarString
	void acelerar(String x,int y){}									//acelerarStringInt
	void acelerar(int x,int y){}									//acelerarIntInt

	
	void frenar(){
		velocidad=velocidad-10;
	}
	
	public int getVelocidad(){
		return velocidad;
	}

	public void setColor(String color){
		this.color=color;
	}

	public String getColor(){
		return color;
	}

	void imprimirVelocidad(){
		System.out.println(velocidad);
	}
	
	int obtenerVelocidad(){
		return velocidad;
	}
	
}//end class

class Cuenta{
	int nro;
	double saldo;
}

class Cliente{
	int nro;
	String nombre;
	int edad;
	//String direccion;
	Direccion direccion;

	void metodo(){
		nombre="Juan";
		//direccion="Lavalle 648 piso 8 departamento 1 CABA cp1068 Argentina";
		direccion=new Direccion();
		direccion.calle="Lavalle";
		direccion.numero=648;
		direccion.piso="8";
		direccion.depto="1";
		direccion.ciudad="CABA";

	}
}

class Direccion{
	String calle;
	int numero;
	String piso;
	String depto;
	String ciudad;
	String cp;
	String pais;
}













