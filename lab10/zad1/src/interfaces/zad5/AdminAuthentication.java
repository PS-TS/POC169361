package interfaces.zad5;

public class AdminAuthentication {
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
