package com.android.i18n.phonenumbers;

public class Phonenumber {
    public Phonenumber() {}

    public static class PhoneNumber {
        public PhoneNumber() {}
        public int getCountryCode() { return 0; }
        public com.android.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource getCountryCodeSource() { return null; }
        public boolean hasCountryCode() { return false; }
        public long getNationalNumber() { return 0L; }

        public static class CountryCodeSource {
            public CountryCodeSource() {}
            public com.android.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource FROM_NUMBER_WITH_PLUS_SIGN = null;
        }
    }
}
