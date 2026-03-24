package com.android.internal.org.bouncycastle.jcajce.provider.config;

public class ProviderConfigurationPermission extends java.security.BasicPermission {
    private static final int THREAD_LOCAL_EC_IMPLICITLY_CA = 1;
    private static final int EC_IMPLICITLY_CA = 2;
    private static final int THREAD_LOCAL_DH_DEFAULT_PARAMS = 4;
    private static final int DH_DEFAULT_PARAMS = 8;
    private static final int ACCEPTABLE_EC_CURVES = 16;
    private static final int ADDITIONAL_EC_PARAMETERS = 32;
    private static final int ALL = 63;
    private static final java.lang.String THREAD_LOCAL_EC_IMPLICITLY_CA_STR = "threadlocalecimplicitlyca";
    private static final java.lang.String EC_IMPLICITLY_CA_STR = "ecimplicitlyca";
    private static final java.lang.String THREAD_LOCAL_DH_DEFAULT_PARAMS_STR = "threadlocaldhdefaultparams";
    private static final java.lang.String DH_DEFAULT_PARAMS_STR = "dhdefaultparams";
    private static final java.lang.String ACCEPTABLE_EC_CURVES_STR = "acceptableeccurves";
    private static final java.lang.String ADDITIONAL_EC_PARAMETERS_STR = "additionalecparameters";
    private static final java.lang.String ALL_STR = "all";
    private final java.lang.String actions = null;
    private final int permissionMask = 0;
    public ProviderConfigurationPermission(java.lang.String p0) { super((java.lang.String)null); }
    public ProviderConfigurationPermission(java.lang.String p0, java.lang.String p1) { super((java.lang.String)null); }
    private int calculateMask(java.lang.String p0) { return 0; }
    public java.lang.String getActions() { return null; }
    public boolean implies(java.security.Permission p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
