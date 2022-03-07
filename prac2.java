public class prac2 {
    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 44.5;

        double d = 2.1;
        double e = 0.55;
        double f = 5.9;

        System.out.println("eq1 : "+a+"x "+b+"y = "+c);
        System.out.println("eq2 : "+d+"x "+e+"y = "+f);

        System.out.println("value of x = "+((e*d-b*f)/(a*d-b*c)));
        System.out.println("value of y = "+((a*f-e*c)/(a*d-b*c)));

    }

}
