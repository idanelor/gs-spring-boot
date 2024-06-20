import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.dchealth.entity.common.YunUsers;

@Produces("application/json")
@Path("time")
@Service
@RestController
public class TimeService {
    @GET
    @Path("users")
    public List<YunUsers> getAllUser(){
        return baseFacade.findAll(YunUsers.class);
    }
}