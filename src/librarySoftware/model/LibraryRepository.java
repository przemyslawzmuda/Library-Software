package librarySoftware.model;

public class LibraryRepository {
    /*
    Template of the repository to store books in the library. Create the data model (without print any lines
    of text).
     */
    private final static int MAX_PUBLICATIONS_IN_LIBRARY = 4000; // variable to limit the number of the publications
    private int publicationsNumber = 0;
    private PublicationModel[] publicationsInLibraryArray = new PublicationModel[MAX_PUBLICATIONS_IN_LIBRARY];

    // create a copy of the array without the null values - pass that copied array into the ConsolePrinter
    public PublicationModel[] getPublicationsInLibraryArray() {
        PublicationModel[] result = new PublicationModel[publicationsNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = publicationsInLibraryArray[i];
        }
        return result;
    }

    // make the function public to be able to call that method in the another package
    public void addBookIntoLibrary(Book book) {
        addPublicationIntoLibrary(book);
    }
    public void addMagazineIntoLibrary(Magazine magazine) {
        addPublicationIntoLibrary(magazine);
    }

    // thank to polymorphism, I can pass as an argument any inherited object from the PublicationModel class
    private void addPublicationIntoLibrary(PublicationModel publication) {
        if (publicationsNumber >= MAX_PUBLICATIONS_IN_LIBRARY)
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATIONS_IN_LIBRARY);
        publicationsInLibraryArray[publicationsNumber] = publication;
        publicationsNumber++;
    }

}
