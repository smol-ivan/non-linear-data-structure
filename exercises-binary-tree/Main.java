/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	
	Nodo raiz= new Nodo(1);
	Nodo nodo1= new Nodo(2);
	Nodo nodo2= new Nodo(3);
	Nodo nodo3= new Nodo(4);
	Nodo nodo4= new Nodo(5);
	
	raiz.setIzq(nodo1);
	raiz.setDer(nodo2);
	nodo2.setIzq(nodo3);
	nodo2.setDer(nodo4);
	
	
	Nodo raizb= new Nodo(1);
	Nodo nodo1b= new Nodo(2);
	Nodo nodo2b= new Nodo(10);
	Nodo nodo3b= new Nodo(4);
	Nodo nodo4b= new Nodo(5);
	
	raizb.setIzq(nodo2b);
	raizb.setDer(nodo1b);
	nodo2b.setIzq(nodo4b);
	nodo2b.setDer(nodo3b);
	
	
	
    //	Ejercicio1 ej = new Ejercicio1(raiz);
        
    //	ej.print();
        
    //	int num_hojas= ej.cuentaHojasIterativo();
        
    //	System.out.println("El numero de hojas es "+ num_hojas);
	
	// Ejercicio2 ej2= new Ejercicio2(raiz,raizb);
	// ej2.print();
	
	// System.out.println(ej2.esEspejoIterativo());
	
	// Ejercicio copia arbol
	Exercise1 ej = new Exercise1(raiz);
	ej.print();
	}
}
