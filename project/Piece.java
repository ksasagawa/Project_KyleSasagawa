public class Piece
{
	private String align;
	private String type;
	private int value;
	public Piece()
	{
		align = "";
		type = "";
		value = 0;
	}
	public Piece(String team, String t)
	{
		align = team;
		type = t;
		value = 0;
		if(!align.equals("Black")||!align.equals("White"))
			align  = "ERROR";
		if(!type.equals("K")||!type.equals("P")||!type.equals("Q")||!type.equals("R")||!type.equals("N")||!type.equals("B"))
			type = "ERROR";
		if(type.equals("P"))
			value = 1;
		else if(type.equals("B"))
			value = 2;
		else if(type.equals("N"))
			value = 3;
		else if(type.equals("R"))
			value = 4;
		else if(type.equals("Q"))
			value = 5;
		else if(type.equals("K"))
			value = 6;
	}
	public int getValue()
	{
		return value;
	}
	public boolean move(board b, String position1, String position2)
	{
		boolean valid;
		switch (value)
		{
			case 1: if(b.getPiece(position1.substring(0,1),position1.substring(1)).getValue()!=1
			&&((position1.substring(1).equals("2")&&position2.equals("5"+position1.substring(0,1)))
				||(position2.equals(position1.substring(String.valueOf(Integer.parseInt(position2.substring(0,1)))+position1.substring(0,1))
				)||))
				{}
		}
		return valid;
	}
}