package structures;

import java.util.ArrayList;
import java.util.Random;

public class ItemsList<E> implements DataStructure<E> {

    public ItemsList(){
        list = new ArrayList<>();
    }

    public ArrayList<E> getList() {
        return list;
    }

    @Override
    public void insertStart(E e) {
        list.add(0, e);
    }

    @Override
    public void insertEnd(E e) {
        int pos = list.size();
        list.add(pos-1,e);
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

        for(E el: list)
            if(el.equals(e))
                return el;

        return null;
    }

    public void setList(ArrayList<E> list) {
        this.list = list;
    }

    private ArrayList<E> list;
}
