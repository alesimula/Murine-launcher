package com.android.internal.org.bouncycastle.asn1.x509;

public interface NameConstraintValidator {
    public void checkPermitted(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException;
    public void checkExcluded(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException;
    public void intersectPermittedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree p0);
    public void intersectPermittedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree[] p0);
    public void intersectEmptyPermittedSubtree(int p0);
    public void addExcludedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree p0);
}
