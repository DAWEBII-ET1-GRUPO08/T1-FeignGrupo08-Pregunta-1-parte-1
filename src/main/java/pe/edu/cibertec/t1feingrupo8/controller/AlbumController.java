package pe.edu.cibertec.t1feingrupo8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feingrupo8.model.AlbumsPlaceHolder;
import pe.edu.cibertec.t1feingrupo8.service.AlbumService;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    /**
     * Endpoint de demostración para consultar los álbumes que cumplen ambos filtros.
     */
    @GetMapping("/filtrados")
    public List<AlbumsPlaceHolder> obtenerAlbumsFiltrados() {
        return albumService.obtenerAlbumsFiltrados();
    }
}
