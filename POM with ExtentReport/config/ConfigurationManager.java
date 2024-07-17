package config;

import org.aeonbits.owner.Config;


@Config.Sources("classpath:config.fr.properties")

public interface ConfigurationManager extends Config{

	@Key("clickLeads")
	String clickonLead();
	
	@Key("clickCreateLead")
	String clickonCreateLead();
	
}
