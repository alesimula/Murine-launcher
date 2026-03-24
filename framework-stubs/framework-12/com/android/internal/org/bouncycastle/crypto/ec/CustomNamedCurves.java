package com.android.internal.org.bouncycastle.crypto.ec;

public class CustomNamedCurves {
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp192k1;
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp192r1;
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp224k1;
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp224r1;
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp256k1;
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp256r1;
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp384r1;
    static com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder secp521r1;
    static final java.util.Hashtable nameToCurve = null;
    static final java.util.Hashtable nameToOID = null;
    static final java.util.Hashtable oidToCurve = null;
    static final java.util.Hashtable oidToName = null;
    static final java.util.Vector names = null;
    public CustomNamedCurves() {}
    private static com.android.internal.org.bouncycastle.asn1.x9.X9ECPoint configureBasepoint(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, java.lang.String p1) { return null; }
    private static com.android.internal.org.bouncycastle.math.ec.ECCurve configureCurve(com.android.internal.org.bouncycastle.math.ec.ECCurve p0) { return null; }
    private static com.android.internal.org.bouncycastle.math.ec.ECCurve configureCurveGLV(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.endo.GLVTypeBParameters p1) { return null; }
    static void defineCurve(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder p1) {}
    static void defineCurveWithOID(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, com.android.internal.org.bouncycastle.asn1.x9.X9ECParametersHolder p2) {}
    static void defineCurveAlias(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1) {}
    public static com.android.internal.org.bouncycastle.asn1.x9.X9ECParameters getByName(java.lang.String p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x9.X9ECParameters getByOID(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getOID(java.lang.String p0) { return null; }
    public static java.lang.String getName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public static java.util.Enumeration getNames() { return null; }
}
