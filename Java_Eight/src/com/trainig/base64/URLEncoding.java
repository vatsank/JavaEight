package com.trainig.base64;

import java.util.Base64;

public class URLEncoding {

	public static void main(String[] args) {
			
		String originalURL = "https://www.google.co.in/search?q=base64+encoding&oq=base64+encoding";
		
		String encodedUrl = Base64.getUrlEncoder().encodeToString(originalURL.getBytes());

		byte[] decodedBytes2 = Base64.getUrlDecoder().decode(encodedUrl);
		String decodedUrl = new String(decodedBytes2);

		System.out.println(encodedUrl);

		System.out.println(decodedUrl);

	}

}
