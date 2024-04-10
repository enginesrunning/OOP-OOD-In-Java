
package lab4ex1;


import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;



/*
 * Utilizați Singleton Pattern într-o clasă Config, pentru a accesa date dintr-un fișier
(optional) JSON, considerat a fi de configurare. Fișierul conține o setare pentru string color în format
#RRGGBB și int weight. Conținutul fișierului poate fi: {"color":"#F3AA34","weight": 23}. Clasa Config are
membrii publici getColor si getWeight prin care permite accesul la variabilele menționate. Clasa citește
datele din fișier doar la prima accesare.
 */

public class Config {
    private static Config instance;
    private String color;
    private int weight;
    private boolean initialized;

    private Config() {
        initialized = false;
    }

    public static synchronized Config getInstance() { /*race condition, doua thread-uri sau mai multe
    incearca sa updateze data distribuita simultan
    sincronizeaza acces thread la data distribuita
    */
    	
    	//procesor
        if (instance == null) {
            instance = new Config(); //
        }
        return instance;
    }

    private synchronized void loadConfig() throws JSONException {
        if (!initialized) {
            try {
                FileReader reader = new FileReader("fisierJSON.json");
                JSONTokener tokener = new JSONTokener(reader);
                JSONObject json = new JSONObject(tokener);
                color = json.getString("color");
                weight = json.getInt("weight");
                initialized = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized String getColor() {
        try {
			loadConfig();
		} catch (JSONException e) {
			e.printStackTrace();
		}
        return color;
    }

    public synchronized int getWeight() {
        try {
			loadConfig();
		} catch (JSONException e) {
			e.printStackTrace();
		}
        return weight;
    }

    public static void main(String[] args) {
        Config config = Config.getInstance();
        System.out.println("Color: " + config.getColor());
        System.out.println("Weight: " + config.getWeight());
    }
}
