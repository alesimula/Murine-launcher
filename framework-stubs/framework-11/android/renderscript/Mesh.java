package android.renderscript;

public class Mesh extends android.renderscript.BaseObj {
    android.renderscript.Allocation[] mVertexBuffers;
    android.renderscript.Allocation[] mIndexBuffers;
    android.renderscript.Mesh.Primitive[] mPrimitives;
    Mesh(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public int getVertexAllocationCount() { return 0; }
    public android.renderscript.Allocation getVertexAllocation(int p0) { return null; }
    public int getPrimitiveCount() { return 0; }
    public android.renderscript.Allocation getIndexSetAllocation(int p0) { return null; }
    public android.renderscript.Mesh.Primitive getPrimitive(int p0) { return null; }
    void updateFromNative() {}

    public static class AllocationBuilder {
        android.renderscript.RenderScript mRS;
        int mVertexTypeCount;
        android.renderscript.Mesh.AllocationBuilder.Entry[] mVertexTypes;
        java.util.Vector mIndexTypes;
        public AllocationBuilder(android.renderscript.RenderScript p0) {}
        public int getCurrentVertexTypeIndex() { return 0; }
        public int getCurrentIndexSetIndex() { return 0; }
        public android.renderscript.Mesh.AllocationBuilder addVertexAllocation(android.renderscript.Allocation p0) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Mesh.AllocationBuilder addIndexSetAllocation(android.renderscript.Allocation p0, android.renderscript.Mesh.Primitive p1) { return null; }
        public android.renderscript.Mesh.AllocationBuilder addIndexSetType(android.renderscript.Mesh.Primitive p0) { return null; }
        public android.renderscript.Mesh create() { return null; }

        class Entry {
            android.renderscript.Allocation a;
            android.renderscript.Mesh.Primitive prim;
            Entry(android.renderscript.Mesh.AllocationBuilder p0) {}
        }
    }

    public static class Builder {
        android.renderscript.RenderScript mRS;
        int mUsage;
        int mVertexTypeCount;
        android.renderscript.Mesh.Builder.Entry[] mVertexTypes;
        java.util.Vector mIndexTypes;
        public Builder(android.renderscript.RenderScript p0, int p1) {}
        public int getCurrentVertexTypeIndex() { return 0; }
        public int getCurrentIndexSetIndex() { return 0; }
        public android.renderscript.Mesh.Builder addVertexType(android.renderscript.Type p0) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Mesh.Builder addVertexType(android.renderscript.Element p0, int p1) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Mesh.Builder addIndexSetType(android.renderscript.Type p0, android.renderscript.Mesh.Primitive p1) { return null; }
        public android.renderscript.Mesh.Builder addIndexSetType(android.renderscript.Mesh.Primitive p0) { return null; }
        public android.renderscript.Mesh.Builder addIndexSetType(android.renderscript.Element p0, int p1, android.renderscript.Mesh.Primitive p2) { return null; }
        android.renderscript.Type newType(android.renderscript.Element p0, int p1) { return null; }
        public android.renderscript.Mesh create() { return null; }

        class Entry {
            android.renderscript.Type t;
            android.renderscript.Element e;
            int size;
            android.renderscript.Mesh.Primitive prim;
            int usage;
            Entry(android.renderscript.Mesh.Builder p0) {}
        }
    }

    public static enum Primitive {
        POINT,
        LINE,
        LINE_STRIP,
        TRIANGLE,
        TRIANGLE_STRIP,
        TRIANGLE_FAN;
        int mID;
        private Primitive() {}
    }

    public static class TriangleMeshBuilder {
        float[] mVtxData;
        int mVtxCount;
        int mMaxIndex;
        short[] mIndexData;
        int mIndexCount;
        android.renderscript.RenderScript mRS;
        android.renderscript.Element mElement;
        float mNX;
        float mNY;
        float mNZ;
        float mS0;
        float mT0;
        float mR;
        float mG;
        float mB;
        float mA;
        int mVtxSize;
        int mFlags;
        public static final int COLOR = 1;
        public static final int NORMAL = 2;
        public static final int TEXTURE_0 = 256;
        public TriangleMeshBuilder(android.renderscript.RenderScript p0, int p1, int p2) {}
        private void makeSpace(int p0) {}
        private void latch() {}
        public android.renderscript.Mesh.TriangleMeshBuilder addVertex(float p0, float p1) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder addVertex(float p0, float p1, float p2) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder setTexture(float p0, float p1) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder setNormal(float p0, float p1, float p2) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder setColor(float p0, float p1, float p2, float p3) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder addTriangle(int p0, int p1, int p2) { return null; }
        public android.renderscript.Mesh create(boolean p0) { return null; }
    }
}
