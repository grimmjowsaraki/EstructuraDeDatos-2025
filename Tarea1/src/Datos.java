public class Datos {
    private String redSocial, concepto;
    private int anio, enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;

    public Datos() {
    }

    public Datos(String redSocial, String concepto, int anio, int enero, int febrero, int marzo, int abril, int mayo, int junio, int julio, int agosto, int septiembre, int octubre, int noviembre, int diciembre) {
        this.redSocial = redSocial;
        this.concepto = concepto;
        this.anio = anio;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.abril = abril;
        this.mayo = mayo;
        this.junio = junio;
        this.julio = julio;
        this.agosto = agosto;
        this.septiembre = septiembre;
        this.octubre = octubre;
        this.noviembre = noviembre;
        this.diciembre = diciembre;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEnero() {
        return enero;
    }

    public void setEnero(int enero) {
        this.enero = enero;
    }

    public int getFebrero() {
        return febrero;
    }

    public void setFebrero(int febrero) {
        this.febrero = febrero;
    }

    public int getMarzo() {
        return marzo;
    }

    public void setMarzo(int marzo) {
        this.marzo = marzo;
    }

    public int getAbril() {
        return abril;
    }

    public void setAbril(int abril) {
        this.abril = abril;
    }

    public int getMayo() {
        return mayo;
    }

    public void setMayo(int mayo) {
        this.mayo = mayo;
    }

    public int getJunio() {
        return junio;
    }

    public void setJunio(int junio) {
        this.junio = junio;
    }

    public int getJulio() {
        return julio;
    }

    public void setJulio(int julio) {
        this.julio = julio;
    }

    public int getAgosto() {
        return agosto;
    }

    public void setAgosto(int agosto) {
        this.agosto = agosto;
    }

    public int getSeptiembre() {
        return septiembre;
    }

    public void setSeptiembre(int septiembre) {
        this.septiembre = septiembre;
    }

    public int getOctubre() {
        return octubre;
    }

    public void setOctubre(int octubre) {
        this.octubre = octubre;
    }

    public int getNoviembre() {
        return noviembre;
    }

    public void setNoviembre(int noviembre) {
        this.noviembre = noviembre;
    }

    public int getDiciembre() {
        return diciembre;
    }

    public void setDiciembre(int diciembre) {
        this.diciembre = diciembre;
    }

    public void mostarDatos(){
        System.out.println("Red Social: " + this.redSocial);
        System.out.println("Concepto: " + this.concepto);
        System.out.println("Anio: " + this.anio);
        System.out.println("Enero: " + this.enero);
        System.out.println("Febrero: " + this.febrero);
        System.out.println("Marzo: " + this.marzo);
        System.out.println("Abril: " + this.abril);
        System.out.println("Mayo: " + this.mayo);
        System.out.println("Junio: " + this.junio);
        System.out.println("Julio: " + this.julio);
        System.out.println("Agosto: " + this.agosto);
        System.out.println("Septiembre: " + this.septiembre);
        System.out.println("Octubre: " + this.octubre);
        System.out.println("Noviembre: " + this.noviembre);
        System.out.println("Diciembre: " + this.diciembre);
    }
}
