package SE311LAB4.FRIDAY.Movies;


//Component

import java.util.ArrayList;

interface MovieTypes
{
    void add(MovieTypes e);
    void remove(MovieTypes e);
    public String getName();
    void display(int indent);



}

//Composite

class MovieSeries implements MovieTypes
{
    String movieSerieName;
    int count;

    ArrayList<MovieTypes> elements = new ArrayList<MovieTypes>();


    public MovieSeries(String movieSerieName)
    {
        this.movieSerieName = movieSerieName;
    }

    @Override
    public void add(MovieTypes e)
    {
         elements.add(e);
         count++;
    }

    @Override
    public void remove(MovieTypes e)
    {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getName() == e.getName()) {
                elements.remove(i);
                return;
            }
        }


    }

    @Override
    public String getName() {
        return movieSerieName;
    }



    @Override
    public void display(int indent)
    {

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).display(indent + 2);
        }

    }
}



//Leaf

class Movie implements MovieTypes
{
    String name;
    String director;
    int year;

    public Movie(String name, String director, int year)
    {
        this.name = name;
        this.director = director;
        this.year = year;
    }


    @Override
    public void add(MovieTypes e)
    {
        System.out.println("Cannot add a new element to a leaf");

    }

    @Override
    public void remove(MovieTypes e)
    {
        System.out.println("Cannot remove a element from a leaf");

    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void display(int indent)
    {
        for (int i= 0 ; i <= indent; i++)
        {
            System.out.println("-");
            System.out.println("Name of the Movie: "+name);
            System.out.println("Director of the Movie: "+director);
            System.out.println("Published year of the Movie: "+year);
        }

    }
}

class Client
{
    public static void main(String[] args)

    {
        MovieTypes root = new MovieSeries("Movies");

        MovieTypes action = new MovieSeries("Action");
        MovieTypes fantasy = new MovieSeries("Fantasy & Science Finction");

        MovieSeries johnWick = new MovieSeries("JohnWick");
        Movie movie1 = new Movie("JohnWick2","Chad Stahelski",2014);

        johnWick.add(movie1);
        action.add(johnWick);


        MovieSeries jamesBond = new MovieSeries("JohnWick");
        Movie movie2 = new Movie("Casino Royale","Sam Mendes",1953);

        jamesBond.add(movie2);
        action.add(jamesBond);


        root.display(1);












    }
}
