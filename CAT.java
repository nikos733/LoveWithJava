package ANIMALITI;

public class CAT extends ANIMAL {
    public static String TYPECLASS = "Кошка";
    public static int COUNTCAT = 0;
    CAT(String name, float mxRun, float mxSwim) {
        super(TYPECLASS, name, mxRun, mxSwim);
        ++COUNTCAT;
    }
    @Override
    protected int SWIM(float distance) {
        return ANIMAL.SWIM_NONE;
    }
}
