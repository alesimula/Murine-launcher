package android.hardware.input;

public interface AppLaunchData {
    @android.annotation.NonNull
    public static android.hardware.input.AppLaunchData createLaunchDataForCategory(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.hardware.input.AppLaunchData createLaunchDataForRole(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.hardware.input.AppLaunchData createLaunchDataForComponent(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.Nullable
    public static android.hardware.input.AppLaunchData createLaunchData(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }

    public static class CategoryData implements android.hardware.input.AppLaunchData {
        public CategoryData(java.lang.String p0) {}
        @android.annotation.NonNull
        public java.lang.String getCategory() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class ComponentData implements android.hardware.input.AppLaunchData {
        public ComponentData(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public java.lang.String getPackageName() { return null; }
        @android.annotation.NonNull
        public java.lang.String getClassName() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class RoleData implements android.hardware.input.AppLaunchData {
        public RoleData(java.lang.String p0) {}
        @android.annotation.NonNull
        public java.lang.String getRole() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
