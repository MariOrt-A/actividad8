public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private double peso;
    private String genero;

    // Constructor
    public Perro(String nombre, String raza, int edad, String tamano, double peso, String genero ) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.peso = peso;
        this.genero = genero;
    }

    // Nombre get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Raza get y set
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    // Edad get y set
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Tamaño get y set
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    // Peso get y set
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    // Genero get y set
    public String getGenero() {
        return genero;
    }
    public void setGenero(String tipoComida) {
        this.genero = genero;
    }
    // Comida get y set


    //Metodo comer
    public void comer(String tipoComida, double gramos) {
        System.out.println("El perro " + nombre + " come " + gramos+ " gramos de "+ tipoComida);
    }

    //Metodo ladrar
    public String ladrar() {
        return "guau guau";
    }
    //Metodo que muestra los elementos de los perros
    public String toString() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamaño: " + tamano + ", Peso: " + peso + ", Género: " + genero;
    }
}
