import java.util.Vector;

public class Pila {
	/*IMPLEMENTAZIONE DI UNA PILA CON LA CLASSE VECTOR
	 * La pila � un sistema LIFO*/
	
	private Vector<Integer> Q;
	private int top = 0;//indica prima poszione libera per inserimento
	
	public Pila() {//costruttore
		Q = new Vector<Integer>();//si crea il vector
	}
		
	public void push(int v) {//METODO DI INSERIMENTO DI UN NODO DI CONTENUTO V
			Q.add(v);
			top++;//si aggiorna la prima posizione libera dopo inserimento del contenuto v
			System.out.println("Inserito " + v);
	}
	
	public int pop() {//METODO DI ESTRAZIONE DELL'ULTIMO ELEMENTO INSERITO
		if (Q.isEmpty()) {//se la pila � vuota non � possibile rimuovere alcun contenuto
			System.out.println("Pila vuota - operazione non eseguita");
			return 0;
		}
		else//se la pila non � vuota
			System.out.println("Estratto " + Q.get(top-1));//si estrae ultimo elemento presente nella pila che giace in poszione top-1
			return Q.remove(--top);//restituisce elemento estratto essendo che il metodo restituisce un intero
	}
	
	public String toString() {
		return Q.toString();
	}

}
