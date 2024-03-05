package utilidades;

public class Circulo {

    private double rad;

    public Circulo(double radio) {
        this.rad = radio;
    }

    public void imprimir() {
        String color = "rojo";
        System.out.println("Diámetro: " + 2 * getRad());
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * getRad() * getRad();
        System.out.println(area);
    }

    public boolean esIgual(Circulo otro, boolean conDecimales) {
        double radio1 = this.getRad();
        double radio2 = otro.getRad();
        if (conDecimales) {
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
     * @return the rad
     */
    public double getRad() {
        return rad;
    }

    /**
     * @param rad the rad to set
     */
    public void setRad(double rad) {
        this.rad = rad;
    }
}

