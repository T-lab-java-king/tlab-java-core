package heesun.chapter2_JavaBasicExercise.exercise.hard;

import chanhyeok.chapter2_JavaBasicExercise.exercise.hard.classes.ExtendsExercise.Animal.강아지;
import chanhyeok.chapter2_JavaBasicExercise.exercise.hard.classes.ExtendsExercise.Animal.고양이;
import chanhyeok.chapter2_JavaBasicExercise.exercise.hard.classes.ExtendsExercise.가스차;
import chanhyeok.chapter2_JavaBasicExercise.exercise.hard.classes.ExtendsExercise.전기차;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExtendsExercise {


    @DisplayName("전기차와 가스차는 운전하기라는 기능을 중복으로 가지고 있다. 상속을 이용해 중복을 없애시오.")
    @Test
    public void test1(){
        전기차 창식이의_테슬라= new 전기차();
        가스차 민수의_가스차 = new 가스차();

        창식이의_테슬라.운전하기();
        민수의_가스차.운전하기();
    }


    @DisplayName("고양이를 생성했는데 동물의 생성자가 호출된 이유를 설명하시오.")
    @Test
    public void test2(){
        고양이 고양이 = new 고양이();
        Assertions.assertTrue(고양이.동물_클래스_생성자_호출됨);

        // TODO 1. 위 테스트 코드에서 동물 클래스의 생성자 호출 여부가 참인 이유를 설명하시오
        // :
    }

    @DisplayName("강아지가 '먹다' 라는 행위를 할 때 '아그작 아그작 먹는다'라는 값이 내려 오도록 변경 하시오")
    @Test
    public void test3(){
        String 강아지가_먹을때_내줬으면_하는_소리 = "아그작 아그작 먹는다.";
        강아지 강아지 = new 강아지();

        String 강아지가_실제로_낸_소리 = 강아지.먹다();
        // Assertions.assertEquals(강아지가_먹을때_내줬으면_하는_소리, 강아지가_실제로_낸_소리); // TODO. 문제 풀이시 주석 제거
    }


    @DisplayName("추상클래스 사용해보기")
    @Test
    public void test4(){
        //TODO 1. 추상클래스와 그 추상 클래스를 상속받는 클래스를 만들고 해당 메서드에서 호출하시오
    }

}
