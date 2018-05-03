public class Water extends Drink
{
    protected String color;

    public Water(Boolean isEmpty, Double volume, String color)
    {
        super(isEmpty, volume, true);
        this.color = color;
    }

    public void pour(Double volume)
    {
        System.out.println(String.format("You poured %.2f of water", volume));
    }

    public void consume(){
        System.out.println("Clear and refreshing, yep it's water");
    }

    public static void main(String[] args)
    {
        Water water = new Water(false, 100.0, "clear");
        water.consume();
        water.pour(50.0);
        if (water instanceof Drink)
        {
            System.out.println("Yes it's a drink");
        }
        // if (water instanceof Wine)
        // {
        //     System.out.println("No miracles only Java");
        // }
    }

}