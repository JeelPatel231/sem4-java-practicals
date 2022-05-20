abstract class Operations{
    abstract float addition(float a, float b);

    float subtraction(float a, float b){
        return a - b;
    }

}

class ImplementedMethod extends Operations{
    @Override
    float addition(float a, float b) {
        return a + b;
    }

}

public class prac17 {
    public static void main(String[] args) {
        ImplementedMethod k = new ImplementedMethod();
        System.out.println( k.addition(8, 9) );
        System.out.println( k.subtraction(4, 9) );
    }
}
