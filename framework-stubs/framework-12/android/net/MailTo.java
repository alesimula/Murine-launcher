package android.net;

public class MailTo {
    public static final java.lang.String MAILTO_SCHEME = "mailto:";
    private java.util.HashMap<java.lang.String, java.lang.String> mHeaders;
    private static final java.lang.String TO = "to";
    private static final java.lang.String BODY = "body";
    private static final java.lang.String CC = "cc";
    private static final java.lang.String SUBJECT = "subject";
    public static boolean isMailTo(java.lang.String p0) { return false; }
    public static android.net.MailTo parse(java.lang.String p0) throws android.net.ParseException { return null; }
    public java.lang.String getTo() { return null; }
    public java.lang.String getCc() { return null; }
    public java.lang.String getSubject() { return null; }
    public java.lang.String getBody() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() { return null; }
    public java.lang.String toString() { return null; }
    private MailTo() {}
}
