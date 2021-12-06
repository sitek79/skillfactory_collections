package collections;

import java.io.*;
import java.util.ArrayList;

public class ArrayListShow {
    static String srcDir = "src/collections";
    static String appProp = "application.properties";

    public void readToArrayList() throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        String filePath = srcDir + "/" + appProp;

        FileInputStream fin = null;
        try {
            fin = new FileInputStream(filePath);
        } catch (IOException e) {
            System.out.println (e.toString());
            System.out.println("Файл " + appProp + " не найден.");
        }

        DataInputStream in = new DataInputStream(fin);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine = null;
        while ((strLine = br.readLine()) != null)   {
            strings.add(strLine);
        }
        in.close();
        System.out.println("Набор данных ArrayList :");
        System.out.println(strings);
        System.out.println("Пройдемся по набору данных и распечатаем все элементы ArrayList...");
//        for(int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }
        // укороченный вариант
        for (String number : strings) {
            System.out.println(number);
        }
    }
}
