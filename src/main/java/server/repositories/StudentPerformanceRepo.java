package server.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import server.models.PerformanceIndex;

import java.util.List;

@Repository
public interface StudentPerformanceRepo extends JpaRepository<PerformanceIndex, String> {

    @Query(value = "SELECT * FROM performance_index WHERE student_id = ?1", nativeQuery = true)
    List<PerformanceIndex> getPerfomanceIndecesByStudentId(String studentId);

}
