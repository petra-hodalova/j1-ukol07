package cz.czechitas.ukol7.model;

public enum Barva {
    Zelena ("zelená"),
    Cervena ("červená"),
    Modra("modrá"),
    Zluta("žlutá"),
    Hneda("hnědá"),
    Cerna("černá"),
    Bila("bílá"),
    Fialova("fialová"),
    Ruzova("růžová"),
    Oranzova("oranžová"),
    ;


    private final String text;

    Barva(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
