package pckg.minhasmusicas.main;

import pckg.minhasmusicas.models.MinhasPreferidas;
import pckg.minhasmusicas.models.Musica;
import pckg.minhasmusicas.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("PTSD");
        minhaMusica.setCantor("POP Smoke");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Aprendendo Java");
        meuPodcast.setApresentador("Juan Lencina");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
