import javax.annotation.Resources;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadJsonFiles {

    private static String UAB_PROFILE = "/profiles";

    static List<String> profileList = new ArrayList<>();

    public static void main(String[] args) throws URISyntaxException, IOException {
        ReadJsonFiles readUABFiles = new ReadJsonFiles();
        profileList.add("IHG_Profile");
        profileList.add("MGM_Profile");
        for(String str :profileList){
            readUABFiles.readUAB(str);
        }

    }

    /**
     * Method to load the contents of a file
     * @param profileName -> Json Profile names
     * @return
     */
    public String readUAB(String profileName) throws URISyntaxException, IOException {

        String path = UAB_PROFILE + "/" + profileName + ".json";
        URL resource = this.getClass().getResource(path);
        String fileContent = new String(Files.readAllBytes(Paths.get(resource.toURI())));
        fileContent = fileContent.replace("\r", "").replaceAll("\\s+", "");
        int firstBraceIndex = fileContent.indexOf("{");
        fileContent = fileContent.substring(firstBraceIndex);
        System.out.println("File content :"+fileContent);
        return fileContent;
    }


}
