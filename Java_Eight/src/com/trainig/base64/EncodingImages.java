package com.trainig.base64;

import java.io.*;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingImages {

	public static void imageEncoding(){
		
		try {
			
			Encoder encoder =   Base64.getMimeEncoder();
	        
			InputStream is = new FileInputStream("java.png"); 
			
	        OutputStream os1 = encoder.wrap(new FileOutputStream("java.enc")); 
	
	        int myByte; 
	        while((myByte = is.read()) != -1) { 
	        	os1.write(myByte); 
	        }
	        
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args)  {

			
		try {
		
			Decoder decoder =   Base64.getMimeDecoder();
	        
			InputStream is2 =decoder.wrap( new FileInputStream("java.enc"));
			
	        OutputStream os2 = (new FileOutputStream("decodedjava.png")); 


	        int myByte; 
	        while ((myByte = is2.read()) != -1) 
	        {
	        	os2.write(myByte); 
	        }
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
        

	}

}


