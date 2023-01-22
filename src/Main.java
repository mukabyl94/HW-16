public class Main {
    public static void main(String[] args) {

        Shark shark = new Shark();
        Shark shark1 = new Shark();
        Shark shark2 = new Shark();
        Shark shark3 = new Shark();
        Shark shark4 = new Shark();
        Turtle turtle = new Turtle();
        Turtle turtle1 = new Turtle();
        Turtle turtle2 = new Turtle();
        Turtle turtle3 = new Turtle();
        Turtle turtle4 = new Turtle();
        Eagle eagle = new Eagle();
        Eagle eagle1 = new Eagle();
        Eagle eagle2 = new Eagle();
        Eagle eagle3 = new Eagle();
        Eagle eagle4 = new Eagle();

        Animal[] animals = {shark, shark1, shark2, shark3, shark4, turtle, turtle1, turtle2, turtle3,turtle4,
        eagle, eagle1, eagle2, eagle3, eagle4};

        for (Animal a : animals) {
            if (a instanceof Shark) {
                Shark.sharks = new Shark[]{(Shark) a};
                shark.attack();
            } else if (a.getClass().getName().equals("Turtle")) {
                Turtle.turtles = new Turtle[]{(Turtle) a};
                turtle.swim();
            } else {
                Eagle.eagles = new Eagle[]{(Eagle) a};
                eagle.fly();
            }
        }
    }
}