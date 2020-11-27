
public class UsaPilaCoda {
	
	public static void main(String[] args) {
		Coda Q1 = new Coda();
		Pila Q2 = new Pila();
		Q1.push(0);
		Q1.push(1);
		Q1.push(2);
		Q1.push(3);
		Q1.push(4);
		Q1.push(5);
		Q1.push(6);
		Q2.push(Q1.pop());
		Q2.push(Q1.pop());
		Q2.push(Q1.pop());
		Q1.push(7);
		Q2.push(8);	
		System.out.println(Q1);
		System.out.println(Q2);
	}

}
