package section6.geo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Hello world!
 *
 */
public class App 
{
	
//	"http://api.timezonedb.com/v2.1/get-time-zone?key=V2FTB5OH0POM&format=json&by=position&lat=-27.466\r\n" + 
//	 		"&lng=153.033"
	
	public static GeocoderResponse getGeocoderResponse(String lat,String lng) {
		
		String url = "http://api.timezonedb.com/v2.1/get-time-zone?key=V2FTB5OH0POM&format=json&by=position&lat=" + lat + "&lng=" + lng;
		Request request = new Request.Builder().url(url).build();
		
		System.out.println( "Hello World!" );
        OkHttpClient client = new OkHttpClient();
        Gson gson;
        gson = new GsonBuilder().create();
        
        
        
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful())
                throw new IOException("Unexpected code: " + response);
           System.out.println("Hi");
           //System.out.println(response.body().string());
           
           ResponseBody body = response.body();
		GeocoderResponse result = gson.fromJson(
                   body.charStream(), GeocoderResponse.class);
           return result;
           
        } catch (IOException e) {
            e.printStackTrace();
        }
		return null;
		
		
	}
    public static void main( String[] args )
    {
    
    	
    	GeocoderResponse geocoderResponse = getGeocoderResponse("-36.973148","174.854659");
		System.out.println(geocoderResponse.getAbbreviation());
    	
    	long utcTime = 1556883825000L;
    	
    	Date date = new Date(utcTime);
    	System.out.println(date);
    	
    	final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm z Z");
    	
    	f.setTimeZone(TimeZone.getTimeZone(geocoderResponse.getZoneName()));
		System.out.println(f.format(date));
    	
    	
        
    }
}
