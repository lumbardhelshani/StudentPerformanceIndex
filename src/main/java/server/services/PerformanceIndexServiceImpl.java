package server.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.models.PerformanceIndex;
import server.repositories.StudentPerformanceRepo;

import java.util.List;

@Service
public class PerformanceIndexServiceImpl implements PerformanceIndexService{

    @Autowired
    private StudentPerformanceRepo studentPerformanceRepo;

    @Override
    public List<PerformanceIndex> getPerformanceIndecesByStudentId(String studentId) {
        return studentPerformanceRepo.getPerfomanceIndecesByStudentId(studentId);
    }

    @Override
    public void generateNewPerformanceIndeces() {

    }

    public void notifyParentsForPerformanceDrop(String studentId){

    }
}
