import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercitiul3 {
    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
        Integer t=0,a,b;
        LinkedList<Integer> c=new LinkedList<>();
        ListIterator<Integer> it1,it2;
        it1=op1.listIterator(op1.size());
        it2=op2.listIterator(op2.size());
        while(it1.hasPrevious() && it2.hasPrevious()){
            a=it1.previous();
            b=it2.previous();
            if(a+b>=10)
            {
                c.addFirst((a+b)%10+t);
                t=(a+b)/10;
            }
            else {
                c.addFirst(a+b+t);
                t=0;
            }
        }
        while(it1.hasPrevious()){
            a=it1.previous();
            c.addFirst(a+t);
        }
        while(it2.hasPrevious()){
            a=it2.previous();
            c.addFirst(a+t);
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> a=new LinkedList<>();
        LinkedList<Integer> b=new LinkedList<>();
        int i,m;
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        ListIterator<Integer> it=a.listIterator(a.size());
        m=sc.nextInt();
        for(i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        b=sum(a,b);
        System.out.println(b);

    }
}
