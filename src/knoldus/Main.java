package knoldus;

import java.util.Scanner;

public class Main {


    /**
     * @param args
     */
    public static void main(final String[] args) {
        ConcatinateString i = new ConcatinateString() {
            @Override
            public String check(final String s1, final String s2,
                                final String s3, final String s4,
                                final String s5, final String s6,
                                final String s7) {
                return null;
            }
        };

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Seven Strings in the Seven line");
        String str1 = in.next();
        String str2 = in.next();
        String str3 = in.next();
        String str4 = in.next();
        String str5 = in.next();
        String str6 = in.next();
        String str7 = in.next();
        ConcatinateString obj =  (String s1, String s2,
                                  String s3, String s4,
                                  String s5, String s6,
                                  String s7) -> (
                s1 + s2 + s3 + s4 + s5 + s6 + s7)
                .toUpperCase();

        System.out.println(obj.check(str1, str2, str3, str4, str5, str6, str7));
    }

}
