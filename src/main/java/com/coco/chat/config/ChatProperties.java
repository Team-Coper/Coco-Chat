package com.coco.chat.config;

import java.util.Set;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "chat")
class ChatProperties {

	private int maxProfanityLevel;
	
	private Set<String> disallowedWords;
	
	private Destinations destinations;
	
	
	public int getMaxProfanityLevel() {
		return maxProfanityLevel;
	}

	public void setMaxProfanityLevel(int maxProfanityLevel) {
		this.maxProfanityLevel = maxProfanityLevel;
	}
	
	public Set<String> getDisallowedWords() {
		return disallowedWords;
	}

	public void setDisallowedWords(Set<String> disallowedWords) {
		this.disallowedWords = disallowedWords;
	}

	public Destinations getDestinations() {
		return destinations;
	}

	public void setDestinations(Destinations destinations) {
		this.destinations = destinations;
	}


	static class Destinations {

		private String login;
		
		private String logout;

		public String getLogin() {
			System.out.println("[Destinations/getLogin()]: " + login);
			return login;
		}

		public void setLogin(String login) {
			System.out.println("[Destinations/setLogin()]: " + login);
			this.login = login;
		}

		public String getLogout() {
			System.out.println("[Destinations/getLogout()]: " + logout);
			return logout;
		}

		public void setLogout(String logout) {
			System.out.println("[Destinations/setLogout()]: " + logout);
			this.logout = logout;
		}
	}
}
