package android.app.admin;

public class PasswordPolicy {
    public static final int DEF_MINIMUM_LENGTH = 0;
    public static final int DEF_MINIMUM_LETTERS = 1;
    public static final int DEF_MINIMUM_UPPER_CASE = 0;
    public static final int DEF_MINIMUM_LOWER_CASE = 0;
    public static final int DEF_MINIMUM_NUMERIC = 1;
    public static final int DEF_MINIMUM_SYMBOLS = 1;
    public static final int DEF_MINIMUM_NON_LETTER = 0;
    public int quality;
    public int length;
    public int letters;
    public int upperCase;
    public int lowerCase;
    public int numeric;
    public int symbols;
    public int nonLetter;
    public PasswordPolicy() {}
    public android.app.admin.PasswordMetrics getMinMetrics() { return null; }
}
