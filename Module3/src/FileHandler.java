import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHandler {

    public void writeToFile(String file, String data) throws CustomFileException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
            System.out.println("Данные успешно записаны в файл " + file);
        } catch (IOException exception) {
            throw new CustomFileException("Ошибка при записи в файл " + file + ": "
                    + exception.getMessage());
        }
    }

    public List<String> readFromFile(String file) throws CustomFileException {
        try (Stream<String> lines = Files.lines(Paths.get(file))) {
            return lines.collect(Collectors.toList());
        } catch (IOException exception) {
            throw new CustomFileException("Ошибка при чтении из файла " + file + ": "
                    + exception.getMessage());
        }
    }
}