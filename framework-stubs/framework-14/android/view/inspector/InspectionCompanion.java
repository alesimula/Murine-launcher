package android.view.inspector;

public interface InspectionCompanion<T extends java.lang.Object> {
    public void mapProperties(android.view.inspector.PropertyMapper p0);
    public void readProperties(T p0, android.view.inspector.PropertyReader p1);

    public static class UninitializedPropertyMapException extends java.lang.RuntimeException {
        public UninitializedPropertyMapException() { super(); }
    }
}
