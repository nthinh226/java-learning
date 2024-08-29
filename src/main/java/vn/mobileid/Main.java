package vn.mobileid;

import java.io.*;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Base64;
import java.util.Enumeration;

public class Main {
    public static final String KEYSTORE = "D:\\1_Projects\\java-roadmap\\src\\main\\resources\\60qc_statement_test1.p12";
    public static final String KEYSTORE_PASS = "123456";
    public static final String HASHES = "NPIs8NTTf7fzNeP/Kr2fEt63IL+oHvEefBEVtW52/BQ=";

    public static void main1(String[] args) throws
            KeyStoreException,
            FileNotFoundException,
            IOException,
            NoSuchAlgorithmException,
            CertificateException,
            UnrecoverableKeyException,
            InvalidKeyException,
            SignatureException {

        KeyStore keystore = KeyStore.getInstance("PKCS12");
        keystore.load(new FileInputStream(new File(KEYSTORE)), KEYSTORE_PASS.toCharArray());
        String alias = keystore.aliases().nextElement();
        PrivateKey pk = (PrivateKey) keystore.getKey(alias, KEYSTORE_PASS.toCharArray());

//        byte[] datas = Base64.getDecoder().decode(HASHES);
        byte[] datas = HASHES.getBytes();

        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initSign(pk);
        sig.update(datas);

        byte[] result = sig.sign();
        System.out.println("Signature Value: " + Base64.getEncoder().encodeToString(result));
    }


    public static void main(String[] args) throws Exception {
        String relyingPartyKeyStore = KEYSTORE;
        String relyingPartyKeyStorePassword = KEYSTORE_PASS;
        String sSignValue = getPKCS1Signature("Hacs5Fdt6v1yIWeLiLb3tSjMsOKN/VwUD3fypdoh70s=", relyingPartyKeyStore, relyingPartyKeyStorePassword);
        System.out.println("SignValue: " + sSignValue);
    }

    public static String getPKCS1Signature(String data, String relyingPartyKeyStore, String relyingPartyKeyStorePassword) throws Exception {
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        InputStream is = new FileInputStream(relyingPartyKeyStore);
        keystore.load(is, relyingPartyKeyStorePassword.toCharArray());
        Enumeration<String> e = keystore.aliases();
        PrivateKey key = null;
        String aliasName = "";
        while (e.hasMoreElements()) {
            aliasName = e.nextElement();
            key = (PrivateKey) keystore.getKey(aliasName, relyingPartyKeyStorePassword.toCharArray());
            if (key != null) {
                break;
            }
        }
        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initSign(key);
        sig.update(data.getBytes());
        return Base64.getEncoder().encodeToString(sig.sign());

    }
}