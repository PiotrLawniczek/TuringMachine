package p.lodz;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by elawpio on 2017-12-19.
 */
public class Utils {

    public List<String> fileContentToList() {
        List<String> fileContent = Arrays.asList(getFileContents().split("#"));

        List<String> symbols = new ArrayList();
        for (int i = 0; i < fileContent.size(); i++) {
            symbols = Arrays.asList(fileContent.get(i).split(""));
        }
        return symbols;
    }

    public  String getFileContents() {
        File file = new File("file.txt");
        String fileContents = "";
        try {
            fileContents = FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContents;
    }

}
