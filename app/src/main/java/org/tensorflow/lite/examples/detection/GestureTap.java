package org.tensorflow.lite.examples.detection;

import android.view.GestureDetector;
import android.view.MotionEvent;

import org.tensorflow.lite.examples.detection.env.Logger;

class GestureTap extends GestureDetector.SimpleOnGestureListener {
    private static final Logger LOGGER = new Logger();
    public boolean wasTapped = false;

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        LOGGER.i("onDoubleTap :", "" + e.getAction());
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        LOGGER.i("onSingleTap :", "" + e.getAction());
        wasTapped = true;
        return true;
    }
}