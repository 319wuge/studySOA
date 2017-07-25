package com.wuge.study.utils;

import com.google.common.io.BaseEncoding;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cryptor {
	private final SecretKey secretKey;

	public Cryptor(String keySeed) {
		try {
			secretKey = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(keySeed.getBytes()), "Blowfish");
		} catch(NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public String decrypt(String cipherText) {
		if(cipherText == null) return null;
		try {
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return new String(cipher.doFinal(BaseEncoding.base64Url().decode(cipherText)), StandardCharsets.UTF_8);
		} catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
			throw new RuntimeException(e);
		}
	}

	public String encrypt(String clearText) {
		if(clearText == null) return null;
		try {
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			return BaseEncoding.base64Url().omitPadding().encode(cipher.doFinal(clearText.getBytes(StandardCharsets.UTF_8)));
		} catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 解密
	 * @param cipherText
	 * @return
	 */
	public String decodeIdNo(String cipherText){
		if(cipherText == null){
			return cipherText;
		}
		String result = null;
		try {
			result = decrypt(cipherText);
		}catch (Exception e){

		}
		return result == null?cipherText:result;
	}

	/**
	 * 加密
	 * @param cipherText
	 * @return
	 */
	public String encodeIdNo(String cipherText){
		if(cipherText == null){
			return cipherText;
		}
		String result = null;
		try {
			result = encrypt(cipherText);
		}catch (Exception e){

		}
		return result == null?cipherText:result;
	}

}
