//source: https://www.samouczekprogramisty.pl/wzorzec-projektowy-obserwator/
package observer1;

public class Main {
    public static void main(String[] args) {
        Blog myBlog = new Blog();
        Reader Paul = new Reader(myBlog);
        Reader Patrice = new Reader(myBlog);
        String myArticle1 = "<<This is the first article!>>";
        myBlog.publishArticle(myArticle1);

        Paul.update();
        System.out.println("^^ This is a forced reaction from reader.");

        String myArticle2 = "<<The second article is available>>";
        myBlog.publishArticle(myArticle2);
    }
}
