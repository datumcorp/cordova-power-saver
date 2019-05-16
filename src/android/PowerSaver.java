package com.vukstankovic;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class PowerSaver extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("isPowerSaverEnabled")) {
            String message = args.getString(0);
            this.isPowerSaverEnabled(message, callbackContext);
            return true;
        }
        return false;
    }

    private void isPowerSaverEnabled(String message, CallbackContext callbackContext) {
        PowerManager powerManager = (PowerManager) this.cordova.getActivity().getSystemService(Context.POWER_SERVICE);
        final String result = Settings.System.getString(getContentResolver(), "psm_switch");
        if ( powerManager.isPowerSaveMode() || result.equals("1")) {
            callbackContext.success('1');
        } else {
            callbackContext.success('0');
        }
    }
}
