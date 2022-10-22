
import java.util.LinkedList;
import java.util.Collections; //para usar ordenacao

public class Exercicio_2 {

	public static void main(String[] args) {

		LinkedList<Integer> cars = new LinkedList<>();
		carros.add(1);
		carros.add(5);
		carros.add(4);
		carros.add(3);
		carros.add(2);
		carros.add(6);
		carros.add(7);
		
		Collections.sort(cars);

        //output ordenado depois do metodo sort por collections

		System.out.println(cars);
	}
	
}
