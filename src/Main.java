public class Main {

    public static void main(String[] args) {
        String str = "Мама мыла раму";
        String key = "SkillFactory2021";

        String result;


        System.out.println(result = XORCryptor.crypt(str, key));

        System.out.println(XORCryptor.encrypt(result, key));

    }

}
