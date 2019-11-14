package Case;

public abstract class Case {

    int numCase;
    String nomCase;

    public Case(){
        numCase = 0;
        nomCase = "caseNulle";
    }

    public Case(int numCase, String nomCase) {
        this.numCase = numCase;
        this.nomCase = nomCase;
    }

    public Case(Case c){
        this.numCase = c.getNumCase();
        this.nomCase = c.getNomCase();
    }

    public int getNumCase() {
        return numCase;
    }

    public void setNumCase(int numCase) {
        this.numCase = numCase;
    }

    public String getNomCase() {
        return nomCase;
    }

    public void setNomCase(String nomCase) {
        this.nomCase = nomCase;
    }

    public String toString(){
        return this.nomCase;
    }

}