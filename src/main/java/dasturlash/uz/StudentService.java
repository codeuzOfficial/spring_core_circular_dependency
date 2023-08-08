package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private SmsService smsService;

    @Autowired
    public StudentService(SmsService smsService) {
        this.smsService = smsService;
    }
}
