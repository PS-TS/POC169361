package interfaces.zad5;

public class UserAuthentication implements Authentication {

    public boolean login(String username, String password)
    {
        return true;
    };
    public void logout()
    {
    };
    public boolean resetPassword(String username, String oldPassword, String newPassword)
    {
        return true;
    };
}
