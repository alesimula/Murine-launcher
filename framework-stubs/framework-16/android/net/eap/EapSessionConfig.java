package android.net.eap;

public final class EapSessionConfig {
    EapSessionConfig() {}
    @android.annotation.Nullable
    public android.net.eap.EapSessionConfig.EapAkaConfig getEapAkaConfig() { return null; }
    @android.annotation.Nullable
    public android.net.eap.EapSessionConfig.EapAkaPrimeConfig getEapAkaPrimeConfig() { return null; }
    @android.annotation.NonNull
    public byte[] getEapIdentity() { return null; }
    @android.annotation.Nullable
    public android.net.eap.EapSessionConfig.EapMsChapV2Config getEapMsChapV2Config() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.net.eap.EapSessionConfig.EapMsChapV2Config getEapMsChapV2onfig() { return null; }
    @android.annotation.Nullable
    public android.net.eap.EapSessionConfig.EapSimConfig getEapSimConfig() { return null; }
    @android.annotation.Nullable
    public android.net.eap.EapSessionConfig.EapTtlsConfig getEapTtlsConfig() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.Builder setEapAkaConfig(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.Builder setEapAkaConfig(int p0, int p1, android.net.eap.EapSessionConfig.EapAkaOption p2) { return null; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.Builder setEapAkaPrimeConfig(int p0, int p1, java.lang.String p2, boolean p3) { return null; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.Builder setEapIdentity(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.Builder setEapMsChapV2Config(java.lang.String p0, java.lang.String p1) { return null; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.Builder setEapSimConfig(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.Builder setEapTtlsConfig(java.security.cert.X509Certificate p0, android.net.eap.EapSessionConfig p1) { return null; }
    }

    public static class EapAkaConfig extends android.net.eap.EapSessionConfig.EapUiccConfig {
        EapAkaConfig() { super(); }
        public int getAppType() { return 0; }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig.EapAkaOption getEapAkaOption() { return null; }
        public int getSubId() { return 0; }
    }

    public static final class EapAkaOption {
        EapAkaOption() {}
        @android.annotation.Nullable
        public byte[] getReauthId() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.net.eap.EapSessionConfig.EapAkaOption build() { return null; }
            @android.annotation.NonNull
            public android.net.eap.EapSessionConfig.EapAkaOption.Builder setReauthId(byte[] p0) { return null; }
        }
    }

    public static class EapAkaPrimeConfig extends android.net.eap.EapSessionConfig.EapAkaConfig {
        EapAkaPrimeConfig() { super(); }
        public boolean allowsMismatchedNetworkNames() { return false; }
        @android.annotation.NonNull
        public java.lang.String getNetworkName() { return null; }
    }

    public static abstract class EapMethodConfig {
        public static final int EAP_TYPE_AKA = 23;
        public static final int EAP_TYPE_AKA_PRIME = 50;
        public static final int EAP_TYPE_MSCHAP_V2 = 26;
        public static final int EAP_TYPE_SIM = 18;
        public static final int EAP_TYPE_TTLS = 21;
        EapMethodConfig() {}
        public int getMethodType() { return 0; }
    }

    public static class EapMsChapV2Config extends android.net.eap.EapSessionConfig.EapMethodConfig {
        EapMsChapV2Config() { super(); }
        @android.annotation.NonNull
        public java.lang.String getPassword() { return null; }
        @android.annotation.NonNull
        public java.lang.String getUsername() { return null; }
    }

    public static class EapSimConfig extends android.net.eap.EapSessionConfig.EapUiccConfig {
        EapSimConfig() { super(); }
        public int getAppType() { return 0; }
        public int getSubId() { return 0; }
    }

    public static class EapTtlsConfig extends android.net.eap.EapSessionConfig.EapMethodConfig {
        EapTtlsConfig() { super(); }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig getInnerEapSessionConfig() { return null; }
        @android.annotation.Nullable
        public java.security.cert.X509Certificate getServerCaCert() { return null; }
    }

    @java.lang.Deprecated
    public static abstract class EapUiccConfig extends android.net.eap.EapSessionConfig.EapMethodConfig {
        @java.lang.Deprecated
        EapUiccConfig() { super(); }
        @java.lang.Deprecated
        public int getAppType() { return 0; }
        @java.lang.Deprecated
        public int getSubId() { return 0; }
    }
}
