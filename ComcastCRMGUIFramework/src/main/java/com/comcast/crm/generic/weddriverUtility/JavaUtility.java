package com.comcast.crm.generic.weddriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility
{
	public int getRandomNumber() {
		Random random=new Random();
		int random_num = random.nextInt(1000);
		return random_num;
	}
	
  public String getSystemDateYYYYMMDD()
  {
	  Date dateobj= new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String Date =sim.format(dateobj);
	return Date;
	  
  }
  
  public String getRequiredDateYYYYMMDD(int days)
  {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		 Date dateobj= new Date();	
		 sim.format(dateobj);
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days); 
		String reqDate= sim.format(cal.getTime());
		return reqDate;
  }
}
