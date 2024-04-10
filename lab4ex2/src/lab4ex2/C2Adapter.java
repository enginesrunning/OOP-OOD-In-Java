package lab4ex2;

import org.json.JSONException;

public class C2Adapter extends C1 {
 private C2 c2;

 public C2Adapter(String jsonString) {
	    try {
	        c2 = new C2(jsonString); //main
	    } catch (JSONException e) {
	        e.printStackTrace();
	        throw new RuntimeException("Failed to create C2 object", e);
	    }
	}


 @Override
 public void readNumbers() {
 }

 @Override
 public int getSum() {
     int num1 = c2.getNumber("n1");
     int num2 = c2.getNumber("n2");
     return num1 + num2;
 }
}
