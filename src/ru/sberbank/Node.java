package ru.sberbank;

public class Node {
    Object key;
    Object value;
    boolean deleated;

    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
        this.deleated = false;
    }
}
