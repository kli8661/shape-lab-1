public abstract class shape {
    private String type;

    public Shape(String type)
    {
        this.type = type;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString()
    {
        return "I am a " + type + ".";
    }

    public class ACirc extends Shape
    {
        private int Rad;

        public ACirc(int side)
        {
            super("Acirc");
            this.radius = radius;
        }
    }
}
