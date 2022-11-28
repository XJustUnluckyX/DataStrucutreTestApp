package structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class ItemsTreeSet<E> implements DataStructure<E>{

    public ItemsTreeSet(){
        list = new TreeSet<>();
    }

    @Override
    public List<E> getList() {

        List<E> output = new ArrayList<>(list);

        return  output;
    }

    @Override
    public void insertStart(E e) {
        list.add(e);
    }

    @Override
    public void insertEnd(E e) {
        insertStart(e);
    }

    @Override
    public void insertMiddle(E e) {
        insertStart(e);
    }

    @Override
    public void removeItem(E e) {
        list.remove(e);
    }

    @Override
    public E getRandomItem() {

        E output = null;

        Iterator<E> it = list.iterator();

        Random rnd = new Random();

        int k = rnd.nextInt();

        if(k>list.size()){
            k = list.size()/2;
        }

        int i = 0;

        while(i < k ){

            output = it.next();
            i++;
        }

        return output;
    }

    @Override
    public E getMatchItem(E e) {

        for(Object el: list.toArray())
            if(e.equals((E)el))
                return (E)el;

        return null;
    }

    private TreeSet<E> list;
}
