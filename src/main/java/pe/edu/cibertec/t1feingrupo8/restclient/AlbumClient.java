package pe.edu.cibertec.t1feingrupo8.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feingrupo8.model.AlbumsPlaceHolder;

import java.util.List;

@FeignClient(name = "albumClient", url = "${jsonplaceholder.url}")
public interface AlbumClient {

    @GetMapping("/albums")
    List<AlbumsPlaceHolder> obtenerAlbums();
}
