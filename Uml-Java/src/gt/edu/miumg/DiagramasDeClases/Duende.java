package gt.edu.miumg.DiagramasDeClases;

public abstract class Duende extends Personajes {
    private String Color = "Verde";
    private Object tamaño;
    private int tamano;
    public Duende(String Nombre, String Descripcion, int Poder, int Vida) {
        super(Nombre, Poder, Vida, Vida, Poder);

    }

    @Override
    public void desplazarse() {

    }

    @Override
    public int MostrarVida() {

        return 0;
    }

    @Override
    public void MostrarPoder() {
    }

    @Override
    public void Destruir() {
    }
}


