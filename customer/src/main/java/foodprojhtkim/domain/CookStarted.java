package foodprojhtkim.domain;

import foodprojhtkim.domain.*;
import foodprojhtkim.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String orderno;
    private Object menu;
    private String riderid;
    private String status;
}
