public class TestEx1 {
    public static void main(String[] args) {
        OrderedList orase=new OrderedList();
        Town element;
        element=new Town("Timisoara", 100);
        orase.addInOrderedList(element);
        element=new Town("Arad", 150);
        orase.addInOrderedList(element);
        element=new Town("Bucuresti", 0);
        orase.addInOrderedList(element);
        element=new Town("Ploiesti", 30);
        orase.addInOrderedList(element);
        orase.print();

    }
}
