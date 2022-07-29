package string;

public class PasswordValidationUserMainCode {
	static int validatePassword(String pwd)
	{
		if(pwd.matches(".*[0-9]{1,}.*") && pwd.matches(".*[@#$]{1,}.*")&&pwd.matches(".*[A-Z]{1,}.*") )
		return 1;
	else
		return -1;
	}

}

