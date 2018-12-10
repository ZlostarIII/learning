package my.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyHashMap<K, V> implements Map<K, V> {

    private int size;
    private final int INITIAL_CAPACITY = 16;
    private Node<K, V>[] entries;

    public MyHashMap() {
        entries = new Node[INITIAL_CAPACITY];
    }

    public MyHashMap(int capacity) {
        entries = new Node[capacity];
    }

    private static class Node<K, V> implements Map.Entry<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            this.value = value;
            return value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return Objects.equals(key, node.key) &&
                    Objects.equals(value, node.value) &&
                    Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value, next);
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public V get(Object key) {
        int hash = hash(key);

        if (entries[hash] == null) {
            return null;
        } else {
            Node<K, V> current = entries[hash];

            while (current != null) {
                if (current.key.equals(key)) {
                    return current.value;
                }
                current = current.next;
            }

            return null;
        }
    }

    @Override
    public V put(K key, V value) {
        Node<K, V> entry = new Node<>(key, value, null);

        int hash = hash(key);

        Node<K, V> current = entries[hash];

        if (current == null) {
            entries[hash] = entry;
            size++;
        } else {
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                } else {
                    current.next = entry;
                    size++;
                }
                current = current.next;
            }
        }

        return entries[hash].getValue();
    }

    @Override
    public V remove(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        // TODO Auto-generated method stub

    }

    @Override
    public void clear() {
        entries = null;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (Node<K, V> n : entries) {
            keys.add(n.getKey());
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
//		Collection<K> values = Stream.of(initMap).forEach(v -> v.getValue()).collect(Collectors.toCollection());
        Collection<K> values = null;
        return (Collection<V>) values;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        // TODO Auto-generated method stub
        return null;
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode()) % entries.length;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> myMap = new MyHashMap<>();
        myMap.put(1, "first");
        myMap.put(2, "second");
        myMap.put(3, "third");
        myMap.put(2, "forth");

        System.out.println(myMap.get(2));
    }
}
