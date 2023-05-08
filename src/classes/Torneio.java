package classes;

public class Torneio {
    private Casa casa1;
    private Casa casa2;
    private int pontosCasa1 = 0;
    private int pontosCasa2 = 0;

    public Torneio(Casa casa1, Casa casa2) {
        this.casa1 = casa1;
        this.casa2 = casa2;
    }


    public void marcarPonto(Casa casa, int pontos) {
        if(casa == casa1) {
            this.pontosCasa1 += pontos;
        } else if(casa == casa2) {
            this.pontosCasa2 += pontos;
        }
    }

    public Casa getCasa1() {
        return casa1;
    }

    public void setCasa1(Casa casa1) {
        this.casa1 = casa1;
    }

    public Casa getCasa2() {
        return casa2;
    }

    public void setCasa2(Casa casa2) {
        this.casa2 = casa2;
    }

    public int getPontosCasa1() {
        return pontosCasa1;
    }

    public void setPontosCasa1(int pontosCasa1) {
        this.pontosCasa1 = pontosCasa1;
    }

    public int getPontosCasa2() {
        return pontosCasa2;
    }

    public void setPontosCasa2(int pontosCasa2) {
        this.pontosCasa2 = pontosCasa2;
    }
}
