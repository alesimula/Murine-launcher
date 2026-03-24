package com.android.internal.telephony.phonenumbers;

final class PhoneNumberMatcher implements java.util.Iterator<com.android.internal.telephony.phonenumbers.PhoneNumberMatch> {
    PhoneNumberMatcher(com.android.internal.telephony.phonenumbers.PhoneNumberUtil p0, java.lang.CharSequence p1, java.lang.String p2, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.Leniency p3, long p4) {}
    static boolean isLatinLetter(char p0) { return false; }
    static boolean allNumberGroupsRemainGrouped(com.android.internal.telephony.phonenumbers.PhoneNumberUtil p0, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p1, java.lang.StringBuilder p2, java.lang.String[] p3) { return false; }
    static boolean allNumberGroupsAreExactlyPresent(com.android.internal.telephony.phonenumbers.PhoneNumberUtil p0, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p1, java.lang.StringBuilder p2, java.lang.String[] p3) { return false; }
    boolean checkNumberGroupingIsValid(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.CharSequence p1, com.android.internal.telephony.phonenumbers.PhoneNumberUtil p2, com.android.internal.telephony.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker p3) { return false; }
    static boolean containsMoreThanOneSlashInNationalNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return false; }
    static boolean containsOnlyValidXChars(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1, com.android.internal.telephony.phonenumbers.PhoneNumberUtil p2) { return false; }
    static boolean isNationalPrefixPresentIfRequired(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil p1) { return false; }
    public boolean hasNext() { return false; }
    public com.android.internal.telephony.phonenumbers.PhoneNumberMatch next() { return null; }
    public void remove() {}

    static interface NumberGroupingChecker {
        public boolean checkGroups(com.android.internal.telephony.phonenumbers.PhoneNumberUtil p0, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p1, java.lang.StringBuilder p2, java.lang.String[] p3);
    }

    private static enum State {
        NOT_READY,
        READY,
        DONE;
    }
}
