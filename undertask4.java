package Task2;

public class undertask4 {
    public static void main(String[] args) {
        //String myName = "Filip";
        String myName = "Filip";
        String otherName = "Elena";
        String lastName = "Yanchev";
        byte  myAge = 35;
        String myAge1= "\t35";
        String fullName = String.join(" ",myName,lastName);
        System.out.println(myName);
        System.out.println(myName.equals(otherName));
        System.out.println(myName.equalsIgnoreCase(otherName));
        System.out.println(myName.compareTo(otherName));
        System.out.println(fullName);
        System.out.println(myAge);
        System.out.println(myName.concat(" ").concat(lastName).concat(myAge1));
        System.out.println(otherName.concat(" ").concat(lastName).concat(myAge1));
    }
}
