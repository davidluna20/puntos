package puntos;
/**
 * Esta clase representa un punto en 2 dimensiones con las coordenadas x e y
 * @author Jose David
 */
public class P2 {
    //Atributos
    private int x;
    private int y;

    /**
     * Crea una instancia del objeto P2
     */
    public P2() {
        this.x = this.y = 0;
    }

    /**
     * Crea una instancia del objeto P2
     * @param x Coordenada x
     * @param y Coordenada y
     */
    public P2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instancia del objeto P2
     * @param p2 Es un objeto de punto de dos dimensiones (P2)
     */
    public P2(P2 p2){
        this.x = p2.getX();
        this.y = p2.getY();
    }

    /**
     * Retorna el valor de x
     * @return
     */
    public int getX(){
        return  this.x;
    }

    /**
     * Asigna el valor de la coordenada x
     * @param x Coordenada x
     */
    public  void setX(int x){
        this.x = x;
    }

    /**
     * Retorna el valor de la coordenada y
     * @return
     */
    public int getY(){
        return  this.y;
    }

    /**
     * Asigna el valor de la coordenada y
     * @param y Coordenada y
     */
    public  void setY(int y){
        this.y = y;
    }

    /**
     * Calcula la distancia entre dos puntos
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y){
        double distancia ;

        double diferenciaCuadradoX = Math.pow(this.x - x,2);
        double diferenciaCuadradoY = Math.pow(this.y - y,2);

        distancia = Math.sqrt(diferenciaCuadradoX + diferenciaCuadradoY);

        return distancia;
    }

    /**
     * calcula la distancia de dos puntos en un objeto
     * @param p2 objeto de tipo P2
     * @return distancia
     */
    public double calcularDistancia(P2 p2){

        return this.calcularDistancia(p2.getX(), p2.getY());
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("x:").append(this.x).append("Y:").append(this.y);

        return sb.toString();
    }
}
