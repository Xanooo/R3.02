public class MaPile<T> {
private T base;
private T next;
private int size;

public MaPile(T base) {
    this.base = base;
    this.next = null;
}

public MaPile(T base, T next) {
    this.base = base;
    this.next = next;
}

public void add(T item) {
    if (next == null) {
        next = item;
    }

}

}
