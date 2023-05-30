package coverletter.app.controllers;

import ch.qos.logback.core.model.Model;
import coverletter.app.CLGenerator;
import coverletter.app.models.CoverLetter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Class that handles incoming request, calls the necessary functions and returns the response.
 */
@ResponseBody
@Controller
@RequestMapping("/api")
public class GetCoverLetterController {

    //Get a body with JSON and return a String cover letter
    @PostMapping("/coverletter")
    public String getCL(@RequestBody CoverLetter coverLetter) {
        CLGenerator generator = new CLGenerator();
        return generator.generate(coverLetter);
    }
}
