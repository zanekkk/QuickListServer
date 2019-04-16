package pl.kenazcode.QuickListServer;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class ResponseContent {

    private static final String RESULT_MESSAGE = "resultMessage";
    private static final String REQUESTED_INFO = "requestedInfo";

    public static String createResultMessage(ResponseMessages message) throws JSONException {
        JSONObject result = new JSONObject();
        result.put(RESULT_MESSAGE, message.getMessage());
        return result.toString();
    }
    public static String createResultMessage(ResponseMessages message, JSONObject requestedInfo) throws JSONException {
        JSONObject result = new JSONObject();
        result.put(RESULT_MESSAGE, message.getMessage());
        result.put(REQUESTED_INFO, requestedInfo);
        return result.toString();
    }

}
