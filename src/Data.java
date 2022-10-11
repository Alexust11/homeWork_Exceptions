public class Data {
//    private String login;
//    private String password;
//    private String confirmPassword;

    public Data() {
    }

    public static boolean validate (String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }


    return true;
   }
   private static boolean check(String login, String password, String confirmPassword) {

   }

}
