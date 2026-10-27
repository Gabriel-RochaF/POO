package ads.poo.formas;

public class Ponto {
    public int x;
    public int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }
}
