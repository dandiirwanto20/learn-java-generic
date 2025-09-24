package application;

import generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        // for multiple generic
        Pair<String, Integer> pair = new Pair<String, Integer>("Dandi", 100);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
