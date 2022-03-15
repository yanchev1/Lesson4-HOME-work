package Task2;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class undertask7 {
    public static void main(String[] args) {
        String firstName = "Filip";
         String lastName = "Yanchev";
         String myAge = "\n35";
         String myAge1= "\t35";
         String fullName = String.join(" ",firstName,lastName,myAge);

        System.out.println(fullName);

        System.out.println(firstName.concat(" ").concat(lastName).concat(myAge1));

    }
}
