package android.content;

public final class ContentValues implements android.os.Parcelable {
    public static final java.lang.String TAG = "ContentValues";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.ContentValues> CREATOR = null;
    public ContentValues() {}
    public ContentValues(int p0) {}
    public ContentValues(android.content.ContentValues p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.util.ArrayMap<java.lang.String, java.lang.Object> getValues() { return null; }
    public int hashCode() { return 0; }
    public void put(java.lang.String p0, java.lang.String p1) {}
    public void putAll(android.content.ContentValues p0) {}
    public void put(java.lang.String p0, java.lang.Byte p1) {}
    public void put(java.lang.String p0, java.lang.Short p1) {}
    public void put(java.lang.String p0, java.lang.Integer p1) {}
    public void put(java.lang.String p0, java.lang.Long p1) {}
    public void put(java.lang.String p0, java.lang.Float p1) {}
    public void put(java.lang.String p0, java.lang.Double p1) {}
    public void put(java.lang.String p0, java.lang.Boolean p1) {}
    public void put(java.lang.String p0, byte[] p1) {}
    public void putNull(java.lang.String p0) {}
    public void putObject(java.lang.String p0, java.lang.Object p1) {}
    public int size() { return 0; }
    public boolean isEmpty() { return false; }
    public void remove(java.lang.String p0) {}
    public void clear() {}
    public boolean containsKey(java.lang.String p0) { return false; }
    public java.lang.Object get(java.lang.String p0) { return null; }
    public java.lang.String getAsString(java.lang.String p0) { return null; }
    public java.lang.Long getAsLong(java.lang.String p0) { return null; }
    public java.lang.Integer getAsInteger(java.lang.String p0) { return null; }
    public java.lang.Short getAsShort(java.lang.String p0) { return null; }
    public java.lang.Byte getAsByte(java.lang.String p0) { return null; }
    public java.lang.Double getAsDouble(java.lang.String p0) { return null; }
    public java.lang.Float getAsFloat(java.lang.String p0) { return null; }
    public java.lang.Boolean getAsBoolean(java.lang.String p0) { return null; }
    public byte[] getAsByteArray(java.lang.String p0) { return null; }
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> valueSet() { return null; }
    public java.util.Set<java.lang.String> keySet() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @java.lang.Deprecated
    public void putStringArrayList(java.lang.String p0, java.util.ArrayList<java.lang.String> p1) {}
    @java.lang.Deprecated
    public java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public static boolean isSupportedValue(java.lang.Object p0) { return false; }
}
