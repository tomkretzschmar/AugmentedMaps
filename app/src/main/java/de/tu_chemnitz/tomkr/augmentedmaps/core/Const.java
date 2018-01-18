package de.tu_chemnitz.tomkr.augmentedmaps.core;

import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Tom Kretzschmar on 26.10.2017.
 */
@SuppressWarnings("WeakerAccess")
public class Const {

    public static Paint paintStroke;
    public static Paint paintFill;
    public static Paint paintFillRed;

    static {
        paintStroke = new Paint();
        paintStroke.setColor(Color.GREEN);
        paintStroke.setStyle(Paint.Style.STROKE);
        paintStroke.setStrokeWidth(2);
        paintStroke.setAntiAlias(true);
        paintStroke.setAlpha(255);

        paintFill = new Paint();
        paintFill.setColor(Color.GREEN);
        paintFill.setStyle(Paint.Style.FILL);
        paintFill.setAntiAlias(true);
        paintFill.setAlpha(255);
        paintFill.setTextAlign(Paint.Align.LEFT);
        paintFill.setTextSize(40);
        paintFill.setAntiAlias(true);

        paintFillRed = new Paint(paintFill);
        paintFillRed.setColor(Color.RED);
    }

    /**
     * Maximum count of calculating and refreshing marker positions per second.
     */
    public static final int TICKS_PER_SECOND = 20;
    public static final int TARGET_FRAMETIME = 1000 / TICKS_PER_SECOND;

    public static final int LOG_TIME = 30 * 1000;

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
    public static final int MSG_UPDATE_STATE_VIEW = 8;
    public static final int MSG_UPDATE_FPS_VIEW = 9;
    public static final int MSG_UPDATE_INFO_VIEW = 10;

    /**
     *
     */
    public static final int LOCATION_UPDATE_INTERVAL = 1000;

    /**
     *
     */
    public static final float LOCATION_UPDATE_DISTANCE = 10f;

    /**
     * Factor for lowPass filter in OrientationService
     */
    public static final float LOW_PASS_FAC = 0.20f;

    /**
     *
     */
    public static final float GYRO_FAC = 0.99f;

    /**
     *
     */
    public static final float OPTFLOW_FAC = 0.99f;

    /**
     *
     */
    public static final float IMAGE_SCALING_FACTOR = 4f;

    /**
     *
     */
    public static final int MAX_TRACKING_POINTS = 15;

    /**
     *
     */
    public static final int MIN_TRACKING_POINTS = 5;

    /**
     *
     */
    public static final float RELIABILITY_THRESHOLD = 5.0f;

    /**
     *
     */
    public static final float AGGREGATION_THRESHOLD = 0.04f;
}