public class StringReplace {
    private String statename;
    public StringReplace(String statename){
        this.statename = statename;
    }
    public String replaceI(){
        //String newStateName = null;
        return statename.replace("i","ii");
    }
    public String replaceSS(){
        //String newStateName = null;
        return statename.replace("ss","s");
    }
    public int calculateLength(String name) {
        return statename.length();
    }
}
