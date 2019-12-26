package puntos;

/**
 * Esta clase representa un punto en 3 dimensiones
 * @author Jose David
 */
public class P3 extends P2 {
    //Atributos
    private int z;

    /**
     * Crea un objeto de tipo P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * Crea un objeto de tipo P2
     * @param x coordenada x
     * @param y coordenada y
     * @param z coordenada z
     */
    public P3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p2 coordenada p2
     * @param z coordenada z
     */
    public  P3(P2 p2, int z){
        super(p2);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p3 un objeto de 3 coordenadas
     */
    public P3(P3 p3){
        this(p3.getX(),p3.getY(), p3.getZ());

    }

    /**
     * Retorna coordenada Z
     * @return
     */
    public int getZ(){
        return this.z;
    }

    /**
     * Asigna un valor a la coordenada Z
     * @param z
     */
    public  void setZ(int z){
        this.z = z;
    }

    /**
     * Calcula la distancia entre dos puntos en 3 dimensiones
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada X del otro punto
     * @return
     */
    public double calcularDistancia(int x, int y, int z){
        double distancia ;

        double diferenciaCuadradoX = Math.pow(getX() - x,2);
        double diferenciaCuadradoY = Math.pow(getY() - y,2);
        double diferenciaCuadradoZ = Math.pow(this.z - z,2);

        distancia = Math.sqrt(diferenciaCuadradoX + diferenciaCuadradoY + diferenciaCuadradoZ);

        return distancia;
    }

    /**
     * Calcula la distancia entre 2 puntos en 3 dimensiones
     * @param p2x objeto de tipo P2
     * @param z coordenada Z
     * @return distancia
     */
    public double calcularDistancia(P2 p2x, int z){

       return calcularDistancia(p2x.getX(), p2x.getY(), z);
    }

    /**
     * Calcula la distancia entre 2 puntos en 3 dimensiones
     * @param p3 objeto de tipo P3
     * @return distancia
     */
    public double calcularDistancia(P3 p3) {

        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }

    public String toString(){
        return super.toString() +"Z:" +this.z;
    }
}

