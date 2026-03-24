package com.android.org.conscrypt;

final class SSLParametersImpl implements java.lang.Cloneable {
    java.lang.String[] enabledProtocols;
    boolean isEnabledProtocolsFiltered;
    java.lang.String[] enabledCipherSuites;
    byte[] sctExtension;
    byte[] ocspResponse;
    byte[] applicationProtocols;
    com.android.org.conscrypt.ApplicationProtocolSelectorAdapter applicationProtocolSelector;
    boolean useSessionTickets;
    boolean channelIdEnabled;
    SSLParametersImpl(javax.net.ssl.KeyManager[] p0, javax.net.ssl.TrustManager[] p1, java.security.SecureRandom p2, com.android.org.conscrypt.ClientSessionContext p3, com.android.org.conscrypt.ServerSessionContext p4, java.lang.String[] p5) throws java.security.KeyManagementException {}
    static com.android.org.conscrypt.SSLParametersImpl getDefault() throws java.security.KeyManagementException { return null; }
    com.android.org.conscrypt.AbstractSessionContext getSessionContext() { return null; }
    com.android.org.conscrypt.ClientSessionContext getClientSessionContext() { return null; }
    javax.net.ssl.X509KeyManager getX509KeyManager() { return null; }
    com.android.org.conscrypt.PSKKeyManager getPSKKeyManager() { return null; }
    javax.net.ssl.X509TrustManager getX509TrustManager() { return null; }
    java.lang.String[] getEnabledCipherSuites() { return null; }
    void setEnabledCipherSuites(java.lang.String[] p0) {}
    java.lang.String[] getEnabledProtocols() { return null; }
    void setEnabledProtocols(java.lang.String[] p0) {}
    void setApplicationProtocols(java.lang.String[] p0) {}
    java.lang.String[] getApplicationProtocols() { return null; }
    void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelectorAdapter p0) {}
    com.android.org.conscrypt.ApplicationProtocolSelectorAdapter getApplicationProtocolSelector() { return null; }
    void setUseClientMode(boolean p0) {}
    boolean getUseClientMode() { return false; }
    void setNeedClientAuth(boolean p0) {}
    boolean getNeedClientAuth() { return false; }
    void setWantClientAuth(boolean p0) {}
    boolean getWantClientAuth() { return false; }
    void setEnableSessionCreation(boolean p0) {}
    boolean getEnableSessionCreation() { return false; }
    void setUseSessionTickets(boolean p0) {}
    void setUseSni(boolean p0) {}
    boolean getUseSni() { return false; }
    void setCTVerificationEnabled(boolean p0) {}
    void setSCTExtension(byte[] p0) {}
    void setOCSPResponse(byte[] p0) {}
    byte[] getOCSPResponse() { return null; }
    protected java.lang.Object clone() { return null; }
    com.android.org.conscrypt.SSLParametersImpl cloneWithTrustManager(javax.net.ssl.X509TrustManager p0) { return null; }
    static javax.net.ssl.X509TrustManager getDefaultX509TrustManager() throws java.security.KeyManagementException { return null; }
    java.lang.String getEndpointIdentificationAlgorithm() { return null; }
    void setEndpointIdentificationAlgorithm(java.lang.String p0) {}
    boolean getUseCipherSuitesOrder() { return false; }
    java.util.Collection<javax.net.ssl.SNIMatcher> getSNIMatchers() { return null; }
    void setSNIMatchers(java.util.Collection<javax.net.ssl.SNIMatcher> p0) {}
    java.security.AlgorithmConstraints getAlgorithmConstraints() { return null; }
    void setAlgorithmConstraints(java.security.AlgorithmConstraints p0) {}
    void setUseCipherSuitesOrder(boolean p0) {}
    boolean isCTVerificationEnabled(java.lang.String p0) { return false; }

    static interface AliasChooser {
        public java.lang.String chooseClientAlias(javax.net.ssl.X509KeyManager p0, javax.security.auth.x500.X500Principal[] p1, java.lang.String[] p2);
        public java.lang.String chooseServerAlias(javax.net.ssl.X509KeyManager p0, java.lang.String p1);
    }

    static interface PSKCallbacks {
        public java.lang.String chooseServerPSKIdentityHint(com.android.org.conscrypt.PSKKeyManager p0);
        public java.lang.String chooseClientPSKIdentity(com.android.org.conscrypt.PSKKeyManager p0, java.lang.String p1);
        public javax.crypto.SecretKey getPSKKey(com.android.org.conscrypt.PSKKeyManager p0, java.lang.String p1, java.lang.String p2);
    }
}
