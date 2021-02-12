package game;

import exceptions.GameException;

/**
 *  A class representing the Josephus circle
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class JosephusCircle
{
	//fields go here...
	private JosephusNode head;
	private JosephusNode tail;
	private JosephusNode current;
	private int size;
	private int playerCount;

	/**
	 * Creates a new JosephusCircle Object
	 * with the maximum players given
	 *
	 * @param playerCount the maximum number of players that can play in this circle
	 */
	public JosephusCircle(int playerCount)
	{
		//Creates a new JosephusCircle object with the maximum players given.
		this.playerCount = playerCount;
	}

	/**
	 * Adds a new player to the game from left-to-right in the internal linked list.
	 *
	 * @param player the new player name
	 * @throws GameException thrown when the maximum number of players has already been reached and this method is invoked
	 */
	public void addPlayer(String player)
	{
		//Adds a new player to the game from left-to-right in the 
		//internal linked list.
		if (head==null)
		{
			head = tail = new JosephusNode(player);
			current = head;
		}
		else if (size != playerCount)
		{
			tail.setNext(new JosephusNode(player));
			tail.getNext().setPrev(tail);
			tail = tail.getNext();
			tail.setNext(head);
			head.setPrev(tail);
		}
		else if (size >= playerCount)
		{
			throw new GameException("Maximum number of players have been reached!");
		}
		size++;
	}

	/**
	 * Moves the current player (the cursor) from the current position the given number of steps to the left or right
	 *
	 * @param direction which direction to move the cursor
	 * @param steps how many steps to move the cursor
	 * @return the player the cursor ends up on after moving
	 */
	public String moveCursor(Direction direction, int steps)
	{
		//Moves the current player (the cursor) from the current 
		//position the given number of steps to the left or right

		if (direction.equals(Direction.LEFT))
		{
			for (int i = 0; i < steps; i++)
			{
				current = current.getPrev();
			}
			return current.getName(); // return player name
		}
		else if (direction.equals(Direction.RIGHT))
		{
			for (int i = 0; i < steps; i++)
			{
				current = current.getNext();
			}
			return current.getName();
		}
		return "invalid direction";
	}

	/**
	 * Removes the player at the cursor position from the circle.
	 *
	 * @param direction moves the cursor one position to the left or right depending on the direction
	 */
	public void removeAtCursor(Direction direction)
	{
		//Removes the player at the cursor position from the circle.
		if (head == null)
		{
			throw new GameException("Cannot remove from empty circle!");
		}
		else if (direction.equals(Direction.LEFT))
		{
			current = current.getPrev();
			current.getNext().getNext().setPrev(current);
			current.setNext(current.getNext().getNext());
			size--;
		}
		else if (direction.equals(Direction.RIGHT))
		{
			current = current.getNext();
			current.getPrev().getPrev().setNext(current);
			current.setPrev(current.getPrev().getPrev());
			size--;
		}
	}

	/**
	 * Returns a string representing the internal state of the circle, with the following format:
	 *
	 * <-- Player A <--> Player B <--> Player C <--> Player D -->
	 *
	 * @return a string representation of the circle of players
	 */
	public String getCircle()
	{
		//Returns a string representing the internal state of the circle, 
		//with the following format:
		//<-- Player A <--> Player B <--> Player C <--> Player D -->

		if (head == null)
		{
			return "No Players!";
		}
		else
		{
			String result = "<-- ";
			JosephusNode tempCurrent = head;

			for (int i = 0; i < size; i++)
			{
				if (current == tempCurrent)
				{
					result += tempCurrent.getName().toUpperCase();
				}
				else
				{
					result += tempCurrent.getName();
				}
				if (tempCurrent.getNext() != head)
				{
					result += " <--> ";
				}
				tempCurrent = tempCurrent.getNext();
			}
			return result + " --> ";
		}
	}

	/**
	 * Returns true if the game is over. That is, this method will return true if only one player remains in the circle.
	 *
	 * @return true if game over, otherwise false
	 */
	public boolean isGameOver()
	{
		//Returns true if the game is over. That is, this method will 
		//return true if only one player remains in the circle.
		if (current.getNext() == current && current.getPrev() == current)
		{
			return true;
		}
		return false;
	}
}
