package com.infotel.gestionbiblio.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.infotel.gestionbiblio.service.inter.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

    public NotificationServiceImpl() {
	FileInputStream serviceAccount;
	try {
	    serviceAccount = new FileInputStream("firebase-key.json");

	    FirebaseOptions options = new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(serviceAccount)).setDatabaseUrl("https://gdg-webchatapp.firebaseio.com/").build();

	    FirebaseApp.initializeApp(options);

	    System.out.println("\\o/!!! FIREBASE INITIALIZED ");

	} catch (IOException e) {
	    System.out.println("DAMN!!! ERROR INITIALIZING FIREBASE");
	    e.printStackTrace();
	}

    }

    @Override
    public void sendNotification() {
	System.out.println("=================NOTIFICATION");
	// This registration token comes from the client FCM SDKs.
	String registrationToken = "YOUR_REGISTRATION_TOKEN";

	// See documentation on defining a message payload.
	Message message = Message.builder().putData("score", "850").putData("time", "2:45").setToken(registrationToken).build();

	// Send a message to the device corresponding to the provided
	// registration token.
	String response;
	try {
	    response = FirebaseMessaging.getInstance().sendAsync(message).get();

	    // Response is a message ID string.
	    System.out.println("Successfully sent message: " + response);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (ExecutionException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}
