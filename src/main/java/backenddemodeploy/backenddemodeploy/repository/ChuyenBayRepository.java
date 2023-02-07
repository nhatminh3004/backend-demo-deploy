package backenddemodeploy.backenddemodeploy.repository;

import backenddemodeploy.backenddemodeploy.entity.ChuyenBay;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay,String> {
    @Modifying
    @Transactional
    @Query(value = "select * from chuyenbay where  gaden like :gaDen   ", nativeQuery = true)
    public List<ChuyenBay> findChuyenBayDiDaLat(@Param("gaDen") String name);
}
