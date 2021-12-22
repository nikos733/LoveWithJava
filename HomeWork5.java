package HomeWork;

public class HomeWork5 {
    public static void main(String[] args) {
        Person mainEmployee = new Person("Линдеманн", "Тилль", "Вернер", "вокалист", "tilllindemann@du.hast", "49(214)432-54-21", 50000, 1963);
        Person[] group = {
                mainEmployee,
                new Person("Круспе", "Рихард", "Цвен", "гитарист", "rihardZK@du.hast", "49(214)543-78-65", 496000, 1967),
                new Person("Ландерс", "Пауль", "Антонович", "ритм-гитарист", "paulLA@du.hast", "49(214)009-67-22", 49000, 1964),
                new Person("Шнайдер", "Кристоф", "Мартин", "барабанщик", "SchneiderKM@du.hast", "49(214)799-00-07", 48700, 1966),
                new Person("Лоренц", "Кристиан", "Флаке", "клавишник", "FlakeLorenz@du.hast", "49(214)876-69-69", 49500, 1966),
                new Person("Ридель", "Оливер", "Шпиц", "бас-гитарист", "OliverRiedel@du.hast", "49(214)223-43-42", 47000, 1971),
        };
        ALLOLDMAN(group);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        OLDMAN(group, 50);
    }
    private static void OLDMAN(Person[] group, int year) {
        for (int i = 0; i < group.length; i++)
            if (group[i].AGE() > year) {
                System.out.println(group[i].ABOUTGROUP());
            }
    }
    private static void ALLOLDMAN(Person[] group) {
        System.out.println("Состав группы: ");
        for (int i = 0; i < group.length; i++)
            System.out.println((i + 1) + " " + group[i].ABOUTGROUP());
    }

}
