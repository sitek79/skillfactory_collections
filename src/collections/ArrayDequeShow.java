package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Properties;

import static collections.ClassAnalyzer.analyzeClass;

public class ArrayDequeShow {
    static String srcDir = "src/collections/";
    static String appProp = "application.properties";

    public void readArrayDeque() {
        // соберем из файла набор для добавления в очередь
        Properties prop = new Properties();
        try {
            //File file = new File(srcDir, appProp);
            //FileInputStream inputStream = new FileInputStream(file);
            prop.load(new FileInputStream(srcDir + appProp));
            // вывод в консоль
            //prop.list(System.out);
        } catch (IOException e) {
            System.err.println("Ошибка чтения свойства в файле " + appProp);
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println("Во входных данных недопустимый символ Юникода.");
        } catch (ClassCastException e) {
            System.err.println("Объект свойств содержит какие-либо ключи или значения, которые не являются строками.");
        }
        // посмотрим принадлежность класса Properties
        System.out.println("Оказывается класс Properties является подклассом Hashtable.");
        analyzeClass(new Properties());

        // получили набор
        System.out.println("Вот такой набор " + prop);
        // в виде списка
        System.out.println("Печатаем в виде списка c разделителем ':'");
        prop.forEach((k, v) -> System.out.println(k + ":" + v));
        //
        ArrayDeque<String> states = new ArrayDeque<String>();
        // добавим этот набор в очередь
        //states.add(prop.getProperty("3.date"));
        System.out.println("Количество элементов в файле " + appProp + ": " + prop.size());
        System.out.println(prop.stringPropertyNames());
        //проходимся по всем ключам ...
        for (String key : prop.stringPropertyNames()) {
            //System.out.print("Ключ " + key + "свойство " + prop.get(key) + "\n");
            // ... и добавляем каждый ключ и его значение в ArrayDeque
            String keyAdd = key + " _ " + prop.get(key);
            states.add(keyAdd);
        }
        // стандартное добавление элементов add
        states.add("0.START.sh");
        states.addFirst("1.STOP.sh"); // добавляем элемент в самое начало
        states.push("2.CLEAN.sh"); // добавляем элемент в самое начало
        states.addLast("3.INSTSALL.sh"); // добавляем элемент в конец коллекции
        states.add("4.UPDATE.sh");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println("Первый элемент очереди " + sFirst);
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println("Последний элемент очереди " + sLast);
        System.out.printf("Размер Queue : %d \n", states.size());  // 5

        // перебор коллекции
        System.out.println("Перебор коллекции pop().  возвращает с удалением элемент из начала очереди.");
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }
        System.out.println("Содержимое коллекции после извлечения всех элементов: " + states);

        // очередь из объектов AppProperties
        ArrayDeque<AppProperties> prop2 = new ArrayDeque<AppProperties>();
        prop2.add(new AppProperties("1).openjdk version"));
        prop2.addFirst(new AppProperties("2).OS_Linux")); // добавляем элемент в самое начало
        prop2.addLast(new AppProperties("3).JAVA_HOME")); // добавляем элемент в конец коллекции
        prop2.push(new AppProperties("4).OpenJDK Runtime Environment Temurin-11.0.13+8")); // добавляем элемент в самое начало
        prop2.add(new AppProperties("5).OpenJDK 64-Bit Server VM"));
        // перебор без извлечения
        for(AppProperties ap : prop2){
            System.out.println(ap.getName());
        }
    }
}
