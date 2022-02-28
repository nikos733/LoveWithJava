package HomeWork;

public class COURSE {
    BARRIER[] course = new BARRIER[3];
    public COURSE(BARRIER b1, BARRIER b2, BARRIER b3) {
        course[0] = b1;
        course[1] = b2;
        course[2] = b3;
    }

    public void doIt(TEAM t) {
        System.out.println("\nКоманда \"" + t.nameTeam + "\":\n");
        for (OBSTACLES com : t.getTeammates()) {
            for (BARRIER b: course) {
                b.doIt(com);
            }
        }
    }
}
