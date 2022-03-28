package Pack;
import java.awt.Event;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;

class Date {
	int Day = 1;
	int Month = 1;
	int Year = 2000;
	
	public String Get() {
		return Day + "." + Month + "." + Year;
	}
	
	public void Set(int new_day, int new_month, int new_year) {
		this.Day = new_day;
		this.Month = new_month;
		this.Year = new_year;
	}
}

class Student {
	int Age = 20;
	String FullName = "Krasovitsky Michael";
	Date Birthday_date;
	Double Rating = 6.2; 
	
	public String GetInfo() {
		return "\"Student {" + "Name='" + FullName + '\'' + ", Age=" + Age + ", Rating='" + Rating + ", Birthday_date=" + Birthday_date + '\'' + "}\"";
	}
	
	public void Set(int new_age, String new_name, Date new_date, Double new_rate) {
		this.Age = new_age;
		this.FullName = new_name;
		this.Birthday_date = new_date;
		this.Rating = new_rate;
	}
}

public class ExClass {
	
	public static void main(String[] args) throws JSONException, IOException {
		Student st = new Student();
		Date d = new Date();
		d.Set(13, 6, 2001);
		st.Set(20, "Krasovitsky Michael", d, 6.3);
		
		File file = new File("C:\\DB\\five.vip");
		
		FileWriter writer = new FileWriter (file);
		writer.write(st.GetInfo());
		writer.close();
		
		
		FileReader x = new FileReader("C:\\DB\\five.vip");
	    BufferedReader varRead = new BufferedReader(x);
	    
    	System.out.println(varRead.readLine());
	    varRead.close();
		System.out.println("End");
	}
	

}
