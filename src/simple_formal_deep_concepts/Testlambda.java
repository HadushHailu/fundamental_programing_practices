package simple_formal_deep_concepts;


@FunctionalInterface
interface MyCompare{
    public static final int val  = 10;
    public abstract int my(Object a, Object b);
    default int hasCodedd(Object a, Object b){
        return 2;
    }

    default int hasCodedddd(Object a, Object b){
        return 2;
    }

    default int hasCodeddd(Object a, Object b){
        return 2;
    }

}
interface Testlambda {

    public enum WEEKS{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY

    }
    public static void main(String[] args) {
        String s = "a";
        System.out.println(s.compareTo("b"));

        MyCompare lambda = (a, b) -> {
            int x = 8;
            return (int)a - (int)b;
        };

        System.out.println(lambda.hasCodedd(3,4));
;
        for(WEEKS weeks: WEEKS.values()){
            System.out.println(weeks.name() + " " +  weeks.ordinal());
        }

        System.out.println(WEEKS.MONDAY);
    }
}



