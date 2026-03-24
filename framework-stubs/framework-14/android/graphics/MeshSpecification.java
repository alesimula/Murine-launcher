package android.graphics;

public class MeshSpecification {
    long mNativeMeshSpec;
    public static final int ALPHA_TYPE_UNKNOWN = 0;
    public static final int ALPHA_TYPE_OPAQUE = 1;
    public static final int ALPHA_TYPE_PREMULTIPLIED = 2;
    public static final int ALPHA_TYPE_UNPREMULTIPLIED = 3;
    public static final int TYPE_FLOAT = 0;
    public static final int TYPE_FLOAT2 = 1;
    public static final int TYPE_FLOAT3 = 2;
    public static final int TYPE_FLOAT4 = 3;
    public static final int TYPE_UBYTE4 = 4;
    public static android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4) { return null; }
    public static android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4, android.graphics.ColorSpace p5) { return null; }
    public static android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4, android.graphics.ColorSpace p5, int p6) { return null; }

    public static class Varying {
        public Varying(int p0, java.lang.String p1) {}
        public int getType() { return 0; }
        public java.lang.String getName() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class Attribute {
        public Attribute(int p0, int p1, java.lang.String p2) {}
        public int getType() { return 0; }
        public int getOffset() { return 0; }
        public java.lang.String getName() { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface AlphaType {
    }

    private static class MeshSpecificationHolder {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface Type {
    }
}
