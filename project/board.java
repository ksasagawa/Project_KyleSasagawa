import java.util.List;
import java.util.ArrayList;
public class board
{
	private Piece[][] set;
	public board()
	{
		for(int x = 0;x<8;x++)
		{
			for(int y = 0;y<8;y++)
				set[x][y] = null;
		}
	}
	public Piece[][] getBoard()
	{
		return set;
	}
	public Piece getPiece(int x, int y)
	{
		return set[y][x];
	}
	public void turn(String input)
	{
		String fixedinputpt1;
		String fixedinputpt2;
		if(input.substring(0,1).equals("a"))
			fixedinputpt1 = input.substring(1,2)+"1";
		if(input.substring(0,1).equals("b"))
			fixedinputpt1 = input.substring(1,2)+"2";
		if(input.substring(0,1).equals("c"))
			fixedinputpt1 = input.substring(1,2)+"3";
		if(input.substring(0,1).equals("d"))
			fixedinputpt1 = input.substring(1,2)+"4";
		if(input.substring(0,1).equals("e"))
			fixedinputpt1 = input.substring(1,2)+"5";
		if(input.substring(0,1).equals("f"))
			fixedinputpt1 = input.substring(1,2)+"6";
		if(input.substring(0,1).equals("g"))
			fixedinputpt1 = input.substring(1,2)+"7";
		if(input.substring(0,1).equals("h"))
			fixedinputpt1 = input.substring(1,2)+"8";
		if(input.substring(3,4).equals("a"))
			fixedinputpt2 = input.substring(5)+"1";
		if(input.substring(3,4).equals("b"))
			fixedinputpt2 = input.substring(5)+"2";
		if(input.substring(3,4).equals("c"))
			fixedinputpt2 = input.substring(5)+"3";
		if(input.substring(3,4).equals("d"))
			fixedinputpt2 = input.substring(5)+"4";
		if(input.substring(3,4).equals("e"))
			fixedinputpt2 = input.substring(5)+"5";
		if(input.substring(3,4).equals("f"))
			fixedinputpt2 = input.substring(5)+"6";
		if(input.substring(3,4).equals("g"))
			fixedinputpt2 = input.substring(5)+"7";
		if(input.substring(3,4).equals("h"))
			fixedinputpt2 = input.substring(5)+"8";
		move(fixedinputpt1, fixedinputpt2);
	}
}