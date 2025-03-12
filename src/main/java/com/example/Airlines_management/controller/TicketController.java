import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.airlinesmanagement.service.TicketService;
import com.example.airlinesmanagement.model.Ticket;


@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/book")
    public Ticket bookTicket(@RequestParam Long flightId, @RequestParam Long userId) {
        return ticketService.bookTicket(flightId, userId);
    }

    @PutMapping("/cancel/{ticketId}")
    public void cancelTicket(@PathVariable Long ticketId) {
        ticketService.cancelTicket(ticketId);
    }
}
