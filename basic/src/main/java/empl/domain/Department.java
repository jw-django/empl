package empl.domain;

import empl.BasicApplication;
import empl.domain.DepartmentAdd;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Department_table")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        DepartmentAdd departmentAdd = new DepartmentAdd(this);
        departmentAdd.publishAfterCommit();
    }

    public static DepartmentRepository repository() {
        DepartmentRepository departmentRepository = applicationContext()
            .getBean(DepartmentRepository.class);
        return departmentRepository;
    }

    public static ApplicationContext applicationContext() {
        return BasicApplication.applicationContext;
    }
}
