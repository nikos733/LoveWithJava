package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static Random RANDOM = new Random();
    public static Scanner SCANNER = new Scanner(System.in);
    //BATTLEFIELD
    public static int SizeMIN =  5;
    public static int SizeMAX = 5;
    public static int LENGTH;
    public static int HEIGHT;
    public static char[][] BATTLEFIELD;
    public static char [][] IM;
    public static char CLEANED = '♜';
    public static char DONE = '♛';
    public static int LC = 0;
    //FIGHTER
    public static final int UP = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;
    public static final int DOWN = 4;
    public static char FIGHTER = '♞';
    public static String NAME = "БЕЗУМНЫЙ МАКС";
    public static int HEALTH = 150;
    public static int FX;
    public static int FY;
    public static int EXP;
    //BOMB
    public static int ValueMIN = 5;
    public static int ValueMAX = 10;
    public static char  BOMB = '☠';
    public static int ATTACK;
    public static int COUNT;

    public static void main(String[] args) {
        while (FIGHTERSURVIVAL()) {
            ++LC;
            System.out.println("УРОВЕНЬ " + LC);
            LEVEL();
        }
        System.out.println("ПОТРАЧЕНО " + NAME + " ГОТОВ " + LC + " УРОВЕНЬ");
    }
    public static void LEVEL() {
        BATTLEFIELD();
        FIGHTER();
        BOMBS();
        while (true) {
            SHADOWOFWAR();
            BOUNCE();
            if (!FIGHTERSURVIVAL()) {
                System.out.println(NAME + " ПОТРАЧЕНО");
                break;
            }
            if (!NUMBERBOMBS()) {
                System.out.println(NAME + " ЗАВЕРШИЛ УРОВЕНЬ" + LC);
                EXP += 250;
                break;
            }
        }
    }
    public static void BATTLEFIELD() {
        LENGTH = MEANING(SizeMIN, SizeMAX);
        HEIGHT = MEANING(SizeMIN, SizeMAX);
        BATTLEFIELD = new char[HEIGHT][LENGTH];
        IM = new char[HEIGHT][LENGTH];
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < LENGTH; x++) {
                BATTLEFIELD[y][x] = CLEANED;
                IM[y][x] = CLEANED;
            }
        }
        System.out.println("ПОЛЕ БОЯ СОЗДАНО - РАЗМЕР ПОЛЯ " + LENGTH + "X" + HEIGHT);
    }
    public static void SHADOWOFWAR() {
        System.out.println("✪ ПОЛЕ БОЯ ✪ ");
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < LENGTH; x++) {
                System.out.print(BATTLEFIELD[y][x] + "│");
            }
            System.out.println();
        }
        System.out.println("斯 坦 尼 斯 会");
    }
    public static void FIGHTER() {
        FX = MEANING(0, LENGTH - 1);
        FY = MEANING(0, HEIGHT - 1);
        BATTLEFIELD[FY][FX] = FIGHTER;
        System.out.println(NAME + " ВОЗРОДИЛСЯ В ТОЧКЕ [" + (FX + 1) + ":" + (FY + 1) + "]");
    }
    public static void BOMBS() {
        ATTACK = MEANING(ValueMIN, ValueMAX);
        COUNT = (LENGTH + HEIGHT) / 2;
        int bombX;
        int bombY;
        for (int i = 1; i <= COUNT; i++) {
            do {
                bombX = RANDOM.nextInt(LENGTH);
                bombY = RANDOM.nextInt(HEIGHT);
            } while (!FINAL(BATTLEFIELD, bombX, bombY) || !FINAL(IM, bombX, bombY));
            IM[bombY][bombX] = BOMB;
        }
        System.out.println(COUNT + " БОМБ БЫЛО СОЗДАНО - УРОН = " + ATTACK);
    }
    public static void BOUNCE() {
        int FighterX = FX;
        int FighterY = FY;
        int FighterLocation;
        do {
            System.out.print("│ ТВОЙ ХОД: │ ВВЕРХ: " + UP + " │ НАЛЕВО: " + LEFT + " │ НАПРАВО: " + RIGHT + " │ ВНИЗ: " + DOWN + " │ -> ");
            FighterLocation = SCANNER.nextInt();
            switch (FighterLocation) {
                case UP:
                    FY -= 1;
                    break;
                case DOWN:
                    FY += 1;
                    break;
                case LEFT:
                    FX -= 1;
                    break;
                case RIGHT:
                    FX += 1;
                    break;
            }
        } while (!MOVE(FighterX, FighterY, FX, FY));
        FIGHTERMOVED(FighterX, FighterY, FX, FY);
    }
    public static boolean MOVE(int pastX, int pastY, int nextX, int nextY) {
        if (nextX >= 0 && nextX < LENGTH && nextY >= 0 && nextY < HEIGHT) {
            System.out.println(NAME + " СДЕЛАЛ ХОД НА [" + (nextX + 1) + ":" + (nextY + 1) + "] УСПЕШНО.");
            return true;
        } else {
            System.out.println(NAME + " СОВЕРШИЛ НЕВЕРНЫЙ ХОД! ПОВТОРИ ХОД.");
            FX = pastX;
            FY = pastY;
            return false;
        }
    }
    public static void FIGHTERMOVED(int pastX, int pastY, int nextX, int nextY) {
        if (IM[nextY][nextX] == BOMB) {
            HEALTH -= ATTACK;
            COUNT--;
            System.out.println(NAME + " ПОДОРВАЛСЯ НА БОМБЕ. ЗДОРОВЬЕ = " + HEALTH);
            System.out.println("ОСТАЛОСЬ БОМБ: " + COUNT);
        }
        BATTLEFIELD[nextY][nextX] = FIGHTER;
        BATTLEFIELD[pastY][pastX] = DONE;
    }
    public static int MEANING(int min, int max) {
        return min + RANDOM.nextInt(max - min + 1);
    }
    public static boolean FINAL(char[][] inputMap, int x, int y) {
        return inputMap[y][x] == CLEANED;
    }
    public static boolean NUMBERBOMBS() {
        return COUNT > 0;
    }
    public static boolean FIGHTERSURVIVAL() {
        return HEALTH > 0;
    }
}
