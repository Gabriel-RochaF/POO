package ads.poo;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%b,%b)", x, y);
    }

    public double calcularDistancia(Ponto segundoPonto){
       double x2 = segundoPonto.getX();
       double y2 = segundoPonto.getY();
       double diferencaXQua = Math.pow(x2 - x, 2);
       double diferencaYQua = Math.pow(y2 - y, 2);

       return Math.sqrt(diferencaXQua + diferencaYQua);
    }
}
