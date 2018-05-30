package com.trainig.base64;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Base64.Encoder;

import org.w3c.dom.ranges.RangeException;

public class BasicEncoding {

	
	public static void main(String[] args) {
		try {
			
		      String encodedBytes = Base64.getEncoder().encodeToString("Hello World".getBytes("utf-8"));
		      System.out.println("encodedBytes " + encodedBytes);

		      byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
		      System.out.println("decodedBytes " + new String(decodedBytes));
		      

		        
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
	}

}
