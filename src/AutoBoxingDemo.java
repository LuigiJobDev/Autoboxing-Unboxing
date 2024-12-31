import java.util.ArrayList;
import java.util.List;
public class AutoBoxingDemo {
    public static void mostraEsempio() {
        int[] numeriPrimitivi = {1, 2, 3};
        List<Integer> listaNumeri = new ArrayList<>();

        /*Autoboxin; conversione automatica da primitivo a oggetto*/
        for (int numero : numeriPrimitivi) {
            listaNumeri.add(numero); /*int -> integer*/
        }
        System.out.println("Lista di oggetti Integer: " + listaNumeri);

        /*Unboxing: conversione automatica da oggetto a primitivo*/
        int somma = 0;
        for (Integer numero : listaNumeri) {
            somma += numero; /*Integer -> int*/

        }
        System.out.println("Somma degli elementi (unboxing): " + somma);
    }
}
