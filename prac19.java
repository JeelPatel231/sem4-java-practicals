class CustomException extends Exception{
    public CustomException(String e){
        super(e);
    }
}
public class prac19 {
    public static void main(String[] args) throws CustomException {
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i]) < 0){
                throw new CustomException("negative number in command line arguments");
            }
        }
    }
}
