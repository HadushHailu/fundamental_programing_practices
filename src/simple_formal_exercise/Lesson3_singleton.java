package simple_formal_exercise;

public class Lesson3_singleton {

    private static Lesson3_singleton instance = null;

    private Lesson3_singleton(){
        System.out.println("Private constructor");
    }

    public static Lesson3_singleton getInstance(){
        if(instance == null){
            instance = new Lesson3_singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        //Lesson3_singleton lesson3Singleton = new Lesson3_singleton();
        //Lesson3_singleton lesson3Singleton1 = new Lesson3_singleton();
        Lesson3_singleton lesson3Singleton = new Lesson3_singleton();
        Lesson3_singleton lesson3Singleton1 = new Lesson3_singleton();
        //System.out.println(lesson3Singleton == lesson3Singleton1);
    }
}
