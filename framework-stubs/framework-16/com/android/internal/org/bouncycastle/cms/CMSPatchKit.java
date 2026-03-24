package com.android.internal.org.bouncycastle.cms;

public class CMSPatchKit {
    public CMSPatchKit() {}
    public static com.android.internal.org.bouncycastle.cms.SignerInformation createNonDERSignerInfo(com.android.internal.org.bouncycastle.cms.SignerInformation p0) { return null; }
    public static com.android.internal.org.bouncycastle.cms.SignerInformation createWithSignatureAlgorithm(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return null; }

    private static class DLSignerInformation extends com.android.internal.org.bouncycastle.cms.SignerInformation {
        protected DLSignerInformation(com.android.internal.org.bouncycastle.cms.SignerInformation p0) { super((com.android.internal.org.bouncycastle.cms.SignerInformation)null); }
        public byte[] getEncodedSignedAttributes() throws java.io.IOException { return null; }
    }

    private static class ModEncAlgSignerInformation extends com.android.internal.org.bouncycastle.cms.SignerInformation {
        protected ModEncAlgSignerInformation(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { super((com.android.internal.org.bouncycastle.cms.SignerInformation)null); }
    }
}
