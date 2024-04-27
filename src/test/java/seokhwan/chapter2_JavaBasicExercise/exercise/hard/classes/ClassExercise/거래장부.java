package seokhwan.chapter2_JavaBasicExercise.exercise.hard.classes.ClassExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class 거래장부 {

    public void 거래기록_작성(){
        // 현재 클래스의 디렉토리 경로를 이용하여 파일 경로 설정
        String fileName = "transactionLog";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // 파일에 문자열 쓰기
            writer.write("출금정보: 3000");
            writer.newLine(); // 줄바꿈 추가
            writer.flush(); // 버퍼의 내용을 파일에 쓰기
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
