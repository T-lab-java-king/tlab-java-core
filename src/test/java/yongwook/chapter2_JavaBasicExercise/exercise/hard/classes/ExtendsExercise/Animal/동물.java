package yongwook.chapter2_JavaBasicExercise.exercise.hard.classes.ExtendsExercise.Animal;

public class 동물 {
    public boolean 동물_클래스_생성자_호출됨;

    public 동물(){
        this.동물_클래스_생성자_호출됨 = true;
    }

    public String 먹다() {
        return "뭔가를 먹는다";
    }

    public String 잔다() {
        return "잠에 들었다.";
    }

    public String 똥을싼다() {
        return "뿌지직";
    }
}
