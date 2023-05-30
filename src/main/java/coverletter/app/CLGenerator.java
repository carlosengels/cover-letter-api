package coverletter.app;

import coverletter.app.models.CoverLetter;

import java.time.LocalDate;

/**
 * Class uses a CoverLetter object to create a new CL as a String that will be returned as response.
 */

public class CLGenerator {

    public CLGenerator() {
    }

    public String generate(CoverLetter coverLetter) {

        String coverLetterText = coverLetter.getCoverLetterTemplate();

        coverLetterText = coverLetterText
                .replaceAll("COMPANY", coverLetter.getCompany())
                .replaceAll("POSITION", coverLetter.getPosition())
                .replaceAll("DATE", formattedDate())
                .replaceAll("HIRING_MANAGER", coverLetter.getHiringManager())
                .replaceAll("FULL_NAME", coverLetter.getName());

        return coverLetterText;
    }


    private String formattedDate() {
        String month = LocalDate.now().getMonth().toString();
        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
        int dayOfMonth = LocalDate.now().getDayOfMonth();
        String dayOfMonthSuffix;
        switch (dayOfMonth % 10) {
            case 1: dayOfMonthSuffix = "st";
            case 2: dayOfMonthSuffix = "nd";
            case 3: dayOfMonthSuffix = "rd";
            default: dayOfMonthSuffix = "th";
        }
        String day = dayOfMonth + dayOfMonthSuffix;
        int year = LocalDate.now().getYear();
        return String.format("%s %s, %d",month, day, year);
    }
}
