package Task2;

public class undertask8 {
    public static void  main(String[] args) {
        String firstName = "Elena";
        String lastName = "Yancheva";
        String myAge = "\n35";
        String myAge1= "\t35";
        String fullName = String.join(" ",firstName,lastName,myAge);

        System.out.println(fullName);

        System.out.println(firstName.concat(" ").concat(lastName).concat(myAge1));

    }
}
