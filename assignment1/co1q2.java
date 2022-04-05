class co1q2{
    public static void main(String[] args) {
        int oper1 = Integer.parseInt(args[0]);
        int oper2 = Integer.parseInt(args[2]);
        char operation = args[1].charAt(0);
        switch (operation){
            case '+':
                System.out.println(oper1 + oper2);
                break;
            case '-':
                System.out.println(oper1 - oper2);
                break;
            case '*':
                System.out.println(oper1 * oper2);
                break;
            case '/':
                System.out.println((double)oper1 / oper2);
                break;
        }
    }
}   