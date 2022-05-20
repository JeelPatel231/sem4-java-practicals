public class prac13 {
    public static void main(String[] args) {

        String sanitisedString = new String();

        for (int i = 0; i < args.length; i++){
            sanitisedString += args[i];
        }

        if(sanitisedString.length() < 3){
            System.out.println("Malformed Expression, exiting!");
            return;
        }

        System.out.print(sanitisedString+" = ");

        int oper1 = sanitisedString.charAt(0) - '0';
        int oper2 = sanitisedString.charAt(2) - '0';
        int operator = sanitisedString.charAt(1);

        switch(operator){
            case('+'):
                System.out.println(oper1+oper2);
                break;
            case('-'):
                System.out.println(oper1-oper2);
                break;
            case('*'):
                System.out.println(oper1 * oper2);
                break;
            case('/'):
                System.out.println((float)oper1/oper2);
                break;
            default:
                System.out.println("Malformed expression, exiting");
                return;
        }

    }
}
