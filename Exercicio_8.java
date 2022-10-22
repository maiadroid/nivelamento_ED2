import java.util.List;

public class Exercicio_8 {
    public static void organize(List<Integer> displayLotes) {
        order(display, 0, displayLotes.size() - 1);
    }

      //Metodo para fazer a ordem
    public static void order(List<Integer> list, Integer esquerda, Integer direita) {
        Integer pivot = esquerda;
        Integer aux = esquerda;
        Integer i = esquerda;
        Integer j = esquerda;

        //Aprendi essa logica pelo original do gabriel ramiro 
        for (i = esquerda + 1; i <= direita; i++) {
            j = i;
            if (list.get(j) < list.get(pivot)) {
                aux = list.get(j);
                while (j > pivot) {
                    list.set(j, list.get(j - 1));
                    j--;
                }
                list.set(j, aux);
                pivot++;
            }
        }
        if (pivot + 1 <= direita) {
            order(list, pivot + 1, direita);
        }
        if (pivot - 1 >= esquerda) {
            order(list, esquerda, pivot - 1);
        }

    }
}