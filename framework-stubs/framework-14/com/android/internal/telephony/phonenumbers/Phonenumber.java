package com.android.internal.telephony.phonenumbers;

public final class Phonenumber {

    public static class PhoneNumber implements java.io.Serializable {
        public PhoneNumber() {}
        public boolean hasCountryCode() { return false; }
        public int getCountryCode() { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setCountryCode(int p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearCountryCode() { return null; }
        public boolean hasNationalNumber() { return false; }
        public long getNationalNumber() { return 0L; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setNationalNumber(long p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearNationalNumber() { return null; }
        public boolean hasExtension() { return false; }
        public java.lang.String getExtension() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setExtension(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearExtension() { return null; }
        public boolean hasItalianLeadingZero() { return false; }
        public boolean isItalianLeadingZero() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setItalianLeadingZero(boolean p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearItalianLeadingZero() { return null; }
        public boolean hasNumberOfLeadingZeros() { return false; }
        public int getNumberOfLeadingZeros() { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setNumberOfLeadingZeros(int p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearNumberOfLeadingZeros() { return null; }
        public boolean hasRawInput() { return false; }
        public java.lang.String getRawInput() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setRawInput(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearRawInput() { return null; }
        public boolean hasCountryCodeSource() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource getCountryCodeSource() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setCountryCodeSource(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearCountryCodeSource() { return null; }
        public boolean hasPreferredDomesticCarrierCode() { return false; }
        public java.lang.String getPreferredDomesticCarrierCode() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber setPreferredDomesticCarrierCode(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clearPreferredDomesticCarrierCode() { return null; }
        public final com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber clear() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber mergeFrom(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return null; }
        public boolean exactlySameAs(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        public static enum CountryCodeSource {
            FROM_NUMBER_WITH_PLUS_SIGN,
            FROM_NUMBER_WITH_IDD,
            FROM_NUMBER_WITHOUT_PLUS_SIGN,
            FROM_DEFAULT_COUNTRY,
            UNSPECIFIED;
        }
    }
}
