package android.os;

public final class PackageTagsList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.PackageTagsList> CREATOR = null;
    public boolean isEmpty() { return false; }
    public boolean includes(java.lang.String p0) { return false; }
    public boolean includesTag(java.lang.String p0) { return false; }
    public boolean containsAll(java.lang.String p0) { return false; }
    public boolean contains(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean contains(android.os.PackageTagsList p0) { return false; }
    @java.lang.Deprecated
    public java.util.Collection<java.lang.String> getPackages() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void dump(java.io.PrintWriter p0) {}

    public static final class Builder {
        public Builder() {}
        public Builder(int p0) {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder add(java.lang.String p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder add(java.lang.String p0, java.lang.String p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder add(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder add(android.os.PackageTagsList p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder add(java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder remove(java.lang.String p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder remove(java.lang.String p0, java.lang.String p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder remove(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder remove(android.os.PackageTagsList p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.os.PackageTagsList.Builder remove(java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> p0) { return null; }
        public android.os.PackageTagsList.Builder clear() { return null; }
        public android.os.PackageTagsList build() { return null; }
    }
}
