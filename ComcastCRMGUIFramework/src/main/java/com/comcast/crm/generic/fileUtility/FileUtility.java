package com.comcast.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility 
{
public String getDataFromPropertiesFile(String key) throws Throwable
{
	FileInputStream fis =new FileInputStream("./configAppData/commonData.properties");
	Properties pobj= new Properties();
	pobj.load(fis);
	String data= pobj.getProperty(key);
	return data;
	}
}
