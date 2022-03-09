package HW4.Nomer2;

public class MainNameClass {
    public static void main(String[] args){
        System.out.println("Create a Directory");
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        System.out.println("-----------------");

        System.out.println("Filling out the guide");
        phoneDirectory.add("Brown", "89823452134");
        phoneDirectory.add("Jonson", "89831236487");
        phoneDirectory.add("Brown", "89328749832");
        phoneDirectory.add("Golden", "89123457832");
        phoneDirectory.add("Brown", "89235643246");
        System.out.println("-----------------");

        System.out.println("Get a number");
        System.out.println("Brown");
        System.out.println(phoneDirectory.get("Brown"));
        System.out.println("Jonson");
        System.out.println(phoneDirectory.get("Jonson"));
        System.out.println("Golden");
        System.out.println(phoneDirectory.get("Golden"));
        System.out.println("-----------------");

        System.out.println("Missing entry");
        System.out.println("Faust");
        System.out.println(phoneDirectory.get("Faust"));
        System.out.println("-----------------");

        System.out.println("Recording an Existing Number");
        phoneDirectory.add("Brown", "89823452134");
        System.out.println("Brown");
        System.out.println(phoneDirectory.get("Brown"));
    }
}
