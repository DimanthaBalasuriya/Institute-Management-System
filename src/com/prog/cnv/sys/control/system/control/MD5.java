package com.prog.cnv.sys.control.system.control;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author CHAMOD DIYAMANTHA BALASURIYA
 */
public class MD5 {

    public static String getHash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger bi = new BigInteger(1, messageDigest);
            String hashtext = bi.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException nse) {
            //throw new RuntimeException(ENCRYPTIONALGORITHMDETECTIONERROR);
        } catch (Exception e) {
            //throw new RuntimeException(ENCRYPTIONERROR);
        }
        return null;
    }
}
