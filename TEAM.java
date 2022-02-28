package HomeWork;

public class TEAM {

    String nameTeam ;

    OBSTACLES[] partner = new OBSTACLES[3];
    ROBOTS[] Robots = {new RPG24("Уорен"), new RPG25("Ронин")};
    public TEAM(String nameTeam, OBSTACLES com1, OBSTACLES com2, OBSTACLES com3 ) {
        this.nameTeam  = nameTeam;

        partner[0] = com1;
        partner[1] = com2;
        partner[2] = com3;
    }
      public void passedTheDistance() {
        for (OBSTACLES com : partner) {
            if (com.isOnDistance()) {
                com.info();
            }
        }
    }
    public void showResults() {
        for (OBSTACLES com : partner) {
            com.info();
        }
    }
    public OBSTACLES[] getTeammates() {
        return partner;
    }
}