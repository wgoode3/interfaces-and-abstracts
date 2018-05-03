public abstract class Drink 
{
    protected Boolean isEmpty;
    protected Double volume;
    protected Boolean isNewtonian;

    public Drink(Boolean isEmpty, Double volume, Boolean isNewtonian)
    {
        this.isEmpty = isEmpty;
        this.volume = volume;
        this.isNewtonian = isNewtonian;
    }

    public abstract void pour(Double volume);

    public abstract void consume();

    public static void main(String[] args)
    {
        // Drink d = new Drink();
    }

}