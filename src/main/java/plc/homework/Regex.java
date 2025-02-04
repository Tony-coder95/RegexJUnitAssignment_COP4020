package plc.homework;

import java.util.regex.Pattern;

/**
 * Contains {@link Pattern} constants, which are compiled regular expressions.
 * See the assignment page for resources on regexes as needed.
 */
public class Regex {

    public static final Pattern EMAIL = Pattern.compile("[A-Za-z0-9._-]+@[A-Za-z0-9-]+\\.[a-z]{2,3}");

    public static final Pattern ODD_STRINGS = Pattern.compile("^(?!\\d)(?:[\\w<]{1}|[\\w<]{3}|[\\w<]{5}|[\\w<]{7}|[\\w<]{9}|[\\w<]{11}|[\\w<]{13}|[\\w<]{15})$");

    public static final Pattern INTEGER_LIST = Pattern.compile("^\\[\\d+(,\\s*\\d+)*]$");  // List of integers in brackets

    public static final Pattern DECIMAL = Pattern.compile("^-?(0|[1-9]\\d*)\\.\\d+$");  // Valid decimals, optional sign

    public static final Pattern STRING = Pattern.compile("^\"(?:[^\"\\\\]|\\\\[btnr\"\\\\])*\"$");

}
