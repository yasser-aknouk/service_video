package ma.xproc.servicevideo.Repositories;

import ma.xproc.servicevideo.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideoRepository extends JpaRepository<Video,Long> {
}
