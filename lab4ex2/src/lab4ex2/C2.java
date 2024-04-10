package lab4ex2;

import org.json.JSONException;
import org.json.JSONObject;

public class C2 {
 private JSONObject json;

 public C2(String jsonString) throws JSONException {
     this.json = new JSONObject(jsonString);
 }

 public int getNumber(String key) {
	    try {
	        return json.getInt(key);
	    } catch (JSONException e) {
	        e.printStackTrace();
	        return 0;
	    }
	}
}