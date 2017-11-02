package de.tu_chemnitz.tomkr.augmentedmaps.core;

/**
 * Created by Tom Kretzschmar on 26.10.2017.
 *
 */

public class Constants {
    /**
     * Maximum count of calculating and refreshing marker positions per second.
     */
    public static final int TICKS_PER_SECOND = 20;
    public static final int TARGET_FRAMETIME = 1000/TICKS_PER_SECOND;

    /**
     * Maximum distance in meters in which MapNodes are allocated.
     */
    public static final int MAX_DISTANCE = 10000;

    /**
     * Distance in meters after which new MapNodes are allocated.
     */
    public static final float DIST_THRESHOLD = 500;

    /**
     * Message indexing constants.
     */
    public static final int MSG_UPDATE_VIEW = 1;
    public static final int MSG_UPDATE_LOC_VIEW = 2;
    public static final int MSG_UPDATE_ORIENTATION_VIEW = 3;
    public static final int MSG_UPDATE_MAPNODES = 4;
    public static final int MSG_PROCESS_DATA = 5;
    public static final int MSG_UPDATE_OWN_HEIGHT = 6;
    public static final int MSG_UPDATE_NODE_HEIGHT = 7;

    /**
     * Factor for lowPass Filter in OrientationService
     */
    public static final float LOW_PASS_FACTOR = 0.25f;

    /**
     *
     */
    public static final int LOCATION_UPDATE_INTERVAL = 1000;

    /**
     *
     */
    public static final float LOCATION_UPDATE_DISTANCE = 10f;
}