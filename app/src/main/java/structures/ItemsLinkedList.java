package structures;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ItemsLinkedList<E> implements DataStructure<E>{

    public ItemsLinkedList(){
        list = new LinkedList<>();
    }

    @Override
    public List<E> getList() {
        return list;
    }

    @Override
    public void insertStart(E e) {
        list.addFirst(e);
    }

    @Override
    public void insertEnd(E e) {
        list.addLast(e);
    }

    @Override
    public void insertMiddle(E e) {

        int pos = list.size();

        pos = (pos - 1)/2;

        list.add(pos,e);
    }

    @Override
    public void removeItem(E e) {
        list.remove(e);
    }

    @Override
    public E getRandomItem() {
        Random rnd = new Random();

        int k = rnd.nextInt();

        if(k>list.size()){
            k = list.size()/2;
        }

        return list.get(k);
    }

    @Override
    public E getMatchItem(E e) {

        for (E el: list) {
            if(e.equals(el))
                return el;
        }

        return null;
    }

    private LinkedList<E> list;
}
