package librarySoftware.model;

public class Magazine extends PublicationModel {
    private int day;
    private int month;
    private String language;

    public Magazine(String title, String publisher, int publishYear, int day, int month, String language) {
        this.setTitle(title);
        this.setPublisher(publisher);
        this.setPublishYear(publishYear);
        this.day = day;
        this.month = month;
        this.language = language;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void printMagazineInformations() {
        String information = getTitle() + "; " + getPublisher() + "; " + getPublishYear() + "."
                + month + "." + day + "; " + language;
        System.out.println(information);
    }
}
