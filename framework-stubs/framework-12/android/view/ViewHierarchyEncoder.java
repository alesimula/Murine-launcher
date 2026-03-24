package android.view;

public class ViewHierarchyEncoder {
    private static final byte SIG_BOOLEAN = 90;
    private static final byte SIG_BYTE = 66;
    private static final byte SIG_SHORT = 83;
    private static final byte SIG_INT = 73;
    private static final byte SIG_LONG = 74;
    private static final byte SIG_FLOAT = 70;
    private static final byte SIG_DOUBLE = 68;
    private static final byte SIG_STRING = 82;
    private static final byte SIG_MAP = 77;
    private static final short SIG_END_MAP = 0;
    private final java.io.DataOutputStream mStream = null;
    private final java.util.Map<java.lang.String, java.lang.Short> mPropertyNames = null;
    private short mPropertyId;
    private java.nio.charset.Charset mCharset;
    private boolean mUserPropertiesEnabled;
    public ViewHierarchyEncoder(java.io.ByteArrayOutputStream p0) {}
    public void setUserPropertiesEnabled(boolean p0) {}
    public void beginObject(java.lang.Object p0) {}
    public void endObject() {}
    public void endStream() {}
    public void addProperty(java.lang.String p0, boolean p1) {}
    public void addProperty(java.lang.String p0, short p1) {}
    public void addProperty(java.lang.String p0, int p1) {}
    public void addProperty(java.lang.String p0, float p1) {}
    public void addProperty(java.lang.String p0, java.lang.String p1) {}
    public void addUserProperty(java.lang.String p0, java.lang.String p1) {}
    public void addPropertyKey(java.lang.String p0) {}
    private short createPropertyIndex(java.lang.String p0) { return 0; }
    private void startPropertyMap() {}
    private void endPropertyMap() {}
    private void writeBoolean(boolean p0) {}
    private void writeShort(short p0) {}
    private void writeInt(int p0) {}
    private void writeFloat(float p0) {}
    private void writeString(java.lang.String p0) {}
}
