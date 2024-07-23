package gt.edu.miumg.DiagramasDeClases;

public abstract class Personajes {
        private String Name;
        private String Descripcion;
        private long tamano;
        private int poder;
        private int vida;

        public Personajes(String nombre, Object o, Object o1, int vida, int poder) {
        }

        public Personajes() {

        }

        public abstract  void desplazarse ();
        public abstract  int MostrarVida();

        public abstract void atacar();

        public abstract  void MostrarPoder();

        public abstract void Destruir();

        public abstract void recibirAtaque();

        public abstract void desplazarce();

        public abstract int mostrarVida();

        public abstract void mostrarPoder();

        public abstract void defender();
}
