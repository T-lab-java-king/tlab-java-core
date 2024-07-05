package miyeon.chapter4_StandardIO;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class StandardIOEx2 {

    @DisplayName("표준입출력 테스트하고 싶다 ")
    @Test
    public void test1() {
        System.out.println("테스트");

        try {
            int input = 0;
            //테스트 진행을 intellij에서 어떻게 해야하는건지 모르겠다
            while ((input = System.in.read()) != -1) {
                System.out.println("input :" + input + ", (char)input :" + (char) input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
