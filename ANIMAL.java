package ANIMALITI;

public class ANIMAL {
    static final int SWIM_OK = 1;
    static final int SWIM_FAIL = 0;
    static final int SWIM_NONE = -1;
    protected String NAME;
    private String TYPE;
    private float MXRUN;
    private float MXSWIM;
    public static int COUNTANIMAL = 0;

    ANIMAL(String type, String name, float mxRun, float mxSwim) {
        this.TYPE = type;
        this.NAME = name;
        this.MXRUN = mxRun;
        this.MXSWIM = mxSwim;
        ++COUNTANIMAL;
    }
    String UNAME() {
        return this.NAME;
    }
    String UTYPE() {
        return this.TYPE;
    }
    float UMAXRUN() {
        return this.MXRUN;
    }
    float UMAXSWIM() {
        return this.MXSWIM;
    }
    protected boolean RUN(float distance) {
        return (distance <= MXRUN);
    }
    protected int SWIM(float distance) {
        return (distance <= MXSWIM) ? SWIM_OK : SWIM_FAIL;
    }
}
