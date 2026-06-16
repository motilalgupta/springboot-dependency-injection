package SpringBoot_PO_01;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
    @Override
    public String getMessage() {
        return "Email: You have got new email";
    }
}
