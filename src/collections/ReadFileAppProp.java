package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFileAppProp {
    static String srcDir = "src/collections/";
    static String appProp = "application.properties";

   /*public void readFile() {
       FileInputStream inputStream = null;
       try {
           File file = new File(srcDir, appProp);
           inputStream = new FileInputStream(file);
           // используем inputStream для чтения файла
           inputStream.read();
       } catch (FileNotFoundException e) {
           System.err.println("Ошибка! Файл не найден!");
       } catch (IOException e) {
           System.out.println("Ошибка ввода-вывода " + e.getMessage());
       } finally {
           if (inputStream != null) {
               try {
                   inputStream.close();
               } catch (IOException e) {
                   System.err.println("Ошибка закрытия потока чтения файла ...");
               }
           }
       }
   }*/

    // обращение к файлу application.properties
    public String readProperties() {
        //типа Hashtable для удобной работы с данными
        Properties prop = new Properties();
        try {
            //File file = new File(srcDir, appProp);
            //FileInputStream inputStream = new FileInputStream(file);
            prop.load(new FileInputStream(srcDir+appProp));
            prop.list(System.out);

            //Reading each property value
            System.out.println("1.version=" + prop.getProperty("1.version"));
            System.out.println("2.name=" + prop.getProperty("2.name"));
            System.out.println("3.date=" + prop.getProperty("3.date"));
            System.out.println("4.spring.profiles.active=" + prop.getProperty("4.spring.profiles.active"));
            System.out.println("5.server.port=" + prop.getProperty("5.server.port"));
            System.out.println("6.server.startup_timeout=" + prop.getProperty("6.server.startup_timeout"));
            System.out.println("7.server.ssl.key-store=" + prop.getProperty("7.server.ssl.key-store"));
            System.out.println("8.server.ssl.key-store-password=" + prop.getProperty("8.server.ssl.key-store-password"));
            System.out.println("9.server.ssl.key-password=" + prop.getProperty("9.server.ssl.key-password"));
            System.out.println("10.server.ssl.key-alias=" + prop.getProperty("10.server.ssl.key-alias"));
            System.out.println("11.# Database credentials:=" + prop.getProperty("11.# Database credentials:"));
            System.out.println("12.spring.datasource.username=" + prop.getProperty("12.spring.datasource.username"));
            System.out.println("13.spring.datasource.password=" + prop.getProperty("13.spring.datasource.password"));
            System.out.println("14.## License=" + prop.getProperty("14.## License"));
            System.out.println("15.server.license.file=" + prop.getProperty("15.server.license.file"));

        } catch (IOException e) {
            System.err.println("Ошибка чтения свойства в файле " + appProp);
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println("Во входных данных недопустимый символ Юникода.");
        } catch (ClassCastException e) {
            System.err.println("Объект свойств содержит какие-либо ключи или значения, которые не являются строками.");
        }
        return prop.toString();
    }
}
