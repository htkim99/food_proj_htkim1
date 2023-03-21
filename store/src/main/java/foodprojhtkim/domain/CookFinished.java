package foodprojhtkim.domain;

import foodprojhtkim.domain.*;
import foodprojhtkim.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String orderno;
    private List<String> menu;
    private String riderid;
    private String status;

    public CookFinished(Cooking aggregate) {
        super(aggregate);
    }

    public CookFinished() {
        super();
    }
}
