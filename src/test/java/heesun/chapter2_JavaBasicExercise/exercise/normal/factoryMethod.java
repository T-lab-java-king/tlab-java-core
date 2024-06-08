package heesun.chapter2_JavaBasicExercise.exercise.normal;

import java.math.BigInteger;
import java.util.Random;

// 2024.06.08
public class factoryMethod {

    /**
     * 생성자 대신 정적 팩터리 메서드
     */

    // 장점 1 이름을 가질 수 있다. 반환될 객체의 특성을 쉽게 묘사할 수 있다.
    // 소수인 BigInteger 반환표시
    // 생성자
    Random rd = new Random();
    BigInteger test1 = new BigInteger(6,7, rd);
    // 정적 팩토리 메소드
    BigInteger test = BigInteger.probablePrime;

    //  2 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
    // Boolean.valueOf 메서드는 객체를 아예 생성하지 않는다.
    Boolean blTest = Boolean.valueOf("ture");

    //  3 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.
    //  4 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
    //  5 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
}
