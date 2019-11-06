public class Colors
{
    public static void main(String[] args) {

        String text = "Каждый охотник желает знать, где сидит фазан";

        String colors[] = text.split(",?\\s+");

        for(int i = (colors.length - 1); i >= 0; i--)
        {
            System.out.println(colors[i]);
        }

        System.out.println("или");

        for(int i = 0; i < colors.length; i++)
        {
            System.out.println(colors[(colors.length - 1) - i]);
        }
    }
}
