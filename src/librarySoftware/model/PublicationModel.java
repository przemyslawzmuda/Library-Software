package librarySoftware.model;

import java.util.Objects;

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

    /*
    The class PublicationModel should be only a template fot the following objects.
    Don't apply interaction with the users in that class.
    Avoid:
    public void printBookInformations() {}
    public void printMagazineInformations() {}
    Instead of that approach, override the toString() method.
     */

    @Override
    public String toString() {
        return title + "; " + publisher + "; " + publishYear;
    }

    // Generate the equals() and hashCode() method to compare objects - ex.: avoid adding the same Book
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicationModel that = (PublicationModel) o;
        return publishYear == that.publishYear && Objects.equals(title, that.title) && Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisher, publishYear);
    }
}
