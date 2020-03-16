package com.improving.webhooktest.controller;

import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACc9ed26dc5c89100450b2b488e52431e7";
  public static final String AUTH_TOKEN = "f1cb1887c0375c6a7552ec27ea3f6a3c";

  public static void main(String[] args) throws URISyntaxException {
		/*
		 * Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		 * 
		 * Message message = Message.creator(new PhoneNumber("+5598991766843"), new
		 * PhoneNumber("+17327846691"),
		 * "This is the ship that made the Kessel Run in fourteen parsecs?").create();
		 * 
		 * System.out.println(message.getSid());
		 */
	  
	   Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

       String from = "+17327846691";
       String to = "+5598991766843";

       Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
               new URI("http://demo.twilio.com/docs/voice.xml")).create();

       System.out.println(call.getSid());
  }
}