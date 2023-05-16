package empl.domain;

import empl.domain.*;
import empl.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EmployeeAdd extends AbstractEvent {

    private Long id;
    private String userId;
    private RankId rankId;
    private DepartmentId departmentId;
    private List<EmployeeUser> employeeUser;
    private String phoneNo;
    private Date startDate;
    private Boolean managerYn;

    public EmployeeAdd(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdd() {
        super();
    }
}
