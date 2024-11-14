import java.util.*;

public class BookCopyDriver {
    public static void main(String[] args) {
        List<String> shallowChapters = new ArrayList<>();
        shallowChapters.add("Chapter1");
        shallowChapters.add("Chapter2");
        shallowChapters.add("Chapter3");

        BookShallowCopy BookShallow1 = new BookShallowCopy("Book Name","Author", shallowChapters);
        BookShallowCopy clonedBookShallow1 = BookShallow1.clone();

        System.out.println("Original: " + BookShallow1);
        System.out.println("Cloned: " + clonedBookShallow1);

        System.out.println("Adding Chapter4 to original book");
        BookShallow1.getChapters().add("Chapter4");

        System.out.println("Original: " + BookShallow1);
        System.out.println("Cloned: " + clonedBookShallow1);

        List<String> deepChapters = new ArrayList<>();
        deepChapters.add("Chapter1");
        deepChapters.add("Chapter2");
        deepChapters.add("Chapter3");

        BookDeepCopy BookDeep1 = new BookDeepCopy("Book Name","Author", deepChapters);
        BookDeepCopy clonedBookDeep1 = BookDeep1.clone();

        System.out.println("Original: " + BookDeep1);
        System.out.println("Cloned: " + clonedBookDeep1);

        System.out.println("Adding Chapter4 to original book");
        BookDeep1.getChapters().add("Chapter4");

        System.out.println("Original: " + BookDeep1);
        System.out.println("Cloned: " + clonedBookDeep1);
    }
}
