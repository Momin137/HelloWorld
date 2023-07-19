public class StringReplaceRunner {
    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace("Mississippi");
        String resultI = stringReplace.replaceI();
        String resultSS = stringReplace.replaceSS();
        System.out.println(resultI);
        System.out.println(resultSS);
    }
}
