import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercitiul2 {
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> lista){
        ListIterator<Integer> i=lista.listIterator();
        while(i.hasNext()){
            Integer urmatorul=i.next();
            while(i.hasNext() && urmatorul==i.next()){
                i.remove();
            }
            if(i.hasNext()==true)
                i.previous();

        }
        return lista;

    }

    //2.2

    public static LinkedList<Integer> removeDuplicates2(LinkedList<Integer> lista){
        ListIterator<Integer> it=lista.listIterator();
        Integer val=it.next();
        while(it.hasNext()){
            boolean cond=true;

            while (it.hasNext() ) {
                int aux = it.next();
                if (val == aux) {
                    it.previous();
                    it.remove();
                    cond = false;
                } else if (!cond){
                    it.previous();
                    break;
                }
                val = aux;
            }
            if(cond==false){
                it.previous();
                it.remove();
            }


        }
        return lista;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>(), lista2 = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            lista.add(sc.nextInt());
        lista = removeDuplicates(lista);
        System.out.println(lista);

    }
}
