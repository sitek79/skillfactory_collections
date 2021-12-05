package collections;

import collections.arraylist.ShowArrayList;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionApp {
    static String fileName = "src/collections/application.properties";
    String result = "-- здесь конфигурация application.properties --";

    public static void main(String[] args) throws IOException {
        // будем читать когфигурационный файл программы и по разному представлять переменные содержащиеся в нем
        ShowArrayList sar = new ShowArrayList();
        ReadFileAppProp read = new ReadFileAppProp();

        //System.out.println("Этот список хранит только строки:");
        //sar.showArrayList();

        // читаем файл свойств
        //read.readFile();
        read.readProperties();

        //String svoistva = read.readProperties();

        //ArrayList<String> planets = Stream.of(svoistva).collect(Collectors.toCollection(ArrayList::new));
        //System.out.print(planets.size());

        //ReadFile readFile = new ReadFile();
        //ArrayList arrayList = new ArrayList<>();
        //readFile.rf();

        //String fileName = "src/collections/application.properties";

        // почитаем файл
        List result = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        System.out.println("ArrayList");
        Object[] resultArray = result.toArray();
        for(Object element : resultArray) {
            System.out.println(element);
        }

        //System.out.println(resultArray);
    }
}
