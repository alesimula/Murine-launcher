package com.android.internal.telephony.phonenumbers;

public final class Phonemetadata {

    public static class NumberFormat implements java.io.Externalizable {
        public NumberFormat() {}
        public static com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat.Builder newBuilder() { return null; }
        public boolean hasPattern() { return false; }
        public java.lang.String getPattern() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat setPattern(java.lang.String p0) { return null; }
        public boolean hasFormat() { return false; }
        public java.lang.String getFormat() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat setFormat(java.lang.String p0) { return null; }
        public java.util.List<java.lang.String> leadingDigitPatterns() { return null; }
        @java.lang.Deprecated
        public int leadingDigitsPatternSize() { return 0; }
        public int getLeadingDigitsPatternCount() { return 0; }
        public java.lang.String getLeadingDigitsPattern(int p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat addLeadingDigitsPattern(java.lang.String p0) { return null; }
        public boolean hasNationalPrefixFormattingRule() { return false; }
        public java.lang.String getNationalPrefixFormattingRule() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat setNationalPrefixFormattingRule(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat clearNationalPrefixFormattingRule() { return null; }
        public boolean hasNationalPrefixOptionalWhenFormatting() { return false; }
        public boolean getNationalPrefixOptionalWhenFormatting() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat setNationalPrefixOptionalWhenFormatting(boolean p0) { return null; }
        public boolean hasDomesticCarrierCodeFormattingRule() { return false; }
        public java.lang.String getDomesticCarrierCodeFormattingRule() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat setDomesticCarrierCodeFormattingRule(java.lang.String p0) { return null; }
        public void writeExternal(java.io.ObjectOutput p0) throws java.io.IOException {}
        public void readExternal(java.io.ObjectInput p0) throws java.io.IOException {}

        public static final class Builder extends com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat {
            public Builder() { super(); }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat build() { return null; }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat.Builder mergeFrom(com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat p0) { return null; }
        }
    }

    public static class PhoneMetadata implements java.io.Externalizable {
        public PhoneMetadata() {}
        public static com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata.Builder newBuilder() { return null; }
        public boolean hasGeneralDesc() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getGeneralDesc() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getGeneralDescBuilder() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setGeneralDesc(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasFixedLine() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getFixedLine() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setFixedLine(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasMobile() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getMobile() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setMobile(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasTollFree() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getTollFree() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setTollFree(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasPremiumRate() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getPremiumRate() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setPremiumRate(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasSharedCost() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getSharedCost() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setSharedCost(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasPersonalNumber() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getPersonalNumber() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setPersonalNumber(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasVoip() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getVoip() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setVoip(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasPager() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getPager() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setPager(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasUan() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getUan() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setUan(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasEmergency() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getEmergency() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setEmergency(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasVoicemail() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getVoicemail() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setVoicemail(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasShortCode() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getShortCode() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setShortCode(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasStandardRate() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getStandardRate() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setStandardRate(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasCarrierSpecific() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getCarrierSpecific() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setCarrierSpecific(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasSmsServices() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getSmsServices() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setSmsServices(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasNoInternationalDialling() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getNoInternationalDialling() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setNoInternationalDialling(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        public boolean hasId() { return false; }
        public java.lang.String getId() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setId(java.lang.String p0) { return null; }
        public boolean hasCountryCode() { return false; }
        public int getCountryCode() { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setCountryCode(int p0) { return null; }
        public boolean hasInternationalPrefix() { return false; }
        public java.lang.String getInternationalPrefix() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setInternationalPrefix(java.lang.String p0) { return null; }
        public boolean hasPreferredInternationalPrefix() { return false; }
        public java.lang.String getPreferredInternationalPrefix() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setPreferredInternationalPrefix(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearPreferredInternationalPrefix() { return null; }
        public boolean hasNationalPrefix() { return false; }
        public java.lang.String getNationalPrefix() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setNationalPrefix(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearNationalPrefix() { return null; }
        public boolean hasPreferredExtnPrefix() { return false; }
        public java.lang.String getPreferredExtnPrefix() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setPreferredExtnPrefix(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearPreferredExtnPrefix() { return null; }
        public boolean hasNationalPrefixForParsing() { return false; }
        public java.lang.String getNationalPrefixForParsing() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setNationalPrefixForParsing(java.lang.String p0) { return null; }
        public boolean hasNationalPrefixTransformRule() { return false; }
        public java.lang.String getNationalPrefixTransformRule() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setNationalPrefixTransformRule(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearNationalPrefixTransformRule() { return null; }
        public boolean hasSameMobileAndFixedLinePattern() { return false; }
        public boolean getSameMobileAndFixedLinePattern() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setSameMobileAndFixedLinePattern(boolean p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearSameMobileAndFixedLinePattern() { return null; }
        @java.lang.Deprecated
        public java.util.List<com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat> numberFormats() { return null; }
        public java.util.List<com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat> getNumberFormatList() { return null; }
        @java.lang.Deprecated
        public int numberFormatSize() { return 0; }
        public int getNumberFormatCount() { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat getNumberFormat(int p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata addNumberFormat(com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat p0) { return null; }
        @java.lang.Deprecated
        public java.util.List<com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat> intlNumberFormats() { return null; }
        public java.util.List<com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat> getIntlNumberFormatList() { return null; }
        @java.lang.Deprecated
        public int intlNumberFormatSize() { return 0; }
        public int getIntlNumberFormatCount() { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat getIntlNumberFormat(int p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata addIntlNumberFormat(com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearIntlNumberFormat() { return null; }
        public boolean hasMainCountryForCode() { return false; }
        public boolean isMainCountryForCode() { return false; }
        public boolean getMainCountryForCode() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setMainCountryForCode(boolean p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearMainCountryForCode() { return null; }
        public boolean hasLeadingDigits() { return false; }
        public java.lang.String getLeadingDigits() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setLeadingDigits(java.lang.String p0) { return null; }
        public boolean hasMobileNumberPortableRegion() { return false; }
        @java.lang.Deprecated
        public boolean isMobileNumberPortableRegion() { return false; }
        public boolean getMobileNumberPortableRegion() { return false; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata setMobileNumberPortableRegion(boolean p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata clearMobileNumberPortableRegion() { return null; }
        public void writeExternal(java.io.ObjectOutput p0) throws java.io.IOException {}
        public void readExternal(java.io.ObjectInput p0) throws java.io.IOException {}

        public static final class Builder extends com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata {
            public Builder() { super(); }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata build() { return null; }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata.Builder setId(java.lang.String p0) { return null; }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata.Builder setInternationalPrefix(java.lang.String p0) { return null; }
        }
    }

    public static class PhoneMetadataCollection implements java.io.Externalizable {
        public PhoneMetadataCollection() {}
        public static com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadataCollection.Builder newBuilder() { return null; }
        public java.util.List<com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata> getMetadataList() { return null; }
        public int getMetadataCount() { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadataCollection addMetadata(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata p0) { return null; }
        public void writeExternal(java.io.ObjectOutput p0) throws java.io.IOException {}
        public void readExternal(java.io.ObjectInput p0) throws java.io.IOException {}
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadataCollection clear() { return null; }

        public static final class Builder extends com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadataCollection {
            public Builder() { super(); }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadataCollection build() { return null; }
        }
    }

    public static class PhoneNumberDesc implements java.io.Externalizable {
        public PhoneNumberDesc() {}
        public static com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc.Builder newBuilder() { return null; }
        public boolean hasNationalNumberPattern() { return false; }
        public java.lang.String getNationalNumberPattern() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc setNationalNumberPattern(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc clearNationalNumberPattern() { return null; }
        public java.util.List<java.lang.Integer> getPossibleLengthList() { return null; }
        public int getPossibleLengthCount() { return 0; }
        public int getPossibleLength(int p0) { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc addPossibleLength(int p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc clearPossibleLength() { return null; }
        public java.util.List<java.lang.Integer> getPossibleLengthLocalOnlyList() { return null; }
        public int getPossibleLengthLocalOnlyCount() { return 0; }
        public int getPossibleLengthLocalOnly(int p0) { return 0; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc addPossibleLengthLocalOnly(int p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc clearPossibleLengthLocalOnly() { return null; }
        public boolean hasExampleNumber() { return false; }
        public java.lang.String getExampleNumber() { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc setExampleNumber(java.lang.String p0) { return null; }
        public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc clearExampleNumber() { return null; }
        public boolean exactlySameAs(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return false; }
        public void writeExternal(java.io.ObjectOutput p0) throws java.io.IOException {}
        public void readExternal(java.io.ObjectInput p0) throws java.io.IOException {}

        public static final class Builder extends com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc {
            public Builder() { super(); }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc build() { return null; }
            public com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc.Builder mergeFrom(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p0) { return null; }
        }
    }
}
