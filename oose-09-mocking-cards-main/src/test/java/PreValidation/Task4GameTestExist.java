package PreValidation;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class Task4GameTestExist{
  final String file_name = "src/test/java/game/GameTest.java";
  File file = new File(file_name);
  JavaFile javaFile = new JavaFile(file);

  @Test
  void fileExists() {
    assertTrue(file.isFile());
  }

}