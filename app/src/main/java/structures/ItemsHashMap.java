package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class ItemsHashMap<E> implements DataStructure<E>{

    public ItemsHashMap(){
        list = new HashMap<>();
        key = new AtomicInteger(0);
    }

    public List<E> getList() {

        return new ArrayList<>(list.values());
    }

    @Override
    public void insertStart(E e) {
        list.put(key.getAndIncrement(), e);
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
       Set<Integer> keys = list.keySet();

       int pos = 0;

        for (int k: keys) {
            if(Objects.equals(list.get(k), e)) {
                pos = k;
            }
        }

        list.remove(pos);

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

        for (E el: list.values()) {
            if(e.equals(el))
                return el;
        }

        return null;
    }

    public void setList(HashMap<Integer, E> list) {
        this.list = list;
    }

    private final AtomicInteger key;
    private HashMap<Integer, E> list;
}
