package demo;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * http://docs.oracle.com/javase/tutorial/datetime/iso/enum.html
 * DayOfWeek and Month Enums:
 * 
 * The DayOfWeek enum consists of seven constants that describe the days of the
 * week: MONDAY through SUNDAY. The integer values of the DayOfWeek constants
 * range from 1 (Monday) through 7 (Sunday). Using the defined constants
 * (DayOfWeek.FRIDAY) makes your code more readable.
 * 
 * The Month enum includes constants for the twelve months, JANUARY through
 * DECEMBER. As with the DayOfWeek enum, the Month enum is strongly typed, and
 * the integer value of each constant corresponds to the ISO range from 1
 * (January) through 12 (December). Using the defined constants
 * (Month.SEPTEMBER) makes your code more readable.
 * 
 * 
 */
public class DateTime2 {

	public static void main(String[] args) {

		/*
		 * By using the getDisplayName(TextStyle, Locale) method, you can
		 * retrieve a string to identify the day of the week in the user's
		 * locale. The TextStyle enum enables you to specify what sort of string
		 * you want to display: FULL, NARROW (typically a single letter), or
		 * SHORT (an abbreviation). The STANDALONE TextStyle constants are used
		 * in some languages where the output is different when used as part of
		 * a date than when it is used by itself. The following example prints
		 * the three primary forms of the TextStyle for "Monday":
		 */
		DayOfWeek dow = DayOfWeek.MONDAY;
		Locale locale = Locale.getDefault();
		System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
		System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));

		/*
		 * DayOfWeek enum also provides a number of methods, similar to the
		 * methods provided by the temporal-based classes. For example, the
		 * following code adds 3 days to "Monday" and prints the result. The
		 * output is "THURSDAY":
		 */
		System.out.printf("%s%n", DayOfWeek.MONDAY.plus(3));
		
		
		/*
		 * The Month enum also includes a number of methods. The following line
		 * of code uses the maxLength method to print the maximum possible
		 * number of days in the month of February. The output is "29":
		 */
		System.out.printf("%d%n", Month.FEBRUARY.maxLength());
		
		
		/*
		 * The Month enum also implements the getDisplayName(TextStyle, Locale)
		 * method to retrieve a string to identify the month in the user's
		 * locale using the specified TextStyle. If a particular TextStyle is
		 * not defined, then a string representing the numeric value of the
		 * constant is returned. The following code prints the month of August
		 * using the three primary text styles:
		 */
		Month month = Month.AUGUST;
		Locale locale1 = Locale.getDefault();
		System.out.println(month.getDisplayName(TextStyle.FULL, locale1));
		System.out.println(month.getDisplayName(TextStyle.NARROW, locale1));
		System.out.println(month.getDisplayName(TextStyle.SHORT, locale1));
	}

}
