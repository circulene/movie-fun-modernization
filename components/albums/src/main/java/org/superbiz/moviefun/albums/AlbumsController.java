package org.superbiz.moviefun.albums;

import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    private final AlbumsRepository albumsRepository;

    public AlbumsController(AlbumsRepository albumsRepository) {
        this.albumsRepository = albumsRepository;
    }

    @PostMapping
    public void addAlbum(@RequestBody Album album){
        albumsRepository.addAlbum(album);
    }

    @GetMapping("{id}")
    public Album find(@PathVariable("id") Long id) {
        return albumsRepository.find(id);
    }

    @GetMapping
    public List<Album> getAlbums(){
        return albumsRepository.getAlbums();
    }

    @DeleteMapping
    public void deleteAlbum(@RequestBody Album album) {
        albumsRepository.deleteAlbum(album);
    }

    @PutMapping
    public void updateAlbum(@RequestBody Album album) {
        albumsRepository.updateAlbum(album);
    }
}
