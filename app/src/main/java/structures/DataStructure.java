package structures;

import java.util.List;

public interface DataStructure<E> {
    List<E> getList();

    void insertStart(E e);

    void insertEnd(E e);

    void insertMiddle(E e);

    void removeItem(E e);

    E getRandomItem();

    E getMatchItem(E e);
}
