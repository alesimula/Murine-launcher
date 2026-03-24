package com.android.internal.org.bouncycastle.asn1.x509;

public class X509Name extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier C = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier O = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier OU = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier T = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier CN = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier SN = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier STREET = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier SERIALNUMBER = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier L = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier ST = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier SURNAME = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier GIVENNAME = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier INITIALS = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier GENERATION = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier UNIQUE_IDENTIFIER = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier BUSINESS_CATEGORY = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier POSTAL_CODE = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier DN_QUALIFIER = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier PSEUDONYM = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier DATE_OF_BIRTH = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier PLACE_OF_BIRTH = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier GENDER = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier NAME_AT_BIRTH = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier POSTAL_ADDRESS = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier DMD_NAME = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier TELEPHONE_NUMBER = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier NAME = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier EmailAddress = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier UnstructuredName = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier UnstructuredAddress = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier E = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier DC = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier UID = null;
    public static boolean DefaultReverse;
    public static final java.util.Hashtable DefaultSymbols = null;
    public static final java.util.Hashtable RFC2253Symbols = null;
    public static final java.util.Hashtable RFC1779Symbols = null;
    public static final java.util.Hashtable DefaultLookUp = null;
    public static final java.util.Hashtable OIDLookUp = null;
    public static final java.util.Hashtable SymbolLookUp = null;
    private static final java.lang.Boolean TRUE = null;
    private static final java.lang.Boolean FALSE = null;
    private com.android.internal.org.bouncycastle.asn1.x509.X509NameEntryConverter converter;
    private java.util.Vector ordering;
    private java.util.Vector values;
    private java.util.Vector added;
    private com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
    private boolean isHashCodeCalculated;
    private int hashCodeValue;
    public static com.android.internal.org.bouncycastle.asn1.x509.X509Name getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.X509Name getInstance(java.lang.Object p0) { return null; }
    protected X509Name() { super(); }
    public X509Name(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public X509Name(java.util.Hashtable p0) { super(); }
    public X509Name(java.util.Vector p0, java.util.Hashtable p1) { super(); }
    public X509Name(java.util.Vector p0, java.util.Hashtable p1, com.android.internal.org.bouncycastle.asn1.x509.X509NameEntryConverter p2) { super(); }
    public X509Name(java.util.Vector p0, java.util.Vector p1) { super(); }
    public X509Name(java.util.Vector p0, java.util.Vector p1, com.android.internal.org.bouncycastle.asn1.x509.X509NameEntryConverter p2) { super(); }
    public X509Name(java.lang.String p0) { super(); }
    public X509Name(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x509.X509NameEntryConverter p1) { super(); }
    public X509Name(boolean p0, java.lang.String p1) { super(); }
    public X509Name(boolean p0, java.lang.String p1, com.android.internal.org.bouncycastle.asn1.x509.X509NameEntryConverter p2) { super(); }
    public X509Name(boolean p0, java.util.Hashtable p1, java.lang.String p2) { super(); }
    private com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier decodeOID(java.lang.String p0, java.util.Hashtable p1) { return null; }
    private java.lang.String unescape(java.lang.String p0) { return null; }
    public X509Name(boolean p0, java.util.Hashtable p1, java.lang.String p2, com.android.internal.org.bouncycastle.asn1.x509.X509NameEntryConverter p3) { super(); }
    private void addEntry(java.util.Hashtable p0, java.lang.String p1, java.lang.Boolean p2) {}
    public java.util.Vector getOIDs() { return null; }
    public java.util.Vector getValues() { return null; }
    public java.util.Vector getValues(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    public boolean equals(java.lang.Object p0, boolean p1) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private boolean equivalentStrings(java.lang.String p0, java.lang.String p1) { return false; }
    private java.lang.String canonicalize(java.lang.String p0) { return null; }
    private com.android.internal.org.bouncycastle.asn1.ASN1Primitive decodeObject(java.lang.String p0) { return null; }
    private java.lang.String stripInternalSpaces(java.lang.String p0) { return null; }
    private void appendValue(java.lang.StringBuffer p0, java.util.Hashtable p1, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p2, java.lang.String p3) {}
    public java.lang.String toString(boolean p0, java.util.Hashtable p1) { return null; }
    private java.lang.String bytesToString(byte[] p0) { return null; }
    public java.lang.String toString() { return null; }
}
