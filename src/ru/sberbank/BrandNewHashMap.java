package ru.sberbank;

public class BrandNewHashMap {
    private int size = 3;
    private Node[] sklad = new Node[size];
    private final double loadFactor = 0.75;

    private void resize() {
        double counter = 0;
        for (int i = 0; i < sklad.length; i++) {
            if (sklad[i] != null) {
                counter++;
            }
        }
        if ((counter / sklad.length) >= loadFactor) {
            Node[] skladPoBolshe = new Node[sklad.length * 2];
            for (int i = 0; i < sklad.length; i++) {
                int index = getIndex(sklad[i].key) % skladPoBolshe.length;
                skladPoBolshe[index] = sklad[i];
            }
            sklad = skladPoBolshe;
        }
    }

    public int getIndex(Object key) {
        return (Math.abs(key.hashCode()));
    }

    public void put(Object key, Object value) {
        Node somenode = new Node(key, value);
        int index1 = getIndex(key) % sklad.length;
        if (sklad[index1] != somenode) {
            for (int i = 0; i < sklad.length; i++) {
                int index = (getIndex(key) + i) % sklad.length;
                if (sklad[index] == null || (sklad[index].deleated)) {
                    sklad[index] = somenode;
                    break;
                }
            }
            resize();
        }
    }

    public Object get(Object key) {
        for (int i = 0; i < sklad.length; i++) {
            int index = (getIndex(key) + i) % sklad.length;
            if (sklad[index] != null && sklad[index].key.equals(key) && !sklad[index].deleated) {
                return (sklad[index].value);
            }
        }
        return (null);
    }

    public void remove(Object key) {
        for (int i = 0; i < sklad.length; i++) {
            int index = (getIndex(key) + i) % sklad.length;
            if (sklad[index] != null && sklad[index].key.equals(key)) {
                sklad[index].deleated = true;
            }
        }
    }

    public boolean contains(Object key) {
        return (get(key) != null);
    }

    public int size() {
        return sklad.length;
    }
}

