package collections;

import collections.arraylist.ShowArrayList;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionApp {
    public static void main(String[] args) {
        // будем читать когфигурационный файл программы и по разному представлять переменные содержащиеся в нем
        ShowArrayList sar = new ShowArrayList();
        ReadFileAppProp read = new ReadFileAppProp();

        System.out.println("Этот список хранит только строки:");
        //sar.showArrayList();

        // читаем файл свойств
        //read.readFile();
        //read.readProperties();
        //System.out.println(read.readProperties());
        String svoistva = read.readProperties();
        ArrayList<String> planets = Stream.of(svoistva).collect(Collectors.toCollection(ArrayList::new));
        //System.out.print(planets.stream().toList());
        //planets.add("Mars");
        //planets.add("Venus");

    }
}
