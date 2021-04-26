package com.newHayesUI.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;

	public ConfigDataProvider(String configPath) {
		File src = new File(configPath);

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to load config file" + e.getMessage());
		}
	}

	public String getDataFromConfig(String ketToSearch) {
		return prop.getProperty(ketToSearch);
	}

	public String getBrowser() {
		return prop.getProperty("Browser");
	}

	public String getURL() {
		return prop.getProperty("majorURL");
	}

}
