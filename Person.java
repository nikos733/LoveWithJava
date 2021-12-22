package HomeWork;

public class Person {
    //Test1
    private static final int YEAR = 2021;
    private String SURNAME;
    private String NAME;
    private String SECONDNAME;
    private String POSITION;
    private String EMAIL;
    private String PHONE;
    private int SALARY;
    private int YEARBIRTH;
    //Test2
    public Person(String SURNAME, String NAME, String SECONDNAME, String POSITION, String EMAIL, String PHONE, int SALARY, int YEARBIRTH) {
        this.SURNAME = SURNAME;
        this.NAME = NAME;
        this.SECONDNAME = SECONDNAME;
        this.POSITION = POSITION;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.SALARY = SALARY;
        this.YEARBIRTH = YEARBIRTH;
    }
    //Test3
    int AGE() {
        return YEAR - YEARBIRTH;
    }
    int SALARY() {
        return SALARY;
    }
    String ABOUTGROUP() {
        return this.SURNAME + " " + this.NAME + " " + this.SECONDNAME + ", должность: " + this.POSITION + ", email: " + this.EMAIL + ", телефон: " + this.PHONE + ", зарпалата: " + this.SALARY() + " EUR, возраст: " + this.AGE() + " лет/года.";
    }
}
