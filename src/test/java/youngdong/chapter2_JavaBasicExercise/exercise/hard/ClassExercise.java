package youngdong.chapter2_JavaBasicExercise.exercise.hard;

import chanhyeok.chapter2_JavaBasicExercise.exercise.hard.classes.ClassExercise.거래장부;
import chanhyeok.chapter2_JavaBasicExercise.exercise.hard.classes.ClassExercise.통장;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassExercise {

    @DisplayName("클래스가 없는 구조의 경우 전체적인 맥락을 파악하는데 시간이 소요된다.")
    @Test
    public void test1(){
        String 통장_주인_이름 = "최찬혁";
        int 현재_금액 = 2100000000;
        int 출금_금액 = 3000;

        String fileName = "accountInfo";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("현재 금액: " + 현재_금액 + 출금_금액);
            writer.flush();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        fileName = "transactionLog";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("출금정보: 3000");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    @DisplayName("클래스가 있는 경우 전체적인 맥락 파악이 용이하다. 개발자는 내가 추가하거나 수정해야 할 기능만 빠르게 파악할 수 있게 된다.")
    @Test
    public void test2(){
        통장 찬혁_통장 = new 통장("최찬혁", 2100000000);
        거래장부 기록을_위한_거래_장부 = new 거래장부();

        찬혁_통장.출금하기(3000);
        기록을_위한_거래_장부.거래기록_작성();
    }

    /**
     * TODO. 클래스를 사용했을 때의 장단점을 아래 작성해주세요
     * :
     */
}
