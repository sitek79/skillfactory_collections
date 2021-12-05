package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadFile {
    String filename = "src/collections/application.properties";
    String resultSet;

    public String rf() {
        try (Scanner scanner = new Scanner(new File(filename)).useDelimiter("\\s*=\\s*")) {
            // \\s* in regular expressions means "any number or whitespaces".
            // We could've said simply useDelimiter("-") and Scanner would have
            // included the whitespaces as part of the data it extracted.

            //resultSet = scanner.collect(Collectors.toList());
//            while (scanner.hasNext()) {
//                list.add(scanner.next());
//            }
            System.out.println(resultSet);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }
        return resultSet;
    }
}
