package jaesung.chapter2_JavaBasicExercise.exercise.hard.classes.ClassExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class 통장 {
    String 통장주인_이름;
    int 잔고;

    public 통장(String 통장주인_이름, int 잔고){
        this.통장주인_이름 = 통장주인_이름;
        this.잔고 = 잔고;
    }

    public void 출금하기(int 출금할_금액) {
        String fileName = "accountInfo";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("현재 금액: " + (this.잔고 - 출금할_금액));
            writer.flush(); // 버퍼의 내용을 파일에 쓰기
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        this.잔고 -= 출금할_금액;
    }
}
