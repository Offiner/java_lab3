public enum WydzialEnum {
    Tir("Tir",1),
    Wf("Wf",2),
    Fiz("Fiz",2);



    private WydzialEnum(String nazwa, int abbr) {
        this.nazwa = nazwa;
        this.abbr = abbr;
    }
    private final String nazwa;
    private final int abbr;
    public String getNazwa(){
        return nazwa;
    }


}
