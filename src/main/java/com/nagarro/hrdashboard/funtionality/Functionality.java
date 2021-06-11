package com.nagarro.hrdashboard.funtionality;

import java.util.regex.Pattern;

import com.nagarro.hrdashboard.constants.Constants;

/**
 * This is the Class to check various functionalities
 * 
 * @author varunrawat
 *
 */
public class Functionality {
	public static boolean emailValidate(final String email) {
		final Pattern pat = Pattern.compile(Constants.EMAIL_REGEX);
        return pat.matcher(email).matches();
	}
}
