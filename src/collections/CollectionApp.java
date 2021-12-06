package collections;

import java.io.*;

public class CollectionApp {
    public static <Address> void main(String[] args) throws IOException {
        // ArrayList
        ArrayListShow alistshow = new ArrayListShow();
        alistshow.readToArrayList();
        //
        // ArrayDeque
        ArrayDequeShow ads = new ArrayDequeShow();
        ads.readArrayDeque();
        //
        // HashMap
        System.out.println("Интерфейс Map и класс HashMap");
        HashMapShow hms = new HashMapShow();
        hms.readHashMap();
    }
}
