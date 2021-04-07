public class Main {

    public static void main(String[] args) {
        String str = "Мама мыла раму";
        String key = "SkillFactory2021";

        byte[] result;

        System.out.println(new String(result = XORCryptor.encrypt(str.getBytes(), key.getBytes())));

        System.out.println(new String(XORCryptor.encrypt(result, key.getBytes())));

    }

}
