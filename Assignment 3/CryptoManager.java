package assignment3;

import java.lang.StringBuilder;

/**
 * CMSC 203 Assignment 3 Spring 2020
 * 
 * This is the data manager class for the data encryption assignment
 * This class implements methods to check if string entered is in bounds, and 
 * it will encrypt and decrypt is using two different approache
 * 
 * @author Ramiz Vatan
 * @Date 03/09/2020
 */

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		//throw new RuntimeException("method not implemented");
		
		//checking to see if the text entered id within bounds.
		for (int i=0;i<plainText.length();i++) {
			if ((plainText.charAt(i)>UPPER_BOUND)||(plainText.charAt(i)<LOWER_BOUND)){
				return false;
			}
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an upper-case string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		//throw new RuntimeException("method not implemented");
		//forcing the text entered for Caesar to be upper-case
		plainText.toUpperCase();
		String encryptedText;
		StringBuilder sb1 = new StringBuilder();
		
		//encrypting the entered text via caesar method
		for (int i=0;i<plainText.length();i++) {
			int asciiVal1 = (int)plainText.charAt(i);
			int asciiVal2 = asciiVal1+key;
			if (asciiVal2>UPPER_BOUND) {
				asciiVal2 = asciiVal2 - RANGE;
			}
			char encryptedChar = (char) asciiVal2;
			sb1.append(encryptedChar);
		}
		encryptedText = sb1.toString();
		//returning the encrypted text 
		return encryptedText;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an upper-case string to be encrypted.
	 * @param bellasoStr an upper-case string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
		
		//forcing the entry texts for Bellaso to be upper-case
		plainText.toUpperCase();
		bellasoStr.toUpperCase();
		String remaining = "";
		String encryptedChar = "";
		
		//making the entered key string equal to the plainText in length 
		int i = 0;
		while (remaining.length()!=plainText.length()) {
			remaining = remaining + bellasoStr.charAt(i);
			i++;
			if (i==bellasoStr.length()) {
				i=0;
			}
		} 
		
		//coding the Bellaso method for encryption
		for(int j=0;j<plainText.length();j++) {
			int corresponding = plainText.charAt(j) + remaining.charAt(j); 
			if (corresponding>UPPER_BOUND) {
				corresponding = corresponding - RANGE;
			}
			encryptedChar = encryptedChar+(char)corresponding;
		}
		//returning the encrypted text
		return encryptedChar;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	
	
	public static String decryptCaesar(String encryptedText, int key) {
		//throw new RuntimeException("method not implemented");
		
		//forcing the text entered for Caesar to be upper-case
		encryptedText.toUpperCase();
		String decryptedText;
		StringBuilder sb3 = new StringBuilder();
		
		//the code to decrypt the entered text via Caesar method
		for (int i=0;i<encryptedText.length();i++) {
			int asciiVal1 = (int)encryptedText.charAt(i);
			int asciiVal2 = asciiVal1-key;
			if (asciiVal2<LOWER_BOUND) {
				asciiVal2 = asciiVal2 + RANGE;
			}
			char decryptedChar = (char) asciiVal2;
			sb3.append(decryptedChar);
		}
		decryptedText = sb3.toString();
		//returning the decrypted text
		return decryptedText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an upper-case string to be encrypted.
	 * @param bellasoStr an upper-case string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
		
		//forcing the entry texts for Bellaso to be upper-case
				encryptedText.toUpperCase();
				bellasoStr.toUpperCase();
				String remaining = "";
				String decryptedChar = "";
				
				//making the entered key string equal to the plainText in length 
				int i = 0;
				while (remaining.length()!=encryptedText.length()) {
					remaining = remaining + bellasoStr.charAt(i);
					i++;
					if (i==bellasoStr.length()) {
						i=0;
					}
				} 
				//coding the Bellaso method for encryption
				for(int j=0;j<encryptedText.length();j++) {
					int corresponding = encryptedText.charAt(j) - remaining.charAt(j); 
					if (corresponding<LOWER_BOUND) {
						corresponding = corresponding + RANGE;
					}
					decryptedChar = decryptedChar+(char)corresponding;
				}
				//returning the encrypted text
				return decryptedChar;
	}
}