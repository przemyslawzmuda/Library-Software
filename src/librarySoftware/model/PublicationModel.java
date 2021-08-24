package librarySoftware.model;

class PublicationModel {
    private String title;
    private String publisher;
    private int publishYear;

    // Add a constructor in the superior class
    public PublicationModel(String title, String publisher, int publishYear) {
        this.title = title;
        this.publisher = publisher;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
