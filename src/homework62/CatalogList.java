package homework62;

import java.io.File;
import java.util.ArrayList;

public class CatalogList {
    public static void main(String[] args) {
        CatalogService catalogService = new CatalogService();
        File output = new File("c:\\Users\\79191\\Desktop\\Folder");
        System.out.println(catalogService.createFilesList(output));

    }
}
