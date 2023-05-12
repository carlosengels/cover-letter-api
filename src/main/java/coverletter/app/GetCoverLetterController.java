package coverletter.app;

import ch.qos.logback.core.model.Model;
import coverletter.app.models.CoverLetter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
@RequestMapping("/api")
public class GetCoverLetterController {

    //Get a body with JSON and return a String coverletter
    @PostMapping("/coverletter")
    public String getCL(@RequestBody CoverLetter coverLetter) {
        return coverLetter.toString() + coverLetter.getCompany();
    }
}
