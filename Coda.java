
import java.util.Vector;
/*IMPLEMENTAZIONE DI UNA CODA CON LA CLASSE VECTOR
 * La coda � un sistema FIFO*/
public class Coda {
	
	private Vector<Integer> Q;
	
	public Coda() {//costruttore
		Q = new Vector<Integer>();//si crea il vector
	}
		
	public void push(int v) {//METODO DI INSERIMENTO DI UN NODO DI CONTENUTO V
			Q.add(v);
			System.out.println("Inserito " + v);
	}
	
	public int pop() {//METODO DI ESTRAZIONE DEL PRIMO ELEMENTO INSERITO
		if (Q.isEmpty()) {//se la coda � vuota non pu� avvenire estrazione
			System.out.println("Coda vuota - operazione non eseguita");
			return 0;
		}
		else {// se la coda non � vuota
			int x = Q.remove(0);//si salva elemento in poszione iniziale che � quello che andr� rimosso
			System.out.println("Estratto " + x);
			return x;//restituisce elemento estratto essendo che il metodo restituisce un intero
		}
	}
	
	public String toString() {
		return Q.toString();
	}
	
}
