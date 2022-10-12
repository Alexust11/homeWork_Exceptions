public class Data {

    private static final String VALIDAT_CHARACTERS="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";

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
       if (!validete(login)) {
           throw new WrongLoginException(" Логин не валидный");
       }
       if (!validete(password)) {
           throw new WrongPasswordException(" Пароль не валидный");
       }
       if (!password.equals(confirmPassword)) {
           throw new WrongPasswordException("Пароли должны совпадать");
       }
   }

    private static boolean validete(String s) {
        if (s.length() > 20) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!VALIDAT_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
        }

}
