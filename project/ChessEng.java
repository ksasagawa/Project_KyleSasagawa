import java.util.Scanner;
public class ChessEng
{
	String name = "KS_Engine";
	public static void Arena_to_Engine()
	{
		Scanner input = new Scanner(System.in);
		while (true)
        {
			String UCI_In = input.nextLine();
            if ("uci".equals(UCI_In))
            {
                setUp();
            }
            else if (UCI_In.startsWith("setoption"))
            {
                setOption(UCI_In);
            }
            else if ("isready".equals(UCI_In))
            {
                ready();
            }
            else if ("ucinewgame".equals(UCI_In))
            {
                reset();
            }
            else if (UCI_In.startsWith("position"))
            {
                positionSet(UCI_In);
            }
            else if (UCI_In.startsWith("go"))
            {
                go();
            }
            else if (UCI_In.equals("quit"))
            {
                end();
            }
            else if ("print".equals(UCI_In))
            {
                print();
            }
        }
		public static void setUp()
		{
			System.out.println("id name" + name);
			System.out.println("id author Kyle Sasagawa");
			//PLACEHOLDER FOR OPTIONS RETURN LATER
			System.out.println("readyok")
		}
		public static void setOption(String options)
		{
			//PLACEHOLDER FOR OPTIONS RETURN LATER
		}
		public static void ready()
		{
			System.out.println("readyok");
		}
		public static void reset()
		{
			//clearBoard();
		}
		public static void positionSet(String moves)
		{
			
		}
    }
}