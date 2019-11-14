package emplacement;

public class NonAchetable extends Case {

    public NonAchetable() {
        super();
    }

    public NonAchetable(int numCase, String nomCase) {
        super(numCase, nomCase);
    }

    public NonAchetable(NonAchetable n) {
        super(n);
    }

    public String toString() {
        return super.toString();
    }
}