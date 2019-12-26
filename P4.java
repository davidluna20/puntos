package puntos;

/**
 * Esta clase representa un punto en 4 dimensiones
 * @author Jose David
 */
public class P4 extends P3 {

    //Atributos
    private int t;

    /**
     * Crea un objeto de tipo P4
     */
    public P4(){
        super();
        this.t = 0;
    }

    /**
     * Crea un objeto de tipo P3
     * @param x coordenada X
     * @param y coordenada Y
     * @param z coordenada Z
     * @param t coordenada T
     */
    public P4(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    /**
     * Crea un objeto de tipo P4
     * @param p3 coodenada P3
     * @param t coordenada T
     */
    public  P4(P3 p3, int t){
        super(p3);
        this.t = t;
    }

    /**
     *  Crea un objeto de tipo P4
     * @param p4  un objeto de 4 coordenadas
     */
    public P4(P4 p4){
        this(p4.getX(),p4.getY(),p4.getZ(), p4.getT());
    }

    /**
     * Retorna la coordenada T
     * @return
     */
    public int getT(){
        return this.t;
    }

    /**
     * Asigna un valor a la coordenada T
     * @param t
     */
    public  void setT(int t){
        this.t = t;
    }

    /**
     * Calcula la distancia entre 3 puntos en 4 dimensiones
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @param t coordenada T del otro punto
     * @return
     */
    public double calcularDistancia(int x, int y, int z, int t){
        double distancia ;

        double diferenciaCuadradoX = Math.pow(getX() - x,2);
        double diferenciaCuadradoY = Math.pow(getY() - y,2);
        double diferenciaCuadradoZ = Math.pow(getZ() - z,2);
        double diferenciaCuadradoT = Math.pow(this.t - t,2);

        distancia = Math.sqrt(diferenciaCuadradoX + diferenciaCuadradoY + diferenciaCuadradoZ + diferenciaCuadradoT);

        return distancia;
    }

    /**
     * Calcula la distancia entre 3 puntos en 4 dimensiones
     * @param p3x objeto de tipo P3
     * @param t coordenada t
     * @return
     */
    public double calcularDistancia(P3 p3x, int t){

        return calcularDistancia(p3x.getX(), p3x.getY(), p3x.getZ(), t);
    }

    /**
     * Calcula la distancia entre 3 puntos en 4 dimensiones
     * @param p4 objeto de tipo P4
     * @return
     */
    public double calcularDistancia(P4 p4) {

        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getT());
    }

    public String toString(){
        return super.toString() +"T:" +this.t;
    }

}
