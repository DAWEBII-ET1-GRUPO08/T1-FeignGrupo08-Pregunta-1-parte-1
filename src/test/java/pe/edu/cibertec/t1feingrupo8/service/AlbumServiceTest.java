package pe.edu.cibertec.t1feingrupo8.service;

import org.junit.jupiter.api.Test;
import pe.edu.cibertec.t1feingrupo8.model.AlbumsPlaceHolder;
import pe.edu.cibertec.t1feingrupo8.restclient.AlbumClient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AlbumServiceTest {

    @Test
    void devuelveSoloAlbumsConUserIdParEIdImpar() {
        AlbumClient albumClient = mock(AlbumClient.class);
        when(albumClient.obtenerAlbums()).thenReturn(List.of(
                new AlbumsPlaceHolder(2, 11, "Incluido"),
                new AlbumsPlaceHolder(2, 12, "Id par"),
                new AlbumsPlaceHolder(3, 13, "UserId impar"),
                new AlbumsPlaceHolder(4, 15, "Incluido")
        ));

        List<AlbumsPlaceHolder> resultado = new AlbumService(albumClient).obtenerAlbumsFiltrados();

        assertEquals(List.of(11, 15), resultado.stream().map(AlbumsPlaceHolder::getId).toList());
    }
}
