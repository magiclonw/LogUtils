package com.magiclon.logutilslibrary.baselog;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import static com.magiclon.logutilslibrary.baselog.KLog.D;
import static com.magiclon.logutilslibrary.baselog.KLog.E;
import static com.magiclon.logutilslibrary.baselog.KLog.I;
import static com.magiclon.logutilslibrary.baselog.KLog.W;


/**
 * Created by admin
 */
public class JsonLog {

    public static void printJson(int type, String tag, String msg, String headString) {

        String message;

        try {
            if (msg.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(msg);
                message = jsonObject.toString(KLog.JSON_INDENT);
            } else if (msg.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(msg);
                message = jsonArray.toString(KLog.JSON_INDENT);
            } else {
                message = msg;
            }
        } catch (JSONException e) {
            message = msg;
        }

        KLogUtil.printLine(type, tag, true);
        message = headString + KLog.LINE_SEPARATOR + message;
        String[] lines = message.split(KLog.LINE_SEPARATOR);
        for (String line : lines) {
            switch (type) {
                case D:
                    Log.d(tag, "║ " + line);
                    break;
                case E:
                    Log.e(tag, "║ " + line);
                    break;
                case W:
                    Log.w(tag, "║ " + line);
                    break;
                case I:
                    Log.i(tag, "║ " + line);
                    break;
            }
        }
        KLogUtil.printLine(type, tag, false);
    }

    public static void printJson(String tag, String msg, String headString) {

        String message;

        try {
            if (msg.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(msg);
                message = jsonObject.toString(KLog.JSON_INDENT);
            } else if (msg.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(msg);
                message = jsonArray.toString(KLog.JSON_INDENT);
            } else {
                message = msg;
            }
        } catch (JSONException e) {
            message = msg;
        }

        KLogUtil.printLine(tag, true);
        message = headString + KLog.LINE_SEPARATOR + message;
        String[] lines = message.split(KLog.LINE_SEPARATOR);
        for (String line : lines) {
            Log.d(tag, "║ " + line);
        }
        KLogUtil.printLine(tag, false);
    }
}
