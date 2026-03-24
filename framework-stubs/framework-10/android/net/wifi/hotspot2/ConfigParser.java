package android.net.wifi.hotspot2;

public final class ConfigParser {
    private static final java.lang.String TAG = "ConfigParser";
    private static final java.lang.String CONTENT_TYPE = "Content-Type";
    private static final java.lang.String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";
    private static final java.lang.String TYPE_MULTIPART_MIXED = "multipart/mixed";
    private static final java.lang.String TYPE_WIFI_CONFIG = "application/x-wifi-config";
    private static final java.lang.String TYPE_PASSPOINT_PROFILE = "application/x-passpoint-profile";
    private static final java.lang.String TYPE_CA_CERT = "application/x-x509-ca-cert";
    private static final java.lang.String TYPE_PKCS12 = "application/x-pkcs12";
    private static final java.lang.String ENCODING_BASE64 = "base64";
    private static final java.lang.String BOUNDARY = "boundary=";
    public ConfigParser() {}
    public static android.net.wifi.hotspot2.PasspointConfiguration parsePasspointConfig(java.lang.String p0, byte[] p1) { return null; }
    private static android.net.wifi.hotspot2.PasspointConfiguration createPasspointConfig(java.util.Map<java.lang.String, byte[]> p0) throws java.io.IOException { return null; }
    private static java.util.Map<java.lang.String, byte[]> parseMimeMultipartMessage(java.io.LineNumberReader p0) throws java.io.IOException { return null; }
    private static android.net.wifi.hotspot2.ConfigParser.MimePart parseMimePart(java.io.LineNumberReader p0, java.lang.String p1) throws java.io.IOException { return null; }
    private static android.net.wifi.hotspot2.ConfigParser.MimeHeader parseHeaders(java.io.LineNumberReader p0) throws java.io.IOException { return null; }
    private static android.util.Pair<java.lang.String, java.lang.String> parseContentType(java.lang.String p0) throws java.io.IOException { return null; }
    private static java.util.Map<java.lang.String, java.lang.String> readHeaders(java.io.LineNumberReader p0) throws java.io.IOException { return null; }
    private static java.security.cert.X509Certificate parseCACert(byte[] p0) throws java.security.cert.CertificateException { return null; }
    private static android.util.Pair<java.security.PrivateKey, java.util.List<java.security.cert.X509Certificate>> parsePkcs12(byte[] p0) throws java.security.GeneralSecurityException, java.io.IOException { return null; }

    private static class MimePart {
        public java.lang.String type;
        public byte[] data;
        public boolean isLast;
        private MimePart() {}
    }

    private static class MimeHeader {
        public java.lang.String contentType;
        public java.lang.String boundary;
        public java.lang.String encodingType;
        private MimeHeader() {}
    }
}
