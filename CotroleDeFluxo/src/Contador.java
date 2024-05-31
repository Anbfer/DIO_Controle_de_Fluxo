public class Contador {
    
    @Override
    public String toString() {
        return "Contador [parametro1=" + parametro1 + ", parametro2=" + parametro2 + "]";
    }

    private int parametro1;
    private int parametro2;
    
    public int getParametro1() {
        return parametro1;
    }

    public void setParametro1(int parametro1) {
        this.parametro1 = parametro1;
    }

    public int getParametro2() {
        return parametro2;
    }

    public void setParametro2(int parametro2) {
        this.parametro2 = parametro2;
    }

    public Contador () {

    }

    public Contador (int parametro1, int parametro2) {
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    public void contar (int parametro1, int parametro2) throws ParametroInvalidoException {
        if (parametro1 > parametro2) {
            throw new ParametroInvalidoException("O segundo parametro deve ser maior que o primeiro");
        }

        for (int i = 0; i < (parametro2 - parametro1); i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}

