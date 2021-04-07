public class XORCryptor {

    public static byte[] encrypt(byte[] str, byte[] key){

        byte[] bytes = new byte[str.length];

        for (int i = 0; i < str.length; i++) {
            bytes[i] = (byte) (str[i] ^ key[i%key.length] ^ (i & 0xFF));
        }

        return bytes;
    }

}
