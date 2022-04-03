import java.security.PublicKey;

public class Associativity {
    public static void main(String[] args){
        int a =2+3*20/10;
        /*
        =2+60/10
        =2+6
        =8
        Precedence  * > / > +
         */
        int b = 60/5-34*2;
        /*
        in this case associativity
        / and *
        left to right
        =12-34*2
        =12-68
        =-56
         */
        System.out.println(a);
        System.out.println(b);
    }
}
