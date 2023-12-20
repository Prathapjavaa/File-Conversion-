package proj_maven;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONTokener;

public class Json_to_csv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream = Json_to_csv.class.getClassLoader().getResourceAsStream("inputJson.json");
        JSONArray jsonArray = new JSONArray(new JSONTokener(inputStream));
        try {
            Files.write(Path.of("src/main/resources/output.csv"), CDL.toString(jsonArray).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
