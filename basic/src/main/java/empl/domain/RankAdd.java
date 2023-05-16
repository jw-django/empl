package empl.domain;

import empl.domain.*;
import empl.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RankAdd extends AbstractEvent {

    private Long id;
    private String name;

    public RankAdd(Rank aggregate) {
        super(aggregate);
    }

    public RankAdd() {
        super();
    }
}
