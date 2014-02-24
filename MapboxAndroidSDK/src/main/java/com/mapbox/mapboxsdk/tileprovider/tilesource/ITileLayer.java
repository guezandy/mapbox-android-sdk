package com.mapbox.mapboxsdk.tileprovider.tilesource;

import java.io.InputStream;

import com.mapbox.mapboxsdk.tileprovider.util.LowMemoryException;

import android.graphics.drawable.Drawable;

public interface ITileLayer {

    /**
     * An ordinal identifier for this tile source
     *
     * @return the ordinal value
     */
    int ordinal();

    /**
     * Get a rendered Drawable from the specified InputStream.
     *
     * @param aTileInputStream an InputStream
     * @return the rendered Drawable
     */
    Drawable getDrawable(InputStream aTileInputStream) throws LowMemoryException;

    /**
     * Get the minimum zoom level this tile source can provide.
     *
     * @return the minimum zoom level
     */
    public int getMinimumZoomLevel();

    /**
     * Get the maximum zoom level this tile source can provide.
     *
     * @return the maximum zoom level
     */
    public int getMaximumZoomLevel();

    /**
     * Get the tile size in pixels this tile source provides.
     *
     * @return the tile size in pixels
     */
    public int getTileSizePixels();
}