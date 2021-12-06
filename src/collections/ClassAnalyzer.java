package collections;

import java.util.Arrays;

public class ClassAnalyzer {
    public static void analyzeClass(Object o) {
        Class clazz = o.getClass();
        System.out.println("Имя класса: " + clazz);
        System.out.println("Поля класса: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Родительский класс: " + clazz.getSuperclass());
        System.out.println("Методы класса: " +  Arrays.toString(clazz.getDeclaredMethods()));
        //System.out.println("Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));
    }
}
