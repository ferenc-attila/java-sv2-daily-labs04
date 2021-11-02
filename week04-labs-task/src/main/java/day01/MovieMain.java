package day01;

public class MovieMain {

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 1996);

        movie.addActor(new Actor("Leonardo di Caprio", 1974));
        movie.addActor(new Actor("Anette Olson", 1989));
        movie.addActor(new Actor("Jack Doe", 1968));
        movie.addActor(new Actor("John Doe", 1959));

        System.out.println(movie.actorsInTheirTwenties());
    }


}
