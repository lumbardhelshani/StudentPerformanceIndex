package server.services;


import server.models.PerformanceIndex;

import java.util.List;

public class PerformanceIndexServiceImpl implements PerformanceIndexService{

    @Override
    public List<PerformanceIndex> getPerformanceIndecesByStudentId(String studentId) {
        return null;
    }

    @Override
    public void generateNewPerformanceIndeces() {

    }

    public void notifyParentsForPerformanceDrop(String studentId){

    }
}
