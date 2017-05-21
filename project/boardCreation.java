import java.util.Arrays;
import java.util.ArrayList;
/*
* PIECE=WHITE/black
* pawn=P/p
* kinght (horse)=N/n
* bishop=B/b
* rook (castle)=R/r
* Queen=Q/q
* King=K/k
*/
public class boardCreation
{
	public static String board[][] = new String[8][8];
	public static void createNEW()//create new chess board
	{
		
		for(int i = 0; i<8; i++)
		{
			switch (i)
			{
				case 0:board[0][i] = "r";
					break;
				case 1:board[0][i] = "n";
					break;
				case 2:board[0][i] = "b";
					break;
				case 3:board[0][i] = "q";
					break;
				case 4:board[0][i] = "k";
					break;
				case 5:board[0][i] = "b";
					break;
				case 6:board[0][i] = "n";
					break;
				case 7:board[0][i] = "r";
					break;
				default:board[0][i]= null;
					break; 
			}
		}
		for(int i = 0; i<8;i++)
		{
			board[1][i] = "p";
		}
		for(int i = 2;i<6;i++)
		{
			for(int y = 0; y<8;y++)
			{
				board[i][y] = " ";
			}
		}
		for(int i = 0; i<8; i++)
		{
			switch (i)
			{
				case 0:board[7][i] = "r";
					break;
				case 1:board[7][i] = "n";
					break;
				case 2:board[7][i] = "b";
					break;
				case 3:board[7][i] = "q";
					break;
				case 4:board[7][i] = "k";
					break;
				case 5:board[7][i] = "b";
					break;
				case 6:board[7][i] = "n";
					break;
				case 7:board[7][i] = "r";
					break;
				default:board[7][i]= null;
					break; 
			}
		}
		for(int i = 0; i<8;i++)
		{
			board[6][i] = "p";
		}
		System.out.println(Arrays.deepToString(board));
	}
	public static String convert(String xy)//will output the move notation in colum-row notation while mantaining previous notation (i.e e4e5 = 34 44)
	{
		String xyf ="";
		if(xy.substring(0,1).equals("a"))
			xyf="0"+xy.substring(1);
		if(xy.substring(0,1).equals("b"))
			xyf="1"+xy.substring(1);
		if(xy.substring(0,1).equals("c"))
			xyf="2"+xy.substring(1);
		if(xy.substring(0,1).equals("d"))
			xyf="3"+xy.substring(1);
		if(xy.substring(0,1).equals("e"))
			xyf="4"+xy.substring(1);
		if(xy.substring(0,1).equals("f"))
			xyf="5"+xy.substring(1);
		if(xy.substring(0,1).equals("g"))
			xyf="6"+xy.substring(1);
		if(xy.substring(0,1).equals("h"))
			xyf="7"+xy.substring(1);
		if(xy.substring(2,3).equals("a"))
			xyf=xy.substring(0,2)+"0"+xy.substring(3);
		if(xy.substring(2,3).equals("b"))
			xyf=xy.substring(0,2)+"1"+xy.substring(3);
		if(xy.substring(2,3).equals("c"))
			xyf=xy.substring(0,2)+"2"+xy.substring(3);
		if(xy.substring(2,3).equals("d"))
			xyf=xy.substring(0,2)+"3"+xy.substring(3);
		if(xy.substring(2,3).equals("e"))
			xyf=xy.substring(0,2)+"4"+xy.substring(3);
		if(xy.substring(2,3).equals("f"))
			xyf=xy.substring(0,2)+"5"+xy.substring(3);
		if(xy.substring(2,3).equals("g"))
			xyf=xy.substring(0,2)+"6"+xy.substring(3);
		if(xy.substring(2,3).equals("h"))
			xyf=xy.substring(0,2)+"7"+xy.substring(3);
		if(xy.substring(1,2).equals("1"))
			xyf=xy.substring(0,1)+"0"+xy.substring(2);
		if(xy.substring(1,2).equals("2"))
			xyf=xy.substring(0,1)+"1"+xy.substring(2);
		if(xy.substring(1,2).equals("3"))
			xyf=xy.substring(0,1)+"2"+xy.substring(2);
		if(xy.substring(1,2).equals("4"))
			xyf=xy.substring(0,1)+"3"+xy.substring(2);
		if(xy.substring(1,2).equals("5"))
			xyf=xy.substring(0,1)+"4"+xy.substring(2);
		if(xy.substring(1,2).equals("6"))
			xyf=xy.substring(0,1)+"5"+xy.substring(2);
		if(xy.substring(1,2).equals("7"))
			xyf=xy.substring(0,1)+"6"+xy.substring(2);
		if(xy.substring(1,2).equals("8"))
			xyf=xy.substring(0,1)+"7"+xy.substring(2);
		if(xy.substring(3).equals("1"))
			xyf=xy.substring(0,3)+"0";
		if(xy.substring(3).equals("2"))
			xyf=xy.substring(0,3)+"1";
		if(xy.substring(3).equals("3"))
			xyf=xy.substring(0,3)+"2";
		if(xy.substring(3).equals("4"))
			xyf=xy.substring(0,3)+"3";
		if(xy.substring(3).equals("5"))
			xyf=xy.substring(0,3)+"4";
		if(xy.substring(3).equals("6"))
			xyf=xy.substring(0,3)+"5";
		if(xy.substring(3).equals("7"))
			xyf=xy.substring(0,3)+"6";
		if(xy.substring(3).equals("8"))
			xyf=xy.substring(0,3)+"7";
		return xyf;
	}
	public static void move(String xy)//will replace the string at the piece that is moving with " " and replace the string at the place it is moving to the piece
	{
		String moving = convert(xy).substring(0,2);
		String movingTo = convert(xy).substring(2);
		if(moveIsValid(board[Integer.parseInt(moving.substring(0,1))][Integer.parseInt(moving.substring(1))],moving,movingTo))
		{
			board[Integer.parseInt(movingTo.substring(0,1))][Integer.parseInt(movingTo.substring(1))] = board[Integer.parseInt(moving.substring(0,1))][Integer.parseInt(moving.substring(1))];
			board[Integer.parseInt(moving.substring(0,1))][Integer.parseInt(moving.substring(1))] = " ";
		}
	}
	public static boolean moveIsValid(String piece,String moving,String movingTo)//switch statement that will read the piece and check for validity. Each if statement is reversed to return false is all the conditions are not met
	{
		switch(piece)
		{
		case "P":if((isPieceInWay(moving, movingTo, piece)&&moveIsInBoard(moving, movingTo)
					&&((moving.substring(0,1).equals("1")&&(movingTo.equals("2"+moving.substring(1))||movingTo.equals("3"+moving.substring(1))))//moving two spaces in the beginning
					||(movingTo.equals(Integer.toString(Integer.parseInt(moving.substring(0,1))+1)+moving.substring(1)))//moving any other way
					))
					||((board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1] != " ")&&(board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("p")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("n")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("r")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("k")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("q")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("b")))//capture left
					||(board[Integer.parseInt(movingTo.substring(0,1))-1][Integer.parseInt(movingTo.substring(1,2))+1] != " ")&&(board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("p")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("n")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("r")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("k")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("q")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("b")))//capture right
					{
						return false;
					}
			break;
		case "p":if((isPieceInWay(moving, movingTo, piece)&&moveIsInBoard(moving, movingTo)
					&&((moving.substring(0,1).equals("6")&&(movingTo.equals("5"+moving.substring(1))||movingTo.equals("4"+moving.substring(1))))//moving two spaces in the beginning
					||(movingTo.equals(Integer.toString(Integer.parseInt(moving.substring(0,1))-1)+moving.substring(1)))//moving any other way
					))
					||(board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1] != " "&&(board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("P")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("N")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("R")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("K")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("Q")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("B")))//capture left
					||(board[Integer.parseInt(movingTo.substring(0,1))-1][Integer.parseInt(movingTo.substring(1,2))+1] != " ")&&(board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("P")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("N")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("R")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("K")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("Q")||board[Integer.parseInt(movingTo.substring(0,1))+1][Integer.parseInt(movingTo.substring(1,2))+1].equals("B")))//capture right
					{
						return false;
					}
			break;
		case "N":if(!(moveIsInBoard(moving, movingTo)&&((Math.abs(Interger.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==3)&&(Math.abs(Interger.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==1))
			||((Math.abs(Interger.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==1)&&(Math.abs(Interger.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==3))))
			{
				return false;
			}
			break;
		case "n":if(!(moveIsInBoard(moving, movingTo)&&((Math.abs(Interger.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==3)&&(Math.abs(Interger.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==1))
			||((Math.abs(Interger.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==1)&&(Math.abs(Interger.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==3))))
			{
				return false;
			}
			break;
		case "B":if()
			break;
		case "b":if()
			break;
		case "R":if()
			break;
		case "r":if()
			break;
		case "Q":if()
			break;
		case "q":if()
			break;
		case "K":if(!(isPieceInWay(moving,movingTo,piece)&&(moveIsInBoard(moving, movingTo)&&((Math.abs(Integer.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==1)&&(Math.abs(Integer.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==1))
			||((Math.abs(Integer.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==1)&&(Math.abs(Integer.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==0))
			||((Math.abs(Integer.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==0)&&(Math.abs(Integer.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==1)))))
			{
				return false;
			}
			break;
		case "k":if(!(isPieceInWay(moving,movingTo,piece)&&((Math.abs(Integer.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==1)&&(Math.abs(Integer.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==1))
			||((Math.abs(Integer.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==1)&&(Math.abs(Integer.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==0))
			||((Math.abs(Integer.parseInt(movingTo.substring(0,1))-Integer.parseInt(moving.substring(0,1)))==0)&&(Math.abs(Integer.parseInt(movingTo.substring(1))-Integer.parseInt(moving.substring(1)))==1))))
			{
				return false;
			}
			break;
		default: return false;
		}
		return false;
	}
	public static boolean isPieceInWay(String moving, String movingTo, String piece)//checking if there is a piece in the way that is of the same color or otherwise
	{
		switch(piece)
		{
			case "P":for(int i = Interger.parseInt(moving.substring(0,1)); i<Integer.parseInt(movingTo.substring(0,1));i++
				break;
			case "p":
				break;
			case "N":
				break;
			case "n":
				break;
			case "B":
				break;
			case "b":
				break;
			case "R":
				break;
			case "r":
				break;
			case "Q":
				break;
			case "q":
				break;
			case "K":
				break;
			case "k":
				break;
			default:
				break;
		}
	}
	public static boolean moveIsInBoard(String moving, String movingTo)
	{
		if((0<=Integer.parseInt(moving.substring(0,1))<=8)&&(0<=Integer.parseInt(moving.substring(1))<=8)&&(0<=Integer.parseInt(movingTo.substring(0,1))<=8)&&(0<=Integer.parseInt(movingTo.substring(1))<=8))
			return true;
	}
}




























