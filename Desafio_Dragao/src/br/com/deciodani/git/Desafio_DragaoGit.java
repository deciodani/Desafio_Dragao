/**
 * 
 */
package br.com.deciodani.git;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
/**
 * @author decio
 *
 */
public class Desafio_DragaoGit {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		  Scanner sc = new Scanner(System.in);
			int maxGuests = sc.nextInt();
			int heightMin = sc.nextInt();
			int heightMax = sc.nextInt();
	    
			int enteredGuests = 0;
	    
			List<Integer> guests = new ArrayList<Integer>();
	    
			while(sc.hasNext()) {
				guests.add(sc.nextInt());
			}
			
			List<Integer> guestsAllowed = guests.stream()
			.filter(g -> g >= heightMin)
			.filter(g -> g <= heightMax)
			.collect(Collectors.toList());

			enteredGuests = (guestsAllowed.size() < maxGuests) ? guestsAllowed.size() : maxGuests;
	    
			System.out.println(enteredGuests);
		
			sc.close();
		
		}

}
