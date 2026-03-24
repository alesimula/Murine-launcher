package android.app.admin;

public final class ParcelableResource implements android.os.Parcelable {
    public static final int RESOURCE_TYPE_DRAWABLE = 1;
    public static final int RESOURCE_TYPE_STRING = 2;
    public static final android.os.Parcelable.Creator<android.app.admin.ParcelableResource> CREATOR = null;
    public ParcelableResource(android.content.Context p0, int p1, int p2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {}
    public int getResourceId() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getResourceName() { return null; }
    public int getResourceType() { return 0; }
    public android.graphics.drawable.Drawable getDrawable(android.content.Context p0, int p1, java.util.function.Supplier<android.graphics.drawable.Drawable> p2) { return null; }
    public java.lang.String getString(android.content.Context p0, java.util.function.Supplier<java.lang.String> p1) { return null; }
    public java.lang.String getString(android.content.Context p0, java.util.function.Supplier<java.lang.String> p1, java.lang.Object... p2) { return null; }
    public static android.graphics.drawable.Drawable loadDefaultDrawable(java.util.function.Supplier<android.graphics.drawable.Drawable> p0) { return null; }
    public static java.lang.String loadDefaultString(java.util.function.Supplier<java.lang.String> p0) { return null; }
    public void writeToXmlFile(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public static android.app.admin.ParcelableResource createFromXml(android.util.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResourceType {
    }
}
