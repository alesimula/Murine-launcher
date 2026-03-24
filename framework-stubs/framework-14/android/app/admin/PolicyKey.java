package android.app.admin;

@android.annotation.SystemApi
@android.annotation.SuppressLint({"ParcelNotFinal", "ParcelCreator"})
public abstract class PolicyKey implements android.os.Parcelable {
    static final java.lang.String TAG = "PolicyKey";
    static final java.lang.String ATTR_POLICY_IDENTIFIER = "policy-identifier";
    protected PolicyKey(java.lang.String p0) {}
    public java.lang.String getIdentifier() { return null; }
    public boolean hasSameIdentifierAs(android.app.admin.PolicyKey p0) { return false; }
    public static android.app.admin.PolicyKey readGenericPolicyKeyFromXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public android.app.admin.PolicyKey readFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public abstract void writeToBundle(android.os.Bundle p0);
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
