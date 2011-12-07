package ru.medved.json.wssoap;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.jorphan.logging.LoggingManager;
import org.apache.log.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ConfigReader {
	private static final Logger log = LoggingManager.getLoggerForClass();

	public ConfigReader() {
		super();
	}
	
	public WSSOAPConfig readConfig(String file, String section) {
		try {
			String json = FileUtils.readFileToString(new File(file));
			log.info("json : \n"+json);
			Gson gson = new Gson();
			Type type = new TypeToken<Map<String,WSSOAPConfig>>(){}.getType();
			
			Map<String,WSSOAPConfig> configz = gson.fromJson(json, type);
			WSSOAPConfig cfg = configz.get(section);
			if(cfg!=null){
				cfg.setSection(section);
			}
			else{
				throw new RuntimeException("section["+section+"] not found in config file ["+file+"]");
			}			
			return cfg;
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
