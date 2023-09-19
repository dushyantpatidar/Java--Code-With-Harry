import java.lang.annotation.Target;
import java.util.Scanner;

class strmethod {
    public static void main (String[] args){
        String name = "DushyantPatidar";

        int d = name.length();
        System.out.println(d);

        String b = name.toUpperCase();
        System.out.println(b);

        String c = name.toLowerCase();
        System.out.println(c);

        String ttrim = "        DushyantPatidar         ";
        System.out.println(ttrim);
        String trimedstr;
        System.out.println(ttrim.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(3,6));
        System.out.println(name.replace('r','p'));

        System.out.println(name.startsWith("Dus"));
        System.out.println(name.endsWith("end"));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("r"));
    }
};
