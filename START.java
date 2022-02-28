package HomeWork;

public class START {

    public static void main(String[] args) {
        COURSE c = new COURSE(new CROSS(80), new WATER(3), new WALL(5));
        TEAM team = new TEAM("Стражи Галактики", new MAN("Звездный Лорд"), new RPG24("Уорен"), new RPG25("Ронин"));
         c.doIt(team);

            System.out.println("\nПобедители:");
            team.passedTheDistance();

            System.out.println("\nРезультат:");
            team.showResults();
        }
    }

