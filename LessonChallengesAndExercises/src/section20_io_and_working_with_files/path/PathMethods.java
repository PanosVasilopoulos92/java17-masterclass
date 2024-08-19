package section20_io_and_working_with_files.path;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;

public class PathMethods {

    public static void main(String[] args) {
        Path path = Path.of("files/file.txt");
        System.out.println(path);
        boolean pathExists = Files.exists(path);
        System.out.println(pathExists);
        System.out.println("-".repeat(12).concat("" + "\n"));

        printPathInfo(path);
        System.out.println("-".repeat(12).concat("" + "\n"));
//        String dateTime = String.format("%1$tD %1$tT", LocalDateTime.now());
        String pathStr = "C:\\Users\\viato\\Desktop\\Udemy Courses\\Java\\Java 17 Masterclass\\LessonChallengesAndExercises\\";
        createFile("testFile", "Hi! My name is Panos. Just checking... WrittenAt: "
                .concat(String.format("%1$tD %1$tT", LocalDateTime.now()))
                .concat("\n"));


    }

    public static void printPathInfo(Path path) {
        System.out.println("Path: " + path);
        System.out.println("filename: " + path.getFileName());
        System.out.println("parent: " + path.getParent());
        System.out.println("Absolute path: " + path.toAbsolutePath());
        System.out.println("root: " + path.getRoot());
        System.out.println("Is path absolute: " + path.isAbsolute());
    }

    private static void createFile(String filename, String msg) {
        try {
            Path path = Paths.get(filename);
            Files.writeString(path, msg, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("File created and written successfully in path: " + path.toAbsolutePath());
        } catch (InvalidPathException | IOException e) {
            System.out.println("An error occurred while creating or writing to the file.");
            e.printStackTrace();
        }

    }
}
