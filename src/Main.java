import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Person.fromCsv("family.csv");
        System.out.println(people.get(2).generateUML());
//        for(Person person: people)
//            System.out.println(person);

//        try {
//            Person.toBinaryFile(people, "family.bin");
//            List<Person> loadPeople = Person.fromBinaryFile("family.bin");
//            for(Person person: loadPeople)
//                System.out.println(person);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
        PlantUMLRunner.setPath("plantuml-1.2024.4.jar");
        String uml = people.get(2).generateUML();
        PlantUMLRunner.generateDiagram(uml, "./", "Nowy");


    }
}