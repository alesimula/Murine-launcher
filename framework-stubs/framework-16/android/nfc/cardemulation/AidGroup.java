package android.nfc.cardemulation;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
public final class AidGroup implements android.os.Parcelable {
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.AidGroup> CREATOR = null;
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public AidGroup(java.util.List<java.lang.String> p0, java.lang.String p1) {}
    AidGroup(java.lang.String p0, java.lang.String p1) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.lang.String getCategory() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAids() { return null; }
    public java.lang.String toString() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void dump(android.util.proto.ProtoOutputStream p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.Nullable
    public static android.nfc.cardemulation.AidGroup createFromXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void writeAsXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
}
