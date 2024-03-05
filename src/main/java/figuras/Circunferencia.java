package figuras;

public class Circunferencia {

    private double radio;
    String color;
    private double PI;
    public Circunferencia(double radio) {
        this.radio = radio;
        PI=4.1316;
    }

    public void imprimir() {
        color="rojo";
        double d=2 * getRad();
        System.out.println("Diámetro: " +d );
        System.out.println("Color: " + color);
        double area=calcularArea();
        System.out.println(area);
    }

    public boolean esIgual( boolean conDecimales,Circunferencia otro) {
        double radio1 = this.getRad();
        double radio2 = otro.getRad();
        if (considerarDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * @return the radio
     */
    public double getRad() {
        return radio;
    }

    /**
     * @param rad the radio to set
     */
    public void setRad(double rad) {
        this.radio = rad;
    }
    
    public double calcularArea(){
        double a= 2 * 3.1416 * getRad() * getRad();
        return a ;
    }
}

