public class Data {

    private static String VALIDAT_CHARACTERS="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";

    public Data() {
    }

    public static boolean validate (String login, String password, String confirmPassword) {
      try { check(login,password,confirmPassword);

      } catch (WrongPasswordException|WrongLoginException e) {
          System.out.println(e.getMessage());
          return false;
      }
        return true;
   }
   private static void check(String login, String password, String confirmPassword)
    throws WrongLoginException, WrongPasswordException{

   }

}
