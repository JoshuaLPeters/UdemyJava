//package PolymorphismExercise;
//
//class Movie{
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//    public String plot(){
//        return "No Plot here";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie {
//    public Jaws(){
//        super("Jaws");
//    }
//    @Override
//    public String plot(){
//        return "A shark eats a lot of people";
//    }
//}
//
//class IndependenceDay extends Movie{
//    public IndependenceDay(){
//        super("Independence Day");
//    }
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over planet Earth";
//    }
//}
//
//class MazeRunner extends Movie{
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//    @Override
//    public String plot() {
//        return "Escape a maze";
//    }
//}
//
//class StarWars extends Movie{
//    public StarWars() {
//        super("Star Wars");
//    }
//    @Override
//    public String plot() {
//        return "The Jedi versus the Sith";
//    }
//}
//
//class ForgettableMovie extends Movie{
//    public ForgettableMovie(){
//        super("Forgettable");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        for(int i = 0; i<11; i++){
//            Movie movie = randomMovie();
//            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
//        }
//    }
//
//    public static Movie randomMovie(){
//        int randomNumber = (int) (Math.random() *5) +1;
//        System.out.println("Random number was: " + randomNumber);
//        switch(randomNumber){
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new ForgettableMovie();
//        }
//        return null;
//    }
//}