package rudaks._03_behavior_patterns._19_observer._spring.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import rudaks._03_behavior_patterns._19_observer._spring.ticket.Ticket;

@AllArgsConstructor
@Getter
public class TicketEvent {

    private Ticket ticket;
}
