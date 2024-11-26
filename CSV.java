import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV {
    public static void readCsvFile(String path, String separator) {
        try {
            FileReader csvFile = new FileReader(path);
            BufferedReader br = new BufferedReader(csvFile);
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(separator);
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            readCsvFile(args[0], ",");
        } else {
            System.out.println("Veuillez fournir le chemin du fichier CSV en argument.");
        }
    }
}
