package com.android.internal.org.bouncycastle.cms;

public interface PasswordRecipient extends com.android.internal.org.bouncycastle.cms.Recipient {
    public static final int PKCS5_SCHEME2 = 0;
    public static final int PKCS5_SCHEME2_UTF8 = 1;
    public byte[] calculateDerivedKey(int p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, int p2) throws com.android.internal.org.bouncycastle.cms.CMSException;
    public com.android.internal.org.bouncycastle.cms.RecipientOperator getRecipientOperator(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, byte[] p2, byte[] p3) throws com.android.internal.org.bouncycastle.cms.CMSException;
    public int getPasswordConversionScheme();
    public char[] getPassword();

    public static final class PRF {
        public static final com.android.internal.org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA1 = null;
        public static final com.android.internal.org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA224 = null;
        public static final com.android.internal.org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA256 = null;
        public static final com.android.internal.org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA384 = null;
        public static final com.android.internal.org.bouncycastle.cms.PasswordRecipient.PRF HMacSHA512 = null;
        final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier prfAlgID = null;
        public java.lang.String getName() { return null; }
        public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmID() { return null; }
    }
}
