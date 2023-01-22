package time_conversion_by_country;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



public class TimeConversion 
{

	public static void main(String[] args) 
	{

		//Geeting Calendar Instance 
		Calendar calendar= Calendar.getInstance();
		Date date = calendar.getTime();


		//Getting DateFormat Instance
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

	    //Setting Time for Europe/London
        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Time in Europe: :"); 
	    System.out.println(dateFormat. format(date));

	    //Setting Time for Asia/Calcutta 
	    dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta")); 
	    System.out.println("Time in Asia::");
        System.out.println(dateFormat.format(date));

	}
}
