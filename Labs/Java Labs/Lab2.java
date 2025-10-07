package lab3;

class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private double duration;
    private int year;
    private String category;
    private final String movieId;
    private static int moviesCount = 0;

    // Mandatory fields constructor
    public Movie(String movieName, String producedBy) {
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }

    // Full constructor
    public Movie(String movieName, String producedBy, String directedBy, double duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String getMovieId() {
        return movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String showDetails() {
        return "Movie ID: " + movieId +
               ", Name: " + movieName +
               ", Produced By: " + producedBy +
               ", Directed By: " + directedBy +
               ", Duration: " + duration +
               ", Year: " + year +
               ", Category: " + category;
    }
}

// Subclass 1
class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    public SpecialMovie(String movieName, String producedBy, String directedBy, double duration, int year,
                        String category, String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    @Override
    public String showDetails() {
        return super.showDetails() +
               ", Sound Effects: " + soundEffectsTechnology +
               ", Visual Effects: " + visualEffectsTechnology;
    }
}

// Subclass 2
class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy, String directedBy, double duration, int year,
                              String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails() +
               ", Country: " + country +
               ", Language: " + language;
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Hello", "XYZ Productions", "John", 2.5, 2023, "Action");
        System.out.println(m1.showDetails());
        System.out.println("Movie ID: " + m1.getMovieId());
        System.out.println("Total Movies: " + Movie.getMoviesCount());

        SpecialMovie s1 = new SpecialMovie("Avatar", "20th Century Fox", "James Cameron", 3.1, 2022, "Sci-Fi",
                                           "Dolby Atmos", "CGI");
        System.out.println(s1.showDetails());

        InternationalMovie i1 = new InternationalMovie("RRR", "DVV Entertainments", "Rajamouli", 3.2, 2022,
                                                       "Action", "India", "Telugu");
        System.out.println(i1.showDetails());
    }
}
