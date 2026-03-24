package android.net;

public abstract class QosCallback {
    public QosCallback() {}
    public void onError(android.net.QosCallbackException p0) {}
    public void onQosSessionAvailable(android.net.QosSession p0, android.net.QosSessionAttributes p1) {}
    public void onQosSessionLost(android.net.QosSession p0) {}

    public static class QosCallbackRegistrationException extends java.lang.RuntimeException {
        QosCallbackRegistrationException() { super(); }
    }
}
