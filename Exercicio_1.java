import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;

public class Exercicio_1 {

	public static void main(String[] args) {

    //Input da sequencia inicial
		int[] sequence = {1, 7, 2, 9, 8};
		ArrayList<Integer> opening_sequence = createSequence(opening_sequence);
		print_All(opening_sequence);
	}
	
	public static ArrayList<Integer> createSequence(int[] opening_sequence) {
		ArrayList<Integer> sequence = new ArrayList();
		
		//Adiciona a sequencia inicial
		for(int i = 0; i < opening_sequence.length; i++) {
			sequence.add(opening_sequence[i]);
		}
		
		for(int i = 0; i < 101; i++) {
			sequence.add(sequence.get(i) + sequence.get(i+1));
		}
		
		return sequence;
	}
    //Passa e lista todos os elementos
	public static void print_All (ArrayList<Integer> list) {
		Iterator<Integer> counterNumber = list.iterator();
		
		while(counterNumber.hasNext()) {
			System.out.println(counterNumber.next());
		}
	}