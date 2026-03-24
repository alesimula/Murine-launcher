package com.android.internal.telephony.phonenumbers.metadata.source;

final class MapBackedMetadataContainer<T extends java.lang.Object> implements com.android.internal.telephony.phonenumbers.metadata.source.MetadataContainer {
    static com.android.internal.telephony.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.String> byRegionCode() { return null; }
    static com.android.internal.telephony.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.Integer> byCountryCallingCode() { return null; }
    com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata getMetadataBy(T p0) { return null; }
    com.android.internal.telephony.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider<T> getKeyProvider() { return null; }
    public void accept(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata p0) {}

    static interface KeyProvider<T extends java.lang.Object> {
        public T getKeyOf(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata p0);
    }
}
