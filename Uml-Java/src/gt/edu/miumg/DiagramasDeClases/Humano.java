package gt.edu.miumg.DiagramasDeClases;

    public abstract class Humano extends Personajes  {

        @Override
        public void atacar() {

        }

        @Override
        public void defender() {

        }

        @Override
        public void recibirAtaque() {

        }

        @Override
        public void desplazarce() {

        }

        @Override
        public int mostrarVida() {
            return 0;
        }

        @Override
        public void mostrarPoder() {

        }

        public int edad;
        public Humano (String Nombre, String Descripcion , long Tamanio, int Vida, int Poder) {
            super(Nombre, Descripcion, Tamanio, Vida, Poder);
            this.edad = edad;
        }
    }

