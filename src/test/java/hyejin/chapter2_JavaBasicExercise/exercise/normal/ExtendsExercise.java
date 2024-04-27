package hyejin.chapter2_JavaBasicExercise.exercise.normal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExtendsExercise {

    @DisplayName("강아지라는 클래스에서 물을 마시는 행위를 정의하지 않았음에도 강아지는 물을 마실 수 있다.")
    @Test
    public void test1(){
        // given
        강아지 김똘똘 = new 강아지();

        // when
        김똘똘.물을_마시다();

        // TODO. 물을 마시고 난 강아지 김똘똘의 기분이 어떨지 맞춰보시오.
        String 예상되는_김똘똘의_기분 = "이곳에 정답을 쓰시고 test1() 좌측의 플레이 버튼을 누르세요.";
        Assertions.assertEquals(예상되는_김똘똘의_기분, 김똘똘.기분);
    }











    static class 동물 {
        String 기분 = "목마름";
        void 물을_마시다() {
            this.기분 = "시원하다";
            System.out.println("뭔가를 마셨다.");
        }
    }

    static class 강아지 extends 동물 {
        void 짖다() {
            System.out.println("뭔가를 보고 짖는다.");
        }
    }
}
