package com.android.internal.telephony.cat;

public class ImageDescriptor {
    int mWidth;
    int mHeight;
    int mCodingScheme;
    int mImageId;
    int mHighOffset;
    int mLowOffset;
    int mLength;
    static final int CODING_SCHEME_BASIC = 17;
    static final int CODING_SCHEME_COLOUR = 33;
    ImageDescriptor() {}
    static com.android.internal.telephony.cat.ImageDescriptor parse(byte[] p0, int p1) { return null; }
}
