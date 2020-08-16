package server.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "performance_index")
public class PerformanceIndex {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private String id;

    @Column(name = "performance_index")
    private float performanceIndex;

    @Column(name = "student_id")
    private String studentId;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "date_generated")
    private Date dateGenerated;

}
