package Assignment;

public class Main {

    public static void main(String[] args) {


        Interface i=new Interface() {
            @Override
            public String check(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
                return null;
            }
        };

        Interface obj =  (String s1, String s2, String s3, String s4, String s5, String s6, String s7) -> (s1+" "+s2+" "+s3+" "+" "+s4+" "+s5+" "+s6+" "+s7).toUpperCase();
       System.out.println( obj.check("the","lambda","has","to","many","system","arguments"));
    }

}
