public class Colors
{
    public static void main(String[] args) {

        String colors[] = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet"};

        for(int i = (colors.length - 1); i >= 0; i--)
        {
            System.out.println(colors[i]);
        }

        System.out.println("или");

        for(int j = 0; j < colors.length; j++)
        {
            System.out.println(colors[6 - j]);
        }
    }
}
