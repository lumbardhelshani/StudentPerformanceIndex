package server.services;


import server.models.PerformanceIndex;

import java.util.List;

public interface PerformanceIndexService {
    List<PerformanceIndex> getPerformanceIndecesByStudentId(String studentId);

    void generateNewPerformanceIndeces();
}
