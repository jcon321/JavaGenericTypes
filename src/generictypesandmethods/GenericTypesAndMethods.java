/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictypesandmethods;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jconner
 */
public class GenericTypesAndMethods {

    
    public static void main(String[] args) {
        //Testing Pairs
        List<Pair<?, ?>> listOfPairs = new ArrayList<>();
        
        Pair<Integer, String> p1 = new Pair<>(1, "Apple");
        Pair<String, String> p2 = new Pair<>("2", "Orange");
        
        listOfPairs.add(p1);
        listOfPairs.add(p2);
        
        for(int x = 0; x < listOfPairs.size(); x++) {
            System.out.println(listOfPairs.get(x).getKey() + " " + listOfPairs.get(x).getValue());
        }
        
        
        //Testing Singles
        List<Single<?>> listOfSingles = new ArrayList<>();
        Single<Integer> s1 = new Single(1);
        Single<String> s2 = new Single("2");
        Single<Boolean> s3 = new Single(false);
        
        listOfSingles.add(s1);
        listOfSingles.add(s2);
        listOfSingles.add(s3);
        
        for(int x = 0; x < listOfSingles.size(); x++) {
            System.out.println(listOfSingles.get(x).getValue());
        }
    }

    public static class Pair<K, V> {
        private K key;
        private V value;
        
        //Constructor
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
        
    }
    
    public static class Single<T> {
        private T value;
        
        public Single(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
        
    }
}
