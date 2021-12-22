public enum WydzialEnum {
    Tir("Tir",1),
    Wf("Wf",2),
    Fiz("Fiz",3);



    private WydzialEnum(String nazwa, int index) {
        this.nazwa = nazwa;
        this.index = index;
    }
    private final String nazwa;
    private final int index;
    public String getNazwa(){
        return nazwa;
    }

    @Override
    public String toString() {
        return
                "nazwa wydziału='" + nazwa + '\'' +
                ", index=" + index +
                '}';
    }
}
