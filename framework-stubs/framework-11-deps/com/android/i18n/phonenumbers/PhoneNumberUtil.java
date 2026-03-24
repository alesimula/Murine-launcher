package com.android.i18n.phonenumbers;

public class PhoneNumberUtil {
    public PhoneNumberUtil() {}
    public com.android.i18n.phonenumbers.PhoneNumberUtil getInstance() { return null; }
    public com.android.i18n.phonenumbers.Phonenumber.PhoneNumber parse(java.lang.CharSequence p0, java.lang.String p1) { return null; }
    public com.android.i18n.phonenumbers.AsYouTypeFormatter getAsYouTypeFormatter(java.lang.String p0) { return null; }
    public boolean isValidNumber(com.android.i18n.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public java.lang.String format(com.android.i18n.phonenumbers.Phonenumber.PhoneNumber p0, com.android.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat p1) { return null; }
    public com.android.i18n.phonenumbers.Phonenumber.PhoneNumber parseAndKeepRawInput(java.lang.CharSequence p0, java.lang.String p1) { return null; }
    public int getCountryCodeForRegion(java.lang.String p0) { return 0; }
    public java.lang.String formatInOriginalFormat(com.android.i18n.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return null; }
    public java.lang.String getRegionCodeForNumber(com.android.i18n.phonenumbers.Phonenumber.PhoneNumber p0) { return null; }
    public java.lang.Iterable findNumbers(java.lang.CharSequence p0, java.lang.String p1, com.android.i18n.phonenumbers.PhoneNumberUtil.Leniency p2, long p3) { return null; }

    public static class PhoneNumberFormat {
        public PhoneNumberFormat() {}
        public com.android.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat E164 = null;
        public com.android.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat RFC3966 = null;
        public com.android.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat NATIONAL = null;
    }

    public static class Leniency {
        public Leniency() {}
        public com.android.i18n.phonenumbers.PhoneNumberUtil.Leniency POSSIBLE = null;
    }
}
