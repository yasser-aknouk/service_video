package ma.xproc.servicevideo.Repositories;

import ma.xproc.servicevideo.Entity.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICreatorRepository extends JpaRepository<Creator,Long> {
}
