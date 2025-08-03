import Task2_1.CustomArrayList;
import Task2_1.CustomHashSet;
import Task2_2.Book;
import Task2_2.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        customArrayList.add(1);
        System.out.println(customArrayList);
        System.out.println(customArrayList.get(0));
        customArrayList.remove(2);
        System.out.println(customArrayList);
        customArrayList.addAll(new Object[]{4, 5, 6});
        System.out.println(customArrayList);

        System.out.println("--------------------------");

        CustomHashSet<String> hashSet = new CustomHashSet<>();
        hashSet.add("Aston");
        hashSet.add("Java");
        hashSet.add("Course");
        System.out.println("Размер: " + hashSet.size());
        hashSet.remove("Aston");
        System.out.println("Размер: " + hashSet.size());

        System.out.println("--------------------------");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Пётр", Arrays.asList(
                new Book("Книга1", 380, 2002),
                new Book("Книга2", 600, 2005),
                new Book("Книга3", 700, 2006),
                new Book("Книга4", 806, 2007),
                new Book("Книга5", 1300, 2011)
        )));

        students.add(new Student("Маша", Arrays.asList(
                new Book("Книга6", 300, 2002),
                new Book("Книга7", 400, 2003),
                new Book("Книга8", 500, 2004),
                new Book("Книга9", 1000, 1998),
                new Book("Книга10", 1100, 2009)
        )));

        students.add(new Student("Саша", Arrays.asList(
                new Book("Книга11", 300, 2002),
                new Book("Книга12", 250, 1997),
                new Book("Книга13", 500, 2004),
                new Book("Книга14", 660, 2008),
                new Book("Книга15", 700, 2006)
        )));

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Такая книга отсутствует"));
    }
}
