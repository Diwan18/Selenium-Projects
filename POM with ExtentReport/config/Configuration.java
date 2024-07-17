package config;

import org.aeonbits.owner.ConfigCache;

public class Configuration {

	
	public static ConfigurationManager configuartion() {
		return ConfigCache.getOrCreate(ConfigurationManager.class);
		
	}
}
