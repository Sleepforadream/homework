package homework62;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class CatalogService {

    ArrayList<String> arrayFiles = new ArrayList<>();

    ArrayList<String> createFilesList(File baseDirectory) {
        if (baseDirectory.isDirectory()){
            for (File file : Objects.requireNonNull(baseDirectory.listFiles())){
                if(file.isFile()) {
                    arrayFiles.add(file.getName());
                }
                else {
                    createFilesList(file);
                }
            }
        }
        return arrayFiles;
    }
}


