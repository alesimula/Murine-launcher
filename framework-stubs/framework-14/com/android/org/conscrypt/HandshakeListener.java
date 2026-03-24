package com.android.org.conscrypt;

public abstract class HandshakeListener {
    public HandshakeListener() {}
    public abstract void onHandshakeFinished() throws javax.net.ssl.SSLException;
}
