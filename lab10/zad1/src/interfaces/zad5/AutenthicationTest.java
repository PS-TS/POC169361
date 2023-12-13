package interfaces.zad5;

public class AutenthicationTest {
    public static void main(String[] arg) {
        UserAuthentication ua = new UserAuthentication();
        AdminAuthentication aa = new AdminAuthentication();
        System.out.println(ua.login("Aa", "Bb"));
        System.out.println(aa.login("Cc", "Dd"));
        ua.logout();
        aa.logout();
        System.out.println(ua.resetPassword("Aa","Bb","Xx"));
        System.out.println(ua.resetPassword("Cc","Dd","Yy"));
    }
}
