package com.crm.util;

import java.nio.charset.Charset;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import io.netty.util.internal.ThreadLocalRandom;

public class CommonUtil {
	
	public static int generateRandomNumber() {
		int rand_number = ThreadLocalRandom.current().nextInt();
		return rand_number;
	}
	
	public static String generateRandomName() {
		String genRanName = RandomStringUtils.randomAlphabetic(8);
		return genRanName;
	}

}
