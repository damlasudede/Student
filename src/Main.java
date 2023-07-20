import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
  Teacher teacher = new Teacher("damla");
  Student student =new Student ("damlasu","dede",1,teacher);

  Gson gson = new Gson();

  String json = gson.toJson(student);

        try (FileWriter writer = new FileWriter(
                "C:/Users/ddede/Desktop/json/json.txt")) {
            gson.toJson(student, writer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}