import java.util.List;

public class Main {
    public static void main(String[] args) {

        String file = "example.txt";
        String text = "Пример данных для записи в файл.\nВторая строка.\nТретья строка.";

        FileHandler fh = new FileHandler();
        try {
            fh.writeToFile(file, text);
            System.out.println("Данные успешно записаны в файл " + file + ".");

            List<String> lines = fh.readFromFile(file);
            System.out.println("Прочитанные данные из файла " + file + ":");
            lines.forEach(System.out::println);
        } catch (CustomFileException exception) {
            System.out.println(exception.getMessage());
        }
    }
}