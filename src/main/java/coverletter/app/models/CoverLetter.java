package coverletter.app.models;

public class CoverLetter {
    private String name;
    private String company;
    private String position;
    private String hiringManager;
    private String coverLetterTemplate;

    public CoverLetter(String name, String company, String position, String hiringManager, String coverLetterTemplate) {
        this.name = name;
        this.company = company;
        this.position = position;
        this.hiringManager = hiringManager;
        this.coverLetterTemplate = coverLetterTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHiringManager() {
        return hiringManager;
    }

    public void setHiringManager(String hiringManager) {
        this.hiringManager = hiringManager;
    }

    public String getCoverLetterTemplate() {
        return coverLetterTemplate;
    }

    public void setCoverLetterTemplate(String coverLetterTemplate) {
        this.coverLetterTemplate = coverLetterTemplate;
    }
}
