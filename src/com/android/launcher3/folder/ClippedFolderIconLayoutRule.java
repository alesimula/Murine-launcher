package com.android.launcher3.folder;

import com.android.launcher3.Flags;
import com.android.launcher3.model.data.FolderInfo;

public class ClippedFolderIconLayoutRule {

    public static final int MAX_NUM_ITEMS_IN_PREVIEW = 4;
    /** Preview capacity of a super folder (2x2 cells, 3x3 icons). */
    public static final int MAX_NUM_ITEMS_IN_LARGE_PREVIEW = 9;
    private static final int MIN_NUM_ITEMS_IN_PREVIEW = 2;

    // Super folder preview: icon size and spacing as a fraction of the preview area.
    private static final float LARGE_SCALE = 0.245f;
    private static final float LARGE_STEP = 0.30f;
    private static final float LARGE_START = 0.0775f;

    // Quadrant style: 3 big icons + a 2x2 cluster of mini icons in the 4th quadrant.
    private static final float QUAD_BIG = 0.32f;
    private static final float QUAD_NEAR = 0.11f;
    private static final float QUAD_FAR = 0.57f;
    private static final float QUAD_MINI = 0.14f;
    private static final float QUAD_MINI_START = 0.575f;
    private static final float QUAD_MINI_STEP = 0.17f;
    // Circle style: up to 8 icons on a ring. Cover style: one big icon.
    private static final float CIRCLE_SCALE = 0.20f;
    private static final float CIRCLE_RADIUS = 0.31f;
    private static final float COVER_SCALE = 0.52f;

    private boolean mLarge = false;
    private int mStyle = FolderInfo.STYLE_QUADRANT;
    private final float[] mLargeTmp = new float[3];

    /** How many icons a super folder of the given style shows. */
    public static int maxItemsForStyle(int style) {
        switch (style) {
            case FolderInfo.STYLE_GRID:
                return 9;
            case FolderInfo.STYLE_CIRCLE:
                return 8;
            case FolderInfo.STYLE_COVER:
                return 1;
            default:
                return 7;
        }
    }

    /** One of {@link FolderInfo#STYLE_QUADRANT} etc.; only matters when {@link #setLarge}. */
    public void setStyle(int style) {
        mStyle = style;
    }

    private static float largeBaseScale(int style) {
        switch (style) {
            case FolderInfo.STYLE_GRID:
                return LARGE_SCALE;
            case FolderInfo.STYLE_CIRCLE:
                return CIRCLE_SCALE;
            case FolderInfo.STYLE_COVER:
                return COVER_SCALE;
            default:
                return QUAD_BIG;
        }
    }

    /** Fills out[] with left, top and scale of the icon, all as fractions of the preview. */
    private void largePlacement(int index, float[] out) {
        float base = largeBaseScale(mStyle);
        if (index == EXIT_INDEX || index == ENTER_INDEX) {
            out[0] = 1.02f;
            out[1] = index == EXIT_INDEX ? 0.05f : 0.60f;
            out[2] = base;
            return;
        }
        if (index < 0 || index >= maxItemsForStyle(mStyle)) {
            // Items beyond those displayed in the preview are animated to the center
            out[2] = base;
            out[0] = out[1] = 0.5f - base / 2f;
            return;
        }
        switch (mStyle) {
            case FolderInfo.STYLE_GRID:
                out[2] = LARGE_SCALE;
                out[0] = LARGE_START + (index % 3) * LARGE_STEP;
                out[1] = LARGE_START + (index / 3) * LARGE_STEP;
                break;
            case FolderInfo.STYLE_CIRCLE: {
                double angle = -Math.PI / 2 + index * (Math.PI / 4);
                out[2] = CIRCLE_SCALE;
                out[0] = 0.5f + (float) (CIRCLE_RADIUS * Math.cos(angle)) - CIRCLE_SCALE / 2f;
                out[1] = 0.5f + (float) (CIRCLE_RADIUS * Math.sin(angle)) - CIRCLE_SCALE / 2f;
                break;
            }
            case FolderInfo.STYLE_COVER:
                out[2] = COVER_SCALE;
                out[0] = out[1] = 0.5f - COVER_SCALE / 2f;
                break;
            default:
                if (index < 3) {
                    out[2] = QUAD_BIG;
                    out[0] = index == 1 ? QUAD_FAR : QUAD_NEAR;
                    out[1] = index == 2 ? QUAD_FAR : QUAD_NEAR;
                } else {
                    int i = index - 3;
                    out[2] = QUAD_MINI;
                    out[0] = QUAD_MINI_START + (i % 2) * QUAD_MINI_STEP;
                    out[1] = QUAD_MINI_START + (i / 2) * QUAD_MINI_STEP;
                }
                break;
        }
    }

    private PreviewItemDrawingParams computeLargeParams(int index,
            PreviewItemDrawingParams params) {
        largePlacement(index, mLargeTmp);
        float left = mLargeTmp[0];
        float top = mLargeTmp[1];
        float s = mLargeTmp[2];
        if (mIsRtl) {
            left = 1f - left - s;
        }
        float transX = mAvailableSpace * left;
        float transY = mAvailableSpace * top;
        float scale = s * mBaselineIconScale;
        if (params == null) {
            params = new PreviewItemDrawingParams(transX, transY, scale);
        } else {
            params.update(transX, transY, scale);
        }
        return params;
    }

    /** true for super folders: always a 3x3 grid of big icons. */
    public void setLarge(boolean large) {
        mLarge = large;
    }

    private static final float MIN_SCALE = 0.44f;
    private static final float MAX_SCALE = 0.51f;
    // TODO: figure out exact radius for different icons
    private static final float MAX_RADIUS_DILATION_SHAPES = 0.15f;
    private static final float MAX_RADIUS_DILATION = 0.25f;
    // The max amount of overlap the preview items can go outside of the background bounds.
    public static final float ICON_OVERLAP_FACTOR = 1 + (MAX_RADIUS_DILATION / 2f);
    public static final float ICON_OVERLAP_FACTOR_SHAPES = 1f;
    private static final float ITEM_RADIUS_SCALE_FACTOR = 1.15f;

    public static final int EXIT_INDEX = -2;
    public static final int ENTER_INDEX = -3;

    private float[] mTmpPoint = new float[2];

    private float mAvailableSpace;
    private float mRadius;
    private float mIconSize;
    private boolean mIsRtl;
    private float mBaselineIconScale;

    public void init(int availableSpace, float intrinsicIconSize, boolean rtl) {
        mAvailableSpace = availableSpace;
        mRadius = ITEM_RADIUS_SCALE_FACTOR * availableSpace / 2f;
        mIconSize = intrinsicIconSize;
        mIsRtl = rtl;
        mBaselineIconScale = availableSpace / intrinsicIconSize;
    }

    public PreviewItemDrawingParams computePreviewItemDrawingParams(int index, int curNumItems,
            PreviewItemDrawingParams params) {
        if (mLarge) {
            return computeLargeParams(index, params);
        }
        float totalScale = scaleForItem(curNumItems);
        float transX;
        float transY;
        boolean grid3 = mLarge;
        int visibleLimit = grid3
                ? MAX_NUM_ITEMS_IN_LARGE_PREVIEW : MAX_NUM_ITEMS_IN_PREVIEW;

        if (index == EXIT_INDEX) {
            // 0 1 * <-- Exit position (row 0, col 2)
            // 2 3
            if (grid3) {
                getGrid3Position(0, 3, mTmpPoint);
            } else {
                getGridPosition(0, 2, mTmpPoint);
            }
        } else if (index == ENTER_INDEX) {
            // 0 1
            // 2 3 * <-- Enter position (row 1, col 2)
            if (grid3) {
                getGrid3Position(2, 3, mTmpPoint);
            } else {
                getGridPosition(1, 2, mTmpPoint);
            }
        } else if (index >= visibleLimit) {
            // Items beyond those displayed in the preview are animated to the center
            mTmpPoint[0] = mTmpPoint[1] = mAvailableSpace / 2 - (mIconSize * totalScale) / 2;
        } else if (grid3) {
            // 0 1 2
            // 3 4 5
            // 6 7 8
            getGrid3Position(index / 3, index % 3, mTmpPoint);
        } else if (Flags.enableLauncherIconShapes()) {
            if (index == 0) {
                // top left
                getGridPosition(0, 0, mTmpPoint);
            } else if (index == 1) {
                // top right
                getGridPosition(0, 1, mTmpPoint);
            } else if (index == 2) {
                // bottom left
                getGridPosition(1, 0, mTmpPoint);
            } else if (index == 3) {
                // bottom right
                getGridPosition(1, 1, mTmpPoint);
            }
        } else {
            getPosition(index, curNumItems, mTmpPoint);
        }

        transX = mTmpPoint[0];
        transY = mTmpPoint[1];

        if (params == null) {
            params = new PreviewItemDrawingParams(transX, transY, totalScale);
        } else {
            params.update(transX, transY, totalScale);
        }
        return params;
    }

    /**
     * Builds a grid based on the positioning of the items when there are
     * {@link #MAX_NUM_ITEMS_IN_PREVIEW} in the preview.
     *
     * Positions in the grid: 0 1  // 0 is row 0, col 1
     *                        2 3  // 3 is row 1, col 1
     */
    private void getGridPosition(int row, int col, float[] result) {
        // We use position 0 and 3 to calculate the x and y distances between items.
        getPosition(0, 4, result);
        float left = result[0];
        float top = result[1];

        getPosition(3, 4, result);
        float dx = result[0] - left;
        float dy = result[1] - top;

        result[0] = left + (col * dx);
        result[1] = top + (row * dy);
    }

    /**
     * Position (top-left of the icon) of the given cell in the 3x3 preview grid. Column 3 / row 3
     * (outside the grid) is used for the enter / exit animations. Mirrored in RTL.
     */
    private void getGrid3Position(int row, int col, float[] result) {
        if (mIsRtl) {
            col = 2 - col;
        }
        result[0] = mAvailableSpace * (LARGE_START + col * LARGE_STEP);
        result[1] = mAvailableSpace * (LARGE_START + row * LARGE_STEP);
    }

    // b/392610664 TODO: Change positioning from circular geometry to square / grid-based.
    private void getPosition(int index, int curNumItems, float[] result) {
        // The case of two items is homomorphic to the case of one.
        curNumItems = Math.max(curNumItems, 2);

        // We model the preview as a circle of items starting in the appropriate piece of the
        // upper left quadrant (to achieve horizontal and vertical symmetry).
        double theta0 = mIsRtl ? 0 : Math.PI;

        // In RTL we go counterclockwise
        int direction = mIsRtl ? 1 : -1;

        double thetaShift = 0;
        if (curNumItems == 3) {
            thetaShift = Math.PI / 2;
        } else if (curNumItems == 4) {
            thetaShift = Math.PI / 4;
        }
        theta0 += direction * thetaShift;

        // We want the items to appear in reading order. For the case of 1, 2 and 3 items, this
        // is natural for the circular model. With 4 items, however, we need to swap the 3rd and
        // 4th indices to achieve reading order.
        if (curNumItems == 4 && index == 3) {
            index = 2;
        } else if (curNumItems == 4 && index == 2) {
            index = 3;
        }

        // We bump the radius up between 0 and MAX_RADIUS_DILATION % as the number of items increase
        float radiusDilation = Flags.enableLauncherIconShapes() ? MAX_RADIUS_DILATION_SHAPES
                : MAX_RADIUS_DILATION;
        float radius = mRadius * (1 + radiusDilation * (curNumItems - MIN_NUM_ITEMS_IN_PREVIEW)
                / (MAX_NUM_ITEMS_IN_PREVIEW - MIN_NUM_ITEMS_IN_PREVIEW));
        double theta = theta0 + index * (2 * Math.PI / curNumItems) * direction;

        float halfIconSize = (mIconSize * scaleForItem(curNumItems)) / 2;

        // Map the location along the circle, and offset the coordinates to represent the center
        // of the icon, and to be based from the top / left of the preview area. The y component
        // is inverted to match the coordinate system.
        result[0] = mAvailableSpace / 2 + (float) (radius * Math.cos(theta) / 2) - halfIconSize;
        result[1] = mAvailableSpace / 2 + (float) (- radius * Math.sin(theta) / 2) - halfIconSize;

    }

    public float scaleForItem(int numItems) {
        // Scale is determined by the number of items in the preview.
        if (mLarge) {
            return largeBaseScale(mStyle) * mBaselineIconScale;
        }
        final float scale;
        if (numItems <= 3 && !Flags.enableLauncherIconShapes()) {
            scale = MAX_SCALE;
        } else {
            scale = MIN_SCALE;
        }
        return scale * mBaselineIconScale;
    }

    public float getIconSize() {
        return mIconSize;
    }

    /**
     * Gets correct constant for icon overlap.
     */
    public static float getIconOverlapFactor() {
        if (Flags.enableLauncherIconShapes()) {
            return ICON_OVERLAP_FACTOR_SHAPES;
        } else {
            return ICON_OVERLAP_FACTOR;
        }
    }
}
