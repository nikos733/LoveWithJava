package ANIMALITI;

public class HomeWork6 {
    public static void main(String[] args) {
        String RACE;
        String EFFECT;
        DOG dog1 = new DOG("Жорик", 2, 580);
        DOG dog2 = new DOG("СкубиДу", 5, 390);
        CAT cat1 = new CAT("Милка", 3, 350);
        CAT cat2 = new CAT("Филиция", 6, 480);
        float runDistance = 300;
        float swimDistance = 10;
        ANIMAL[] party = {dog1, dog2, cat1, cat2};
        String VICTORY = "- победа.";
        String LOSING = "- поражение.";
        for (int i = 0; i < party.length; i++) {
            String nameString = party[i].UTYPE() + " " + party[i].UNAME();
            RACE = " пробежит " + party[i].UMAXRUN() + " м. Забег ";
            EFFECT = party[i].RUN(runDistance) ? VICTORY : LOSING ;
            TOTAL(nameString, RACE, runDistance, EFFECT);
            int swimResult =  party[i].SWIM(swimDistance);
            RACE = " проплывет " + party[i].UMAXSWIM() + " м. Заплыв ";
            EFFECT = (swimResult == ANIMAL.SWIM_OK) ? VICTORY : LOSING;
            if (swimResult == ANIMAL.SWIM_NONE)
                EFFECT = "- поражение, не умеет плавать.";
            TOTAL(nameString, RACE, swimDistance, EFFECT);
        }
        System.out.println("Животные: " + ANIMAL.COUNTANIMAL + " | Результат кошек: " + CAT.COUNTCAT + " | Результат собак: " + DOG.COUNTDOG);
    }
    private static void TOTAL(String animal, String match, float matchDistance, String resultMatch) {
        System.out.println(animal + match + matchDistance + " м " + resultMatch);
    }
}
