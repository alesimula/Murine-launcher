package android.content.pm.verify.domain;

public final class DomainVerificationManager {
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VERIFICATION_REQUEST = "android.content.pm.verify.domain.extra.VERIFICATION_REQUEST";
    @android.annotation.SystemApi
    public static final int STATUS_OK = 0;
    @android.annotation.SystemApi
    public static final int ERROR_DOMAIN_SET_ID_INVALID = 1;
    @android.annotation.SystemApi
    public static final int ERROR_UNKNOWN_DOMAIN = 2;
    @android.annotation.SystemApi
    public static final int ERROR_UNABLE_TO_APPROVE = 3;
    public static final int INTERNAL_ERROR_NAME_NOT_FOUND = 1;
    public DomainVerificationManager(android.content.Context p0, android.content.pm.verify.domain.IDomainVerificationManager p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DOMAIN_VERIFICATION_AGENT")
    public java.util.List<java.lang.String> queryValidVerificationPackageNames() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DOMAIN_VERIFICATION_AGENT")
    public android.content.pm.verify.domain.DomainVerificationInfo getDomainVerificationInfo(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DOMAIN_VERIFICATION_AGENT")
    public int setDomainVerificationStatus(java.util.UUID p0, java.util.Set<java.lang.String> p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.UPDATE_DOMAIN_VERIFICATION_USER_SELECTION")
    public void setDomainVerificationLinkHandlingAllowed(java.lang.String p0, boolean p1) throws android.content.pm.PackageManager.NameNotFoundException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.UPDATE_DOMAIN_VERIFICATION_USER_SELECTION")
    public int setDomainVerificationUserSelection(java.util.UUID p0, java.util.Set<java.lang.String> p1, boolean p2) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public android.content.pm.verify.domain.DomainVerificationUserState getDomainVerificationUserState(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.UPDATE_DOMAIN_VERIFICATION_USER_SELECTION")
    public java.util.SortedSet<android.content.pm.verify.domain.DomainOwner> getOwnersForDomain(java.lang.String p0) { return null; }

    public static @interface Error {
    }
}
