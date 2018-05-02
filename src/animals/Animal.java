package animals;

public abstract class Animal {

    private String nombre;

    public Animal() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(this.getNombre() + " está comiendo...");
    }

    public void caminar() {
        System.out.println(this.getNombre() + " está caminando...");
    }

    public abstract void sonido();
}
