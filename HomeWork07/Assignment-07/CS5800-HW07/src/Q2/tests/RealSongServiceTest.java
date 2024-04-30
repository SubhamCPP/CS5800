package Q2.tests;

import org.junit.Test;
import Q2.RealSongService;
import Q2.Song;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RealSongServiceTest {

    @Test
    public void testSearchById() {
        RealSongService realSongService = new RealSongService();
        Song song = realSongService.searchById(1);
        assertNotNull(song);
        assertEquals("Tell me why", song.getTitle());
        assertEquals("Backstreet Boys", song.getArtist());
        assertEquals("Album 1", song.getAlbum());
        assertEquals(180, song.getDuration());
    }
}
