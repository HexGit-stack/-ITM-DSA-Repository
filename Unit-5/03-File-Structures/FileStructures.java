import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.TreeMap;

public class FileStructures {

    static final String FILE_NAME = "records.txt";

    static void createFile() throws IOException {
        String[] records = {
            "101 Anish",
            "102 Rahul",
            "103 Priya"
        };

        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "rw")) {
            file.setLength(0);

            for (String record : records) {
                file.writeUTF(record);
            }
        }
    }

    static void sequentialAccess() throws IOException {
        System.out.println("Sequential File:");

        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "r")) {
            while (file.getFilePointer() < file.length()) {
                System.out.println(file.readUTF());
            }
        }
    }

    static void randomAccess() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "r")) {
            file.seek(2L * 12);

            System.out.println("\nRandom Access:");
            System.out.println("Record at position 2:");
            System.out.println(file.readUTF());
        }
    }

    static void indexedSearch() throws IOException {
        TreeMap<Integer, String> index = new TreeMap<>();

        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "r")) {
            while (file.getFilePointer() < file.length()) {
                long position = file.getFilePointer();
                String record = file.readUTF();
                int id = Integer.parseInt(record.split(" ")[0]);

                index.put(id, record);
            }
        }

        System.out.println("\nIndexed Sequential Search:");

        String result = index.get(103);

        if (result != null) {
            System.out.println("Record found: " + result);
        } else {
            System.out.println("Record not found");
        }
    }

    public static void main(String[] args) {
        try {
            createFile();
            sequentialAccess();
            randomAccess();
            indexedSearch();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
