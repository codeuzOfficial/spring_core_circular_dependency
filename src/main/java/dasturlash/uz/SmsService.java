package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SmsService {
    private StudentService service;

    @Autowired
    public SmsService(StudentService service) {
        this.service = service;
    }

}
