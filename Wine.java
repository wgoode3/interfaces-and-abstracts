public class Wine extends Drink implements IsAlcoholic
{
    protected String color;

    public Wine(Boolean isEmpty, Double volume, String color)
    {
        super(isEmpty, volume, true);
        this.color = color;
    }

    public void pour(Double volume)
    {
        System.out.println(String.format("You poured %.2f of wine", volume));
    }

    public void consume()
    {
        System.out.println("Delicous and intoxicating");
        this.imbibe();
    }

    public void imbibe()
    {
        System.out.println("Do not operate heavy machinery after imbibing!");
    }

    public static void main(String[] args)
    {
        Wine wine = new Wine(false, 100.0, "red");
        wine.consume();
        wine.pour(50.0);
    }

}