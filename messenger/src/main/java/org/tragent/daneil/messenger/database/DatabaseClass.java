package org.tragent.daneil.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.tragent.daneil.messenger.model.Messages;
import org.tragent.daneil.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Messages> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Messages> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
