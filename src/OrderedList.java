import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrderedList<T extends Comparable<T>> {

    private LinkedList<Town> towns=new LinkedList<>();
    ListIterator<Town> i=towns.listIterator();
    public boolean addInOrderedList(Town element) {
        i=towns.listIterator();
        while(i.hasNext()){
            boolean comp=i.next().equals(element);
            if(comp==true){
                return false;
            }
            i.previous();
            if(i.next().getKilometri()>element.getKilometri()){
                i.previous();
                i.add(element);
                return true;
            }

        }
        //daca a ajs pana aici e cel mai mare
        i.add(element);
        return true;

        }
    public void print(){
        i=towns.listIterator();
        while(i.hasNext()){
            System.out.print(i.next().getName()+" ");
            i.previous();
            System.out.println(i.next().getKilometri());
        }
    }



}