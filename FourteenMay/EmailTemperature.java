import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
import javax.mail.*;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.net.*;

public class EmailTemperature extends TimerTask {

	public static void main(String[] args) throws JSONException, IOException {
		try {
			Timer t = new Timer();
			t.schedule(new EmailTemperature(), 0, 9000);

			URL url = new URL("http://api.weatherstack.com/current?access_key=35c555c53386ce54e1413ce4ba7b12b3&query=New%20York&units=m");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
				
	        
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String res = br.readLine();
			   JSONObject obj1 = new JSONObject(res);
			String host="smtp.gmail.com"; 
			final String user="From Email id"; 
			final String password="Password";  
			    
			String to="To Email id";  
			Properties props = new Properties();  
			props.put("mail.smtp.auth", "true");  
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host",host);  
			props.put("mail.smtp.port", "Port no"); 
				
			Session session = Session.getDefaultInstance(props, 
					new javax.mail.Authenticator() {  
				protected PasswordAuthentication getPasswordAuthentication() {  
					return new PasswordAuthentication(user,password);  
				}  
			});
			   
			try {  
					MimeMessage message = new MimeMessage(session);  
					message.setFrom(new InternetAddress(user));  
					message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
					message.setSubject("Temperature Details: ");  
					message.setText("City: "
				    		+obj1.getJSONObject("location").getString("name")+"\nCurrent Temperature: "+obj1.getJSONObject("current").getString("temperature"));  
						
					Transport.send(message);  
						
					System.out.println("message sent successfully...");  
						
			} catch (MessagingException e) {e.printStackTrace();}  
				
			conn.disconnect();
				
      	} catch (MalformedURLException e) {
	      			
      		e.printStackTrace();
	      			
      	} catch (IOException e) {
	      			
      		e.printStackTrace();
	      			
      	}
	}
	@Override
	   public void run() {
	}
}
