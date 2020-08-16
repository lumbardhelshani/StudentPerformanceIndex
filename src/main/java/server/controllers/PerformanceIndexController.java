package server.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import server.DTOs.PerformanceIndexTransport;
import server.models.PerformanceIndex;
import server.services.PerformanceIndexService;

import java.util.List;

@RestController
@RequestMapping("/performance_index")
public class PerformanceIndexController {

    private PerformanceIndexService performanceIndexService;

    public PerformanceIndexController(PerformanceIndexService performanceIndexService){
        this.performanceIndexService = performanceIndexService;
    }

    @GetMapping
    public List<PerformanceIndex> getPerformanceIndecesByStudentId(@RequestParam("studentId") String studentId) {
        return performanceIndexService.getPerformanceIndecesByStudentId(studentId);
    }


}
