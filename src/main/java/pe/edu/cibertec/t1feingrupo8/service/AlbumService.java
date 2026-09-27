package pe.edu.cibertec.t1feingrupo8.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feingrupo8.model.AlbumsPlaceHolder;
import pe.edu.cibertec.t1feingrupo8.restclient.AlbumClient;

import java.util.List;

@Service
public class AlbumService {

    private final AlbumClient albumClient;

    public AlbumService(AlbumClient albumClient) {
        this.albumClient = albumClient;
    }

    /**
     * Obtiene todos los álbumes y conserva solo los que tienen userId par e id impar.
     */
    public List<AlbumsPlaceHolder> obtenerAlbumsFiltrados() {
        return albumClient.obtenerAlbums().stream()
                .filter(album -> album.getUserId() != null && album.getUserId() % 2 == 0)
                .filter(album -> album.getId() != null && album.getId() % 2 != 0)
                .toList();
    }
}
