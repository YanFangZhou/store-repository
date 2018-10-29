package com.example.demo.util.login;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import lombok.extern.slf4j.Slf4j;

/**
 * 登录工具类
 * @author Administrator
 *
 */
@Slf4j
public class LoginUtil {
	//定义密钥
	private static final String PASS_ENCRIPT_KEY = "123456789456";
	//定义使用的加密算法
	private static final String PASS_ENCRIPT_FUNC = "DES";

	//登录密码加密
	public byte[] loginEncript(String loginPassword) {
		try {
			SecureRandom random = new SecureRandom();
			//创建一个密钥空间
			DESKeySpec keySpec = new DESKeySpec(PASS_ENCRIPT_KEY.getBytes());
			//创建一个密匙工厂，然后用它把DESKeySpec转换成
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(PASS_ENCRIPT_FUNC);
			SecretKey securekey = keyFactory.generateSecret(keySpec);
			//Cipher对象实际完成加密操作
			Cipher cipher = Cipher.getInstance(PASS_ENCRIPT_FUNC);
			//用密匙初始化Cipher对象
			cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
			//现在，获取数据并加密
			//正式执行加密操作
			return cipher.doFinal(loginPassword.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
