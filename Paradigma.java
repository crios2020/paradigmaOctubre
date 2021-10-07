public class Paradigma{
	public static void main(String[] args){
		//Punto de entrada del proyecto
		System.out.println("Hola Mundo!!");
		
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
		auto2.acelerar();
		
		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
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
	void acelerar(){
		velocidad=velocidad+10;
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
}//end class
