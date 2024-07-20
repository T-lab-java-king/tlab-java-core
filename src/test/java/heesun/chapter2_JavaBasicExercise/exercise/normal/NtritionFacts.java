package heesun.chapter2_JavaBasicExercise.exercise.normal;
// 점층적 생성자 패턴의 안정성과 자바빈즈패턴의 가독성을 겸비한 빌더패턴
// 필수 매개변수만으로 생성자를 호출해 빌더 객체를 얻는다. 그런 다음 빌더 객체가 제공하는 일종의 세터 메서드들로 원하는 선택
// 매개변수들을 설정한다. 마지막으로 매개변수가 없는 build메서드를 호출해 객체를 얻는다.
public class NtritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        //필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public Builder sodium(int val){
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }

        public NtritionFacts build(){
            return new NtritionFacts(this);
        }

    }

    private NtritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;

    }

    public static void main(String[] args) {
        NtritionFacts cocaColr = new Builder(240,8)
                .calories(100).sodium(35).carbohydrate(27).build();
    }
}
