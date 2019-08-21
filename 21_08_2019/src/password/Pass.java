package password;

public class Pass {
private static String pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
public static boolean checkPassword(String password)
{
	if(password.matches(pattern))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
