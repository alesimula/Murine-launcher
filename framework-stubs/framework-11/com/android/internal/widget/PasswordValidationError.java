package com.android.internal.widget;

public class PasswordValidationError {
    public static final int WEAK_CREDENTIAL_TYPE = 1;
    public static final int CONTAINS_INVALID_CHARACTERS = 2;
    public static final int TOO_SHORT = 3;
    public static final int TOO_LONG = 4;
    public static final int CONTAINS_SEQUENCE = 5;
    public static final int NOT_ENOUGH_LETTERS = 6;
    public static final int NOT_ENOUGH_UPPER_CASE = 7;
    public static final int NOT_ENOUGH_LOWER_CASE = 8;
    public static final int NOT_ENOUGH_DIGITS = 9;
    public static final int NOT_ENOUGH_SYMBOLS = 10;
    public static final int NOT_ENOUGH_NON_LETTER = 11;
    public static final int NOT_ENOUGH_NON_DIGITS = 12;
    public static final int RECENTLY_USED = 13;
    public final int errorCode = 0;
    public final int requirement = 0;
    public PasswordValidationError(int p0) {}
    public PasswordValidationError(int p0, int p1) {}
    public java.lang.String toString() { return null; }
    private static java.lang.String errorCodeToString(int p0) { return null; }
}
