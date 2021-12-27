package ANIMALITI;

public class DOG extends ANIMAL {
    public static String TYPECLASS = "Собака";
    public static int COUNTDOG = 0;
    DOG(String name, float mxRun, float mxSwim) {
        super(TYPECLASS , name, mxRun, mxSwim);
        ++COUNTDOG;
    }
}
