package ru.sberbank;

public class Node {
    Object key;
    Object value;
    boolean deleated;

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public boolean isDeleated() {
        return deleated;
    }

    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
        this.deleated = false;
    }
}
