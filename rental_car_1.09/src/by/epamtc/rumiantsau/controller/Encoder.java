package by.epamtc.rumiantsau.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Encoder {

    public static String encrypt(String line) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(line.getBytes());

        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
